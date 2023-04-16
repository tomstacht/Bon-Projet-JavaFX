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

public class ControllerAjouterVilla {
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

        String NomVillaAjoutTextFieldBDD = NomVillaAjoutTextField.getText();
        System.out.println(NomVillaAjoutTextFieldBDD);
        String PrixVillaAjoutTextFieldBDD = PrixVillaAjoutTextField.getText();
        System.out.println(PrixVillaAjoutTextFieldBDD);
        String LieuVillaAjoutTextFieldBDD = LieuVillaAjoutTextField.getText();
        System.out.println(LieuVillaAjoutTextFieldBDD);
        String PiscineVillaAjoutTextFieldBDD = PiscineVillaAjoutTextField.getText();
        System.out.println(PiscineVillaAjoutTextFieldBDD);
        String DistMerVillaAjoutTextFieldBDD = DistMerVillaAjoutTextField.getText();
        System.out.println(DistMerVillaAjoutTextFieldBDD);
        String DistCentreVillaAjoutTextFieldBDD = DistCentreVillaAjoutTextField.getText();
        System.out.println(DistCentreVillaAjoutTextFieldBDD);
        String NBChambreVillaAjoutTextFieldBDD = NBChambreVillaAjoutTextField.getText();
        System.out.println(NBChambreVillaAjoutTextFieldBDD);
        String NBSalleDeBainVillaAjoutTextFieldBDD = NBSalleDeBainVillaAjoutTextField.getText();
        System.out.println(NBSalleDeBainVillaAjoutTextFieldBDD);
        String SurfaceVillaAjoutTextFieldBDD = SurfaceVillaAjoutTextField.getText();
        System.out.println(SurfaceVillaAjoutTextFieldBDD);
        String NBPersoVillaAjoutTextFieldBDD = NBPersoVillaAjoutTextField.getText();
        System.out.println(NBPersoVillaAjoutTextFieldBDD);
        String NoteClientVillaAjoutTextFieldBDD = NoteClientVillaAjoutTextField.getText();
        System.out.println(NoteClientVillaAjoutTextFieldBDD);
        String WifiVillaAjoutTextFieldBDD = WifiVillaAjoutTextField.getText();
        System.out.println(WifiVillaAjoutTextFieldBDD);
        String ClimVillaAjoutTextFieldBDD = ClimVillaAjoutTextField.getText();
        System.out.println(ClimVillaAjoutTextFieldBDD);
        String FumeurVillaAjoutTextFieldBDD = FumeurVillaAjoutTextField.getText();
        System.out.println(FumeurVillaAjoutTextFieldBDD);
        String AnnimauxVillaAjoutTextFieldBDD = AnnimauxVillaAjoutTextField.getText();
        System.out.println(AnnimauxVillaAjoutTextFieldBDD);
        String ParkingVillaAjoutTextFieldBDD = ParkingVillaAjoutTextField.getText();
        System.out.println(ParkingVillaAjoutTextFieldBDD);
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
