package com.example.bonprojetjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ControllerSupprimerHotel{

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



    /*public void initialize(){
        b1.initHebergements();
        for(int i=0; i<b1.getListeHotel().size();i++){
            Label titre = new Label();
            titre.setText(b1.getListeHotel().get(i).getImage());
            titre.setTextFill(Color.BLACK);
            inteVbox.getChildren().addAll(titre);
        }
    }*/
    /*@FXML
    private VBox inteVbox;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        b1.initHebergements();
        for(int i=0; i<b1.getListeHotel().size();i++){
            ImageView imageView = new ImageView();

            //Image image = new Image("/Users/tomstachtchenko/Documents/ECE INGE3/SEMESTRE 2/PROJET INFO/Bon-Projet-JavaFX/LogoGetAway.png");
            titre.setText(b1.getListeHotel().get(i).getImage());

            /*imageView.setImage(image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(200);

            //Pane PaneTest = new Pane();
            inteVbox.getChildren().addAll(imageView);


            /*Label image = new Label();
            Pane PaneTest = new Pane();
            PaneTest.setPadding(new Insets(80,0,0,0));
            //image.setText(b1.getListeHotel().get(i).getImage());
            inteVbox.getChildren().addAll(PaneTest);*/

            /*Label titre = new Label();
            titre.setText(b1.getListeHotel().get(i).getImage());
            titre.setTextFill(Color.BLACK);
            titre.setPadding(new Insets(80,0,0,0));
            inteVbox.getChildren().addAll(titre);

            ScrollPane paneTest = new ScrollPane();
            HBox BoxTest = new HBox();
            paneTest.setContent(BoxTest);
            paneTest.setMinHeight(100);
            //paneTest.setStyle(String.valueOf(Color.BLUE));
            paneTest.setFitToWidth(true);

            BoxTest.setFillHeight(true);
            //BoxTest.setStyle(String.valueOf(Color.RED));
            BoxTest.setSpacing(15);
            inteVbox.getChildren().addAll(paneTest);*/
}




