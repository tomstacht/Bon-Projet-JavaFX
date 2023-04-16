package com.example.bonprojetjavafx;
import classes.Hotel;
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
public class ControllerAjouterHotel {
    private BaseDeDonnee pourlhotel =new BaseDeDonnee();
    private Hotel ajouthotel =new Hotel();
    @FXML
    private TextField NomHotelAjoutTextField;
    @FXML
    private TextField PrixHotelAjoutTextField;
    @FXML
    private TextField LieuHotelAjoutTextField;
    @FXML
    private TextField NBEtoileHotelAjoutTextField;
    @FXML
    private TextField PetitDEJHotelAjoutTextField;
    @FXML
    private TextField RestaurantHotelAjoutTextField;
    @FXML
    private TextField MarqueHotelAjoutTextField;
    @FXML
    private TextField DistCententreHotelAjoutTextField;
    @FXML
    private TextField SurfaceHotelAjoutTextField;
    @FXML
    private TextField NBdePersonneHotelAjoutTextField;
    @FXML
    private TextField NoteClientHotelAjoutTextField;
    @FXML
    private TextField WifiHotelAjoutTextField;
    @FXML
    private TextField ClimHotelAjoutTextField;
    @FXML
    private TextField FumeurHotelAjoutTextField;
    @FXML
    private TextField AnnimauxHotelAjoutTextField;
    @FXML
    private TextField ParkingHotelAjoutTextField;



    public void AjouterHotel(ActionEvent event) {
        ajouthotel.setNom(NomHotelAjoutTextField.getText());
        System.out.println(ajouthotel.getNom());
        ajouthotel.setPrix(Integer.parseInt(PrixHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getPrix());
        ajouthotel.setLieu(LieuHotelAjoutTextField.getText());
        System.out.println(ajouthotel.getLieu());
        ajouthotel.setNb_etoile(Float.parseFloat(NBEtoileHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getNb_etoile());
        ajouthotel.setPetitDej(Boolean.parseBoolean(PetitDEJHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isPetitDej());
        ajouthotel.setRestaurant(Boolean.parseBoolean(RestaurantHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isRestaurant());
        ajouthotel.setDistanceCentre(Float.parseFloat(DistCententreHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getDistanceCentre());
        ajouthotel.setM2(Integer.parseInt(SurfaceHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getM2());
        ajouthotel.setNbPersonnes(Integer.parseInt(NBdePersonneHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getNbPersonnes());
        ajouthotel.setNote(Float.parseFloat(NoteClientHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.getNote());
        ajouthotel.setWifi(Boolean.parseBoolean(WifiHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isWifi());
        ajouthotel.setClim(Boolean.parseBoolean(ClimHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isClim());
        ajouthotel.setFumeur(Boolean.parseBoolean(FumeurHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isFumeur());
        ajouthotel.setAnimaux(Boolean.parseBoolean(AnnimauxHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isAnimaux());
        ajouthotel.setParking(Boolean.parseBoolean(ParkingHotelAjoutTextField.getText()));
        System.out.println(ajouthotel.isParking());
        ajouthotel.setCompagnie(MarqueHotelAjoutTextField.getText());
        System.out.println(ajouthotel.getCompagnie());
        pourlhotel.ajoutligneHotel(ajouthotel);
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
