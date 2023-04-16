package com.example.bonprojetjavafx;
import classes.Villa;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
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

public class ControllerAjouterVilla {
    BaseDeDonnee pourlavilla = new BaseDeDonnee();
    Villa ajoutvilla = new Villa();
    @FXML
    private TextField NomVillaAjoutTextField;
    @FXML
    private TextField PrixVillaAjoutTextField;
    @FXML
    private TextField LieuVillaAjoutTextField;
    @FXML
    private TextField PiscineVillaAjoutTextField;
    @FXML
    private TextField DistMerVillaAjoutTextField;
    @FXML
    private TextField DistCentreVillaAjoutTextField;
    @FXML
    private TextField NBChambreVillaAjoutTextField;
    @FXML
    private TextField NBSalleDeBainVillaAjoutTextField;
    @FXML
    private TextField SurfaceVillaAjoutTextField;
    @FXML
    private TextField NBPersoVillaAjoutTextField;
    @FXML
    private TextField NoteClientVillaAjoutTextField;
    @FXML
    private TextField WifiVillaAjoutTextField;
    @FXML
    private TextField ClimVillaAjoutTextField;
    @FXML
    private TextField FumeurVillaAjoutTextField;
    @FXML
    private TextField AnnimauxVillaAjoutTextField;
    @FXML
    private TextField ParkingVillaAjoutTextField;

    public void AjouterVilla(ActionEvent event) {

        ajoutvilla.setNom(NomVillaAjoutTextField.getText());
        System.out.println(ajoutvilla.getNom());
        ajoutvilla.setPrix(Integer.parseInt(PrixVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getPrix());
        ajoutvilla.setLieu(LieuVillaAjoutTextField.getText());
        System.out.println(ajoutvilla.getLieu());
        ajoutvilla.setPiscine(Boolean.parseBoolean(PiscineVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isPiscine());
        ajoutvilla.setDistance_mer(Float.parseFloat(DistMerVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getDistance_mer());
        ajoutvilla.setDistanceCentre(Float.parseFloat(DistCentreVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getDistanceCentre());
        ajoutvilla.setDistanceCentre(Float.parseFloat(NBChambreVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getDistanceCentre());
        ajoutvilla.setNbChambres(Integer.parseInt(NBSalleDeBainVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getNbChambres());
        ajoutvilla.setM2(Integer.parseInt(SurfaceVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getM2());
        ajoutvilla.setNbPersonnes(Integer.parseInt(NBPersoVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getNbPersonnes());
        ajoutvilla.setNote(Float.parseFloat(NoteClientVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.getNote());
        ajoutvilla.setWifi(Boolean.parseBoolean(WifiVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isWifi());
        ajoutvilla.setClim(Boolean.parseBoolean(ClimVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isClim());
        ajoutvilla.setFumeur(Boolean.parseBoolean(FumeurVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isFumeur());
        ajoutvilla.setAnimaux(Boolean.parseBoolean(AnnimauxVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isAnimaux());
        ajoutvilla.setParking(Boolean.parseBoolean(ParkingVillaAjoutTextField.getText()));
        System.out.println(ajoutvilla.isParking());
        pourlavilla.ajoutligneVilla(ajoutvilla);
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
