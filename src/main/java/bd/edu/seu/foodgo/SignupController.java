package bd.edu.seu.foodgo;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SignupController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void signupEvent() {

        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill all fields.");
            return;
        }
        try {
            RandomAccessFile raf = new RandomAccessFile("users.txt", "rw");
            raf.seek(raf.length());

            raf.writeBytes(name + "," + email + "," + password + "\n");
            raf.close();
            System.out.println("Signup Successful!");
            HelloApplication.changeScene("SignIN");

        } catch (IOException e) {
            System.out.println("Error saving user.");
            e.printStackTrace();
        }
    }

    @FXML
    public void goToSignin() {
        HelloApplication.changeScene("SignIN");

    }
}