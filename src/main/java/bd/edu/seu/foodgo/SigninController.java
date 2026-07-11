package bd.edu.seu.foodgo;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

import static bd.edu.seu.foodgo.HelloApplication.changeScene;

public class SigninController {
    @FXML
    public TextField emailField;

    @FXML
    public PasswordField passwordField;


    @FXML
    public void signinEvent() {

        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Please enter email and password.");
            return;
        }

        boolean found = false;
        try {
            RandomAccessFile raf = new RandomAccessFile("users.txt", "r");
            String line;

            while ((line = raf.readLine()) != null) {

                String[] user = line.split(",");
                String savedEmail = user[1];
                String savedPassword = user[2];

                if (email.equals(savedEmail) && password.equals(savedPassword)) {
                    found = true;
                    break;
                }
            }

            raf.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        if (found) {
            System.out.println("Login Successful!");
            changeScene("Dashboard");
        } else {
            System.out.println("Invalid Email or Password!");
        }
    }

    @FXML
    public void goToSignup() {
        changeScene("SignUP");

    }
}