package com.example.gestionhopitalfinal;

import com.example.gestionhopitalfinal.model.db.DatabaseManager;
import com.example.gestionhopitalfinal.model.db.Queries;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layout/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws SQLException {
       /* DatabaseManager databaseManager = new DatabaseManager();
        Statement st = databaseManager.getCn().createStatement();
        ResultSet rt = st.executeQuery(Queries.getAllFrom("Patient"));
        while(rt.next()){
            System.out.println(rt.getString("Name"));
        }*/

        launch();
    }
}