package com.example.gestionhopitalfinal.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML BorderPane mainContainer;
    @FXML
    AnchorPane anchorPane;
    @FXML
    TextField textField;
    @FXML
    TabPane tabPane;
    @FXML
    Tab tabAbout, tabCal, tabDoc, tabVisit;
    @FXML
    VBox vboxLeft;
    @FXML Pane paneCenter, paneDesc;
    @FXML
    ImageView btnExit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        theStyler();
        closeStage();
    }
    public void theStyler(){
        mainContainer.setStyle(
                "-fx-background-radius:15;" +
                        "-fx-boreder-radius: 15;");
        anchorPane.setStyle("-fx-background-color: #ffffff;" +
                "-fx-background-radius: 15;");
        vboxLeft.setStyle("-fx-background-color: linear-gradient( to top right, #02CAFE, #0182FE);" +
                "-fx-background-bottom-left-radius: 15;");
        tabPane.setStyle("-fx-background-color: #ffffff;" +
                "-fx-background-radius: 15;"+
                "-fx-border: 1;"+
                "-fx-border-radius: 15");
        tabAbout.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-text-fill: #02cafe;" +
                "-fx-padding-bottom: 25px;");
        tabDoc.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-text-fill: #02CAFE;");
        tabCal.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-text-fill: #02cafe;");
        tabVisit.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-text-fill: #02cafe;");
        paneCenter.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-background-radius: 10;");
        textField.setStyle("-fx-background-color: #F5F8FD;" +
                "-fx-border-size: 1;" +
                "-fx-border-bottom: #02CAFE;" +
                "-fx-text-fill: #c0c0c0;");
        paneDesc.setStyle("-fx-background-color: #ffffff;" +
                "-fx-background-radius: 10;");

    }
    public void closeStage(){
        btnExit.setOnMouseClicked(mouseEvent -> {
            Scene scene = mainContainer.getScene();
            Stage stage = (Stage) scene.getWindow();
            stage.close();
        });
    }
}