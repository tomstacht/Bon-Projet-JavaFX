package com.example.bonprojetjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSupprimerHotel implements Initializable {

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

    /*@FXML
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
           // hotel.getChildren().addAll(titre);
            affichertitreHotel.setText(titre);

            System.out.println(titre);
        }
    }*/

    @FXML
    private VBox inteVbox;

    /*public void initialize(){
        b1.initHebergements();
        for(int i=0; i<b1.getListeHotel().size();i++){
            Label titre = new Label();
            titre.setText(b1.getListeHotel().get(i).getImage());
            titre.setTextFill(Color.BLACK);
            inteVbox.getChildren().addAll(titre);
        }
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        b1.initHebergements();
        for(int i=0; i<b1.getListeHotel().size();i++){
            Label titre = new Label();
            titre.setText(b1.getListeHotel().get(i).getImage());
            titre.setTextFill(Color.BLACK);
            titre.setPadding(new Insets(80,0,10,0));
            inteVbox.getChildren().addAll(titre);

            ScrollPane paneTest = new ScrollPane();
            HBox BoxTest = new HBox();
            paneTest.setContent(BoxTest);
            paneTest.setMinHeight(310);
            paneTest.setStyle("fx-background-color:blue");
            paneTest.setFitToWidth(true);

            BoxTest.setFillHeight(true);
            BoxTest.setStyle("fx-background-color:red");
            BoxTest.setSpacing(15);
            inteVbox.getChildren().addAll(paneTest);

        }
    }
}



