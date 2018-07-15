package shu.cssd.transportsystem.views.tokenMachine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private void ticketsButtonClick(MouseEvent event) throws IOException {
        Parent ticketsParent = FXMLLoader.load(getClass().getResource("/tokenMachine/smartcard/smartcard.fxml"));
        Scene ticketsScene = new Scene(ticketsParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(ticketsScene);
        window.show();
    }
}
