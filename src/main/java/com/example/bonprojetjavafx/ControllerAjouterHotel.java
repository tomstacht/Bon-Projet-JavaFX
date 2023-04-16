package com.example.bonprojetjavafx;
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



    public void AjouterAppartement(ActionEvent event) {
        String NomHotelAjoutTextFieldBDD = NomHotelAjoutTextField.getText();
        System.out.println(NomHotelAjoutTextFieldBDD);
        String PrixHotelAjoutTextFieldBDD = PrixHotelAjoutTextField.getText();
        System.out.println(PrixHotelAjoutTextFieldBDD);
        String LieuHotelAjoutTextFieldBDD = LieuHotelAjoutTextField.getText();
        System.out.println(LieuHotelAjoutTextFieldBDD);
        String NBEtoileHotelAjoutTextFieldBDD = NBEtoileHotelAjoutTextField.getText();
        System.out.println(NBEtoileHotelAjoutTextFieldBDD);
        String PetitDEJHotelAjoutTextFieldBDD = PetitDEJHotelAjoutTextField.getText();
        System.out.println(PetitDEJHotelAjoutTextFieldBDD);
        String RestaurantHotelAjoutTextFieldBDD = RestaurantHotelAjoutTextField.getText();
        System.out.println(RestaurantHotelAjoutTextFieldBDD);
        String MarqueHotelAjoutTextFieldBDD = MarqueHotelAjoutTextField.getText();
        System.out.println(MarqueHotelAjoutTextFieldBDD);
        String DistCententreHotelAjoutTextFieldBDD = DistCententreHotelAjoutTextField.getText();
        System.out.println(DistCententreHotelAjoutTextFieldBDD);
        String SurfaceHotelAjoutTextFieldBDD = SurfaceHotelAjoutTextField.getText();
        System.out.println(SurfaceHotelAjoutTextFieldBDD);
        String NBdePersonneHotelAjoutTextFieldBDD = NBdePersonneHotelAjoutTextField.getText();
        System.out.println(NBdePersonneHotelAjoutTextFieldBDD);
        String NoteClientHotelAjoutTextFieldBDD = NoteClientHotelAjoutTextField.getText();
        System.out.println(NoteClientHotelAjoutTextFieldBDD);
        String WifiHotelAjoutTextFieldBDD = WifiHotelAjoutTextField.getText();
        System.out.println(WifiHotelAjoutTextFieldBDD);
        String ClimHotelAjoutTextFieldBDD = ClimHotelAjoutTextField.getText();
        System.out.println(ClimHotelAjoutTextFieldBDD);
        String FumeurHotelAjoutTextFieldBDD = FumeurHotelAjoutTextField.getText();
        System.out.println(FumeurHotelAjoutTextFieldBDD);
        String AnnimauxHotelAjoutTextFieldBDD = AnnimauxHotelAjoutTextField.getText();
        System.out.println(AnnimauxHotelAjoutTextFieldBDD);
        String ParkingHotelAjoutTextFieldBDD = ParkingHotelAjoutTextField.getText();
        System.out.println(ParkingHotelAjoutTextFieldBDD);
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
