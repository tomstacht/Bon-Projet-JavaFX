package com.example.bonprojetjavafx;

import classes.Appartement;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.PixelBuffer;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.DatePicker;

public class ControllerAdminAjouter {

    BaseDeDonnee pourlappart = new BaseDeDonnee();
    Appartement ajoutappart= new Appartement();
    @FXML
    private TextField NomAppartAjoutTextField;
    @FXML
    private TextField PrixAppartAjoutTextField;
    @FXML
    private TextField LieuAppartAjoutTextField;
    @FXML
    private TextField NumEtageAppartAjoutTextField;
    @FXML
    private TextField BalconAppartAjoutTextField;
    @FXML
    private TextField DistCentreAppartAjoutTextField;
    @FXML
    private TextField NBChambreAppartAjoutTextField;
    @FXML
    private TextField NBSalleDeBainAppartAjoutTextField;
    @FXML
    private TextField SurfaceAppartAjoutTextField;
    @FXML
    private TextField NBPersoAppartAjoutTextField;
    @FXML
    private TextField NoteClientAppartAjoutTextField;
    @FXML
    private TextField WifiAppartAjoutTextField;
    @FXML
    private TextField ClimAppartAjoutTextField;
    @FXML
    private TextField FumeurAppartAjoutTextField;
    @FXML
    private TextField AnnimauxAppartAjoutTextField;
    @FXML
    private TextField ParkingAppartAjoutTextField;

    public void AjouterAppartement(ActionEvent event) {
        ajoutappart.setNom(NomAppartAjoutTextField.getText());
        System.out.println(ajoutappart.getNom());
        ajoutappart.setPrix(Integer.parseInt(PrixAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getPrix());
        ajoutappart.setLieu(LieuAppartAjoutTextField.getText());
        System.out.println(ajoutappart.getLieu());
        ajoutappart.setEtage(Integer.parseInt(NumEtageAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getEtage());
        ajoutappart.setDistanceCentre(Float.parseFloat(DistCentreAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getDistanceCentre());
        ajoutappart.setM2(Integer.parseInt(SurfaceAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getM2());
        ajoutappart.setNbPersonnes(Integer.parseInt(NBPersoAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getNbPersonnes());
        ajoutappart.setNote(Float.parseFloat(NoteClientAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getNote());
        ajoutappart.setWifi(Boolean.parseBoolean(WifiAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isWifi());
        ajoutappart.setClim(Boolean.parseBoolean(ClimAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isClim());
        ajoutappart.setFumeur(Boolean.parseBoolean(FumeurAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isFumeur());
        ajoutappart.setAnimaux(Boolean.parseBoolean(AnnimauxAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isAnimaux());
        ajoutappart.setParking(Boolean.parseBoolean(ParkingAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isParking());
        ajoutappart.setBalcon(Boolean.parseBoolean(BalconAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.isBalcon());
        ajoutappart.setNbSDB(Integer.parseInt(NBSalleDeBainAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getNbSDB());
        ajoutappart.setNbChambres(Integer.parseInt(NBChambreAppartAjoutTextField.getText()));
        System.out.println(ajoutappart.getNbChambres());
        pourlappart.ajoutligneAppart(ajoutappart);
    }

    @FXML
    private void retourMenuPrincipal(ActionEvent event) throws IOException{
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
    private void retourChoixAction(ActionEvent event) throws IOException{
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
    private void retourChoixHebergement(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-ChoixHebergement-admin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }


}
