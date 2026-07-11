package bd.edu.seu.foodgo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    public Label emailLabel;

    @FXML
    public void logoutButtonEvent() {
        HelloApplication.changeScene("SignIN");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Welcome to the Dashboard");
    }

    public void historyButtonEvent(ActionEvent actionEvent) {
    }

    public void placeOrderEvent(ActionEvent actionEvent) {
    }
}