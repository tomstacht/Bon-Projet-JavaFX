package com.example.bonprojetjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;

public class HelloController {
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-invite.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void BoutonActionSeConnecter(ActionEvent event2) throws IOException{
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("page-connexion.fxml"));
        Parent root2 = loader2.load();
        Scene scene2 = new Scene(root2);
        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.show();
    }

    @FXML
    private Button CancelButton;

    public void CancelButtonOnAction(ActionEvent e){
        Stage stage3 = (Stage) CancelButton.getScene().getWindow();
        stage3.close();
    }

    @FXML
    private CheckBox MyCheckBoxHotel;
    @FXML
    private CheckBox MyCheckBoxVilla;
    @FXML
    private CheckBox MyCheckBoxChalet;
    @FXML
    private CheckBox MyCheckBoxAppartement;
    @FXML
    private CheckBox MyCheckBoxPaschere;
    @FXML
    private CheckBox MyCheckBoxMoyen;
    @FXML
    private CheckBox MyCheckBoxChere;
    @FXML
    private CheckBox MyCheckBox123Etoiles;
    @FXML
    private CheckBox MyCheckBox45Etoiles;
    @FXML
    private CheckBox MyCheckBoxP_D;
    @FXML
    private CheckBox MyCheckBoxRestaurant;
    @FXML
    private CheckBox MyCheckBoxNoteClientNul;
    @FXML
    private CheckBox MyCheckBoxNoteClientBien;
    @FXML
    private CheckBox MyCheckBoxPiscine;
    @FXML
    private CheckBox MyCheckBoxWifi;
    @FXML
    private CheckBox MyCheckBoxClim;
    @FXML
    private CheckBox MyCheckBoxFumeur;
    @FXML
    private CheckBox MyCheckBoxAnimaux;
    @FXML
    private CheckBox MyCheckBoxParking;
    @FXML
    private CheckBox MyCheckBoxLocalSki;
    @FXML
    private CheckBox MyCheckBoxCheminee ;

    public void ChangeHotel(ActionEvent eventHotel){
        if(MyCheckBoxHotel.isSelected()){
            System.out.println("Hotel=1");
        }
        else{
            System.out.println("Hotel=0");
        }
    }
    public void ChangeVilla(ActionEvent eventVilla){
        if(MyCheckBoxVilla.isSelected()){
            System.out.println("Villa=1");
        }
        else{
            System.out.println("Villa=0");
        }
    }
    public void ChangeChalet(ActionEvent eventChalet){
        if(MyCheckBoxChalet.isSelected()){
            System.out.println("Chalet=1");
        }
        else{
            System.out.println("Chalet=0");
        }
    }
    public void ChangeAppart(ActionEvent eventAppart){
        if(MyCheckBoxAppartement.isSelected()){
            System.out.println("Appart=1");
        }
        else{
            System.out.println("Appart=0");
        }
    }
    public void ChangePasChere(ActionEvent eventPasChere){
        if(MyCheckBoxPaschere.isSelected()){
            System.out.println("PasChere=1");
        }
        else{
            System.out.println("PasChere=0");
        }
    }
    public void ChangeMoyen(ActionEvent eventMoyen){
        if(MyCheckBoxMoyen.isSelected()){
            System.out.println("Moyen=1");
        }
        else{
            System.out.println("Moyen=0");
        }
    }
    public void ChangeChere(ActionEvent eventChere){
        if(MyCheckBoxChere.isSelected()){
            System.out.println("Chere=1");
        }
        else{
            System.out.println("Chere=0");
        }
    }
}
