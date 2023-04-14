package com.example.bonprojetjavafx;
import java.sql.*;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1440, 800);
        stage.setTitle("GetAway.com");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        BaseDeDonnee b1 = new BaseDeDonnee();

        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection établie...");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        launch();
    }
}
