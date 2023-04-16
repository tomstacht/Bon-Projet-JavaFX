package com.example.bonprojetjavafx;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ControllerSupprimerHotel {

    private BaseDeDonnee b1 = new BaseDeDonnee();
    @FXML
    private void retourMenuPrincipal(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }

    @FXML
    private void retourChoixAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-choix-admin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }

    @FXML
    private void retourChoixHebergement(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-admin-supprimer-choix.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Supprimer/Choix.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }

    @FXML
    private Button monBouton;
    @FXML
    private Label affichertitreHotel;

    @FXML
    private void handleClick(ActionEvent event) {
        scrollPane(event);
    }

    public void scrollPane(ActionEvent event)  {
        b1.initHebergements();
        System.out.println("fff");

        for(int i=0; i<b1.getListeHotel().size();i++){
            HBox hotel = new HBox();
            //String image = b1.getListeHotel().get(i).getImage();
            //hotel.setAlignment(Pos.CENTER_LEFT);

            //Label titre = new Label();
            String titre = b1.getListeHotel().get(i).getNom();
            affichertitreHotel.setText(titre);
            hotel.getChildren().addAll(affichertitreHotel);
            System.out.println(titre);

        }
    }

}



