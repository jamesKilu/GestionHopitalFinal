module com.example.gestionhopitalfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.jfoenix;


    opens com.example.gestionhopitalfinal to javafx.fxml;
    exports com.example.gestionhopitalfinal;
    exports com.example.gestionhopitalfinal.controller;
    opens com.example.gestionhopitalfinal.controller to javafx.fxml;
}