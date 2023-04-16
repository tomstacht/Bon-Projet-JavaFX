package com.example.bonprojetjavafx;
import classes.Chalet;
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
    private Chalet ajoutchalet = new Chalet();
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

        ajoutchalet.setNom(NomChaletAjoutTextField.getText());
        System.out.println(ajoutchalet.getNom());
        ajoutchalet.setPrix(PrixChaletAjoutTextField.getInt());!!int
        System.out.println(ajoutchalet.getPrix());
        ajoutchalet.setLieu(LieuChaletAjoutTextField.getText());
        System.out.println(ajoutchalet.getLieu());
        ajoutchalet.setLocalSki(LocalSkiChaletAjoutTextField.equals());!!booleen
        System.out.println(ajoutchalet.isLocalSki());
        ajoutchalet.setCheminer(ChemineChaletAjoutTextField.get());!!booleen
        System.out.println(ajoutchalet.isCheminer());
        ajoutchalet.setDistance_piste(DistPisteChaletAjoutTextField.getText());!!float
        System.out.println(ajoutchalet.getDistance_piste());
        ajoutchalet.setDistanceCentre(DistCentreChaletAjoutTextField.getText());!!float
        System.out.println(ajoutchalet.getDistanceCentre());
        ajoutchalet.setNbChambres(NBChambreChaletAjoutTextField.getText());!!int
        System.out.println(ajoutchalet.getNbChambres());
        ajoutchalet.setNbSDB(NBSalleDeBainChaletAjoutTextField.getText());!!int
        System.out.println(ajoutchalet.getNbSDB());
        ajoutchalet.setM2(SurfaceChaletAjoutTextField.getText());!!int
        System.out.println(ajoutchalet.getM2());
        ajoutchalet.setNbPersonnes(NBPersoChaletAjoutTextField.getText());!!int
        System.out.println(ajoutchalet.getNbPersonnes());
        ajoutchalet.setNote(NoteClientChaletAjoutTextField.getText());!!float
        System.out.println(ajoutchalet.getNote());
        ajoutchalet.setWifi(WifiChaletAjoutTextField.getText());!!booleen
        System.out.println(ajoutchalet.isWifi());
        ajoutchalet.setClim(ClimChaletAjoutTextField.getText());!!booleen
        System.out.println(ajoutchalet.isClim());
        ajoutchalet.setFumeur(FumeurChaletAjoutTextField.getText());!!booleen
        System.out.println(ajoutchalet.isFumeur());
        ajoutchalet.setAnimaux(AnnimauxChaletAjoutTextField.getText());!!booleen
        System.out.println(ajoutchalet.isAnimaux());
        ajoutchalet.setParking(ParkingChaletAjoutTextField.getText());!!booleen
        System.out.println(ajoutchalet.isParking());
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
