package bd.edu.seu.foodgo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SignIN.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 817, 475);
        stage.setTitle("FoodGo!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
            Scene scene = new Scene(fxmlLoader.<Parent>load(), 817, 475);
            stage.setScene(scene);
        }
        catch (IOException ex) {
            System.out.println("Failed to load fxml file.");
            ex.printStackTrace();
        }
    }
}