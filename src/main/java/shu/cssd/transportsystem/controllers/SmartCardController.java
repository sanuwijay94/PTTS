package shu.cssd.transportsystem.controllers;

import shu.cssd.transportsystem.foundation.BaseModel;
import shu.cssd.transportsystem.foundation.exceptions.ModelNotFoundException;
import shu.cssd.transportsystem.foundation.types.PaymentType;
import shu.cssd.transportsystem.foundation.types.TransactionType;
import shu.cssd.transportsystem.models.Payment;
import shu.cssd.transportsystem.models.SmartCard;
import shu.cssd.transportsystem.models.Transaction;
import shu.cssd.transportsystem.models.User;
import shu.cssd.transportsystem.models.collections.SetOfPayments;
import shu.cssd.transportsystem.models.collections.SetOfSmartCards;

public class SmartCardController
{
	
	private SetOfSmartCards smartCards = new SetOfSmartCards();

	/**
	 * Get the smart card of a user.
	 *
	 * @param user
	 * @return
	 */
	public SmartCard find(User user)
	{
		for (BaseModel model: smartCards.all())
		{
			SmartCard smartCard = (SmartCard) model;
			
			if (smartCard.userId.equals(user.id))
			{
				return smartCard;
			}
		}
		
		return null;
	}
	
	/**
	 * Update the smart card
	 *
	 * @param card
	 * @return
	 */
	public boolean update(SmartCard card)
	{
		try
		{
			return smartCards.findByIdAndUpdate(card.id, card);
			
		} catch (ModelNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * Remove the smart card from the collection instance
	 *
	 * @param card
	 */
	public void remove(SmartCard card)
	{
		try
		{
			this.smartCards.remove(card.id);
		} catch (ModelNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Top up balance of the smart card
	 *
	 * @param card
	 * @param amount
	 * @return
	 */
	public float topUpBalance(SmartCard card, float amount)
	{
		UserController userController = UserController.getInstance();

		Transaction transaction = (new TransactionController())
				.makeTransaction(userController.currentUser, PaymentType.CARD, TransactionType.ADD, amount);

		return userController.currentUser.getCard().balance;
	}
	
}
