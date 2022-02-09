module com.steuerrechner.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.steuerrechner.demo to javafx.fxml;
    exports com.steuerrechner.demo;
}