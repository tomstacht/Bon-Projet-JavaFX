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

public class ControllerAdminAjouter {

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
        String NomAppartAjoutTextFieldBDD = NomAppartAjoutTextField.getText();
        System.out.println(NomAppartAjoutTextFieldBDD);
        String PrixAppartAjoutTextFieldBDD = PrixAppartAjoutTextField.getText();
        System.out.println(PrixAppartAjoutTextFieldBDD);
        String LieuAppartAjoutTextFieldBDD = LieuAppartAjoutTextField.getText();
        System.out.println(LieuAppartAjoutTextFieldBDD);
        String NumEtageAppartAjoutTextFieldBDD = NumEtageAppartAjoutTextField.getText();
        System.out.println(NumEtageAppartAjoutTextFieldBDD);
        String BalconAppartAjoutTextFieldBDD = BalconAppartAjoutTextField.getText();
        System.out.println(BalconAppartAjoutTextFieldBDD);
        String DistCentreAppartAjoutTextFieldBDD = DistCentreAppartAjoutTextField.getText();
        System.out.println(DistCentreAppartAjoutTextFieldBDD);
        String NBChambreAppartAjoutTextFieldBDD = NBChambreAppartAjoutTextField.getText();
        System.out.println(NBChambreAppartAjoutTextFieldBDD);
        String NBSalleDeBainAppartAjoutTextFieldBDD = NBSalleDeBainAppartAjoutTextField.getText();
        System.out.println(NBSalleDeBainAppartAjoutTextFieldBDD);
        String SurfaceAppartAjoutTextFieldBDD = SurfaceAppartAjoutTextField.getText();
        System.out.println(SurfaceAppartAjoutTextFieldBDD);
        String NBPersoAppartAjoutTextFieldBDD = NBPersoAppartAjoutTextField.getText();
        System.out.println(NBPersoAppartAjoutTextFieldBDD);
        String NoteClientAppartAjoutTextFieldBDD = NoteClientAppartAjoutTextField.getText();
        System.out.println(NoteClientAppartAjoutTextFieldBDD);
        String WifiAppartAjoutTextFieldBDD = WifiAppartAjoutTextField.getText();
        System.out.println(WifiAppartAjoutTextFieldBDD);
        String ClimAppartAjoutTextFieldBDD = ClimAppartAjoutTextField.getText();
        System.out.println(ClimAppartAjoutTextFieldBDD);
        String FumeurAppartAjoutTextFieldBDD = FumeurAppartAjoutTextField.getText();
        System.out.println(FumeurAppartAjoutTextFieldBDD);
        String AnnimauxAppartAjoutTextFieldBDD = AnnimauxAppartAjoutTextField.getText();
        System.out.println(AnnimauxAppartAjoutTextFieldBDD);
        String ParkingAppartAjoutTextFieldBDD = ParkingAppartAjoutTextField.getText();
        System.out.println(ParkingAppartAjoutTextFieldBDD);
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
