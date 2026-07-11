module bd.edu.seu.foodgo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens bd.edu.seu.foodgo to javafx.fxml;
    exports bd.edu.seu.foodgo;
}