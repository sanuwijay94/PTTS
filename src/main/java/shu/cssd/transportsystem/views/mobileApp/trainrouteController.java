package shu.cssd.transportsystem.views.mobileApp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class trainrouteController {
    @FXML
    private void paymentButtonClick(MouseEvent event) throws IOException {
        Parent paymentParent = FXMLLoader.load(getClass().getResource("/mobileApp/payment/Payment.fxml"));
        Scene paymentScene = new Scene(paymentParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(paymentScene);
        window.show();
    }

    @FXML
    private void profileButtonClick(MouseEvent event) throws IOException {
        Parent profileParent = FXMLLoader.load(getClass().getResource("/mobileApp/profile/profile.fxml"));
        Scene profileScene = new Scene(profileParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(profileScene);
        window.show();
    }

    @FXML
    private void backButtonClick(MouseEvent event) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("/mobileApp/route/route.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();
    }

    @FXML
    private void routeButtonClick(MouseEvent event) throws IOException {
        Parent routeParent = FXMLLoader.load(getClass().getResource("/mobileApp/route/route.fxml"));
        Scene routeScene = new Scene(routeParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(routeScene);
        window.show();
    }

    @FXML
    private void bookTicketButtonClick(MouseEvent event) throws IOException {
        Parent bkParent = FXMLLoader.load(getClass().getResource("/mobileApp/bookticket/bookticket.fxml"));
        Scene bkScene = new Scene(bkParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(bkScene);
        window.show();
    }

    @FXML
    private void journeyButtonClick(MouseEvent event) throws IOException {
        Parent journeyParent = FXMLLoader.load(getClass().getResource("/mobileApp/journey/journey.fxml"));
        Scene journeyScene = new Scene(journeyParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(journeyScene);
        window.show();
    }
}
