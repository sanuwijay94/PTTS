package shu.cssd.transportsystem.views.mobileApp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class TimetableController {

    @FXML
    private void backButtonClick(MouseEvent event) throws IOException {
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("/mobileApp/dashboard/Dashboard.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();
    }

    @FXML
    private void busRouteButtonClick(MouseEvent event) throws IOException {
        Parent busParent = FXMLLoader.load(getClass().getResource("/mobileApp/busroute/busroute.fxml"));
        Scene busScene = new Scene(busParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(busScene);
        window.show();
    }


    @FXML
    private void trainRouteButtonClick(MouseEvent event) throws IOException {
        Parent trainParent = FXMLLoader.load(getClass().getResource("/mobileApp/trainroute/trainroute.fxml"));
        Scene trainScene = new Scene(trainParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(trainScene);
        window.show();
    }

    @FXML
    private void metroRouteButtonClick(MouseEvent event) throws IOException {
        Parent metroParent = FXMLLoader.load(getClass().getResource("/mobileApp/metroroute/metroroute.fxml"));
        Scene metroScene = new Scene(metroParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(metroScene);
        window.show();
    }

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
    private void journeyButtonClick(MouseEvent event) throws IOException {
        Parent journeyParent = FXMLLoader.load(getClass().getResource("/mobileApp/journey/journey.fxml"));
        Scene journeyScene = new Scene(journeyParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(journeyScene);
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
}
