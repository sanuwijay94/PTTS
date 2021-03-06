package shu.cssd.transportsystem.views.tokenMachine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewCardController {

    @FXML
    private void backButtonClick(MouseEvent event) throws IOException {
        Parent smcParent = FXMLLoader.load(getClass().getResource("/tokenMachine/smartcard/smartcard.fxml"));
        Scene smcScene = new Scene(smcParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(smcScene);
        window.show();
    }

    @FXML
    private void cashPaymentButtonClick(MouseEvent event) throws IOException {
        Parent cashParent = FXMLLoader.load(getClass().getResource("/tokenMachine/cashpayment/cashpayment.fxml"));
        Scene cashScene = new Scene(cashParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(cashScene);
        window.show();
    }
}
