module com.example.helloworldapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldapp to javafx.fxml;
    exports com.example.helloworldapp;
}