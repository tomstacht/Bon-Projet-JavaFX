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
    private BaseDeDonnee pourlechalet = new BaseDeDonnee();
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
        ajoutchalet.setPrix(Integer.parseInt(PrixChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getPrix());
        ajoutchalet.setLieu(LieuChaletAjoutTextField.getText());
        System.out.println(ajoutchalet.getLieu());
        ajoutchalet.setLocalSki(Boolean.parseBoolean(LocalSkiChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isLocalSki());
        ajoutchalet.setCheminer(Boolean.parseBoolean(ChemineChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isCheminer());
        ajoutchalet.setDistance_piste(Float.parseFloat(DistPisteChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getDistance_piste());
        ajoutchalet.setDistanceCentre(Float.parseFloat(DistCentreChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getDistanceCentre());
        ajoutchalet.setNbChambres(Integer.parseInt(NBChambreChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getNbChambres());
        ajoutchalet.setNbSDB(Integer.parseInt(NBSalleDeBainChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getNbSDB());
        ajoutchalet.setM2(Integer.parseInt(SurfaceChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getM2());
        ajoutchalet.setNbPersonnes(Integer.parseInt(NBPersoChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getNbPersonnes());
        ajoutchalet.setNote(Float.parseFloat(NoteClientChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.getNote());
        ajoutchalet.setWifi(Boolean.parseBoolean(WifiChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isWifi());
        ajoutchalet.setClim(Boolean.parseBoolean(ClimChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isClim());
        ajoutchalet.setFumeur(Boolean.parseBoolean(FumeurChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isFumeur());
        ajoutchalet.setAnimaux(Boolean.parseBoolean(AnnimauxChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isAnimaux());
        ajoutchalet.setParking(Boolean.parseBoolean(ParkingChaletAjoutTextField.getText()));
        System.out.println(ajoutchalet.isParking());
        pourlechalet.ajoutligneChalet(ajoutchalet);

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
