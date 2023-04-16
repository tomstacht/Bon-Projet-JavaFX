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

public class ControllerAjouterChalet {
    @FXML
    private TextField NomChaletAjoutTextField;
    @FXML
    private TextField PrixChaletAjoutTextField;
    @FXML
    private TextField LieuChaletAjoutTextField;
    @FXML
    private TextField LocalSkiChaletAjoutTextField;
    @FXML
    private TextField ChemineChaletAjoutTextField;
    @FXML
    private TextField DistPisteChaletAjoutTextField;
    @FXML
    private TextField DistCentreChaletAjoutTextField;
    @FXML
    private TextField NBChambreChaletAjoutTextField;
    @FXML
    private TextField NBSalleDeBainChaletAjoutTextField;
    @FXML
    private TextField SurfaceChaletAjoutTextField;
    @FXML
    private TextField NBPersoChaletAjoutTextField;
    @FXML
    private TextField NoteClientChaletAjoutTextField;
    @FXML
    private TextField WifiChaletAjoutTextField;
    @FXML
    private TextField ClimChaletAjoutTextField;
    @FXML
    private TextField FumeurChaletAjoutTextField;
    @FXML
    private TextField AnnimauxChaletAjoutTextField;
    @FXML
    private TextField ParkingChaletAjoutTextField;

    public void AjouterChalet(ActionEvent event) {

        String NomChaletAjoutTextFieldBDD = NomChaletAjoutTextField.getText();
        System.out.println(NomChaletAjoutTextFieldBDD);
        String PrixChaletAjoutTextFieldBDD = PrixChaletAjoutTextField.getText();
        System.out.println(PrixChaletAjoutTextFieldBDD);
        String LieuChaletAjoutTextFieldBDD = LieuChaletAjoutTextField.getText();
        System.out.println(LieuChaletAjoutTextFieldBDD);
        String LocalSkiChaletAjoutTextFieldBDD = LocalSkiChaletAjoutTextField.getText();
        System.out.println(LocalSkiChaletAjoutTextFieldBDD);
        String ChemineChaletAjoutTextFieldBDD = ChemineChaletAjoutTextField.getText();
        System.out.println(ChemineChaletAjoutTextFieldBDD);
        String DistPisteChaletAjoutTextFieldBDD = DistPisteChaletAjoutTextField.getText();
        System.out.println(DistPisteChaletAjoutTextFieldBDD);
        String DistCentreChaletAjoutTextFieldBDD = DistCentreChaletAjoutTextField.getText();
        System.out.println(DistCentreChaletAjoutTextFieldBDD);
        String NBChambreChaletAjoutTextFieldBDD = NBChambreChaletAjoutTextField.getText();
        System.out.println(NBChambreChaletAjoutTextFieldBDD);
        String NBSalleDeBainChaletAjoutTextFieldBDD = NBSalleDeBainChaletAjoutTextField.getText();
        System.out.println(NBSalleDeBainChaletAjoutTextFieldBDD);
        String SurfaceChaletAjoutTextFieldBDD = SurfaceChaletAjoutTextField.getText();
        System.out.println(SurfaceChaletAjoutTextFieldBDD);
        String NBPersoChaletAjoutTextFieldBDD = NBPersoChaletAjoutTextField.getText();
        System.out.println(NBPersoChaletAjoutTextFieldBDD);
        String NoteClientChaletAjoutTextFieldBDD = NoteClientChaletAjoutTextField.getText();
        System.out.println(NoteClientChaletAjoutTextFieldBDD);
        String WifiChaletAjoutTextFieldBDD = WifiChaletAjoutTextField.getText();
        System.out.println(WifiChaletAjoutTextFieldBDD);
        String ClimChaletAjoutTextFieldBDD = ClimChaletAjoutTextField.getText();
        System.out.println(ClimChaletAjoutTextFieldBDD);
        String FumeurChaletAjoutTextFieldBDD = FumeurChaletAjoutTextField.getText();
        System.out.println(FumeurChaletAjoutTextFieldBDD);
        String AnnimauxChaletAjoutTextFieldBDD = AnnimauxChaletAjoutTextField.getText();
        System.out.println(AnnimauxChaletAjoutTextFieldBDD);
        String ParkingChaletAjoutTextFieldBDD = ParkingChaletAjoutTextField.getText();
        System.out.println(ParkingChaletAjoutTextFieldBDD);
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
