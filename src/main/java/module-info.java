module com.example.gsondemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.gsondemo to javafx.fxml, com.google.gson;
    exports com.example.gsondemo;
}
