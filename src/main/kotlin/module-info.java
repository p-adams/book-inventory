module com.example.bookinventory {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.graphics;


    opens com.example.bookinventory to javafx.fxml;
    exports com.example.bookinventory;
}