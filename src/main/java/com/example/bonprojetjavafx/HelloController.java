package com.example.bonprojetjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


public class HelloController {

    ArrayList<int> listeCheckbox = new ArrayList<>(21);
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-invite.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        initListeBool();
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
    private Label MessageErreurRechercheLabel;
    @FXML
    private TextField DestinantionTextField;
    @FXML
    private DatePicker DateArriveeDatePicker;
    @FXML
    private DatePicker DateDepartDatePicker;
    @FXML
    private TextField NombreAdulteTextField;
    @FXML
    private TextField NombreEnfantTextField;

    public void RechercherButtonOnAction(ActionEvent e){
        MessageErreurRechercheLabel.setText("Vos critères ont bien été enregistrés !");
        System.out.println("ButtonPushed=1");
        String destinationbdd = DestinantionTextField.getText();
        System.out.println(destinationbdd);
        LocalDate dateArriveebdd = DateArriveeDatePicker.getValue();
        System.out.println(dateArriveebdd);
        LocalDate dateDepartbdd = DateDepartDatePicker.getValue();
        System.out.println(dateDepartbdd);
        String NbAdulteBdd = NombreAdulteTextField.getText();
        System.out.println(NbAdulteBdd);
        String NbEnfantsBdd = NombreEnfantTextField.getText();
        System.out.println(NbEnfantsBdd);
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

    public void initListeBool(){
        for(int i=0; i<21; i++)
            listeCheckbox.add(false);

        for(int j=0;j<21;j++)
            System.out.println(listeCheckbox.get(j));
    }

    public void ChangeHotel(ActionEvent eventHotel){
        if(MyCheckBoxHotel.isSelected()){
            System.out.println("Hotel=1");
        }
        else{
           // listeBool.set(0, false);
            System.out.println("Hotel=0");
        }
    }
    public void ChangeVilla(ActionEvent eventVilla){
        if(MyCheckBoxVilla.isSelected()){
            listeBool.set(1, true);
            System.out.println("Villa=1");
        }
        else{
            listeBool.set(1, false);
            System.out.println("Villa=0");
        }
    }
    public void ChangeChalet(ActionEvent eventChalet){
        if(MyCheckBoxChalet.isSelected()){
            listeBool.set(2, true);
            System.out.println("Chalet=1");
        }
        else{
            listeBool.set(2, false);
            System.out.println("Chalet=0");
        }
    }
    public void ChangeAppart(ActionEvent eventAppart){
        if(MyCheckBoxAppartement.isSelected()){
            listeBool.set(3, true);
            System.out.println("Appart=1");
        }
        else{
            listeBool.set(3, false);
            System.out.println("Appart=0");
        }
    }
    public void ChangePasChere(ActionEvent eventPasChere){
        if(MyCheckBoxPaschere.isSelected()){
            listeBool.set(4, true);
            System.out.println("PasChere=1");
        }
        else{
            listeBool.set(4, false);
            System.out.println("PasChere=0");
        }
    }
    public void ChangeMoyen(ActionEvent eventMoyen){
        if(MyCheckBoxMoyen.isSelected()){
            listeBool.set(5, true);
            System.out.println("Moyen=1");
        }
        else{
            listeBool.set(5, false);
            System.out.println("Moyen=0");
        }
    }
    public void ChangeChere(ActionEvent eventChere){
        if(MyCheckBoxChere.isSelected()){
            listeBool.set(6, true);
            System.out.println("Chere=1");
        }
        else{
            listeBool.set(6, false);
            System.out.println("Chere=0");
        }
    }
    public void Change123Etoiles(ActionEvent event123Etoiles){
        if(MyCheckBox123Etoiles.isSelected()){
            listeBool.set(7, true);
            System.out.println("123Etoiles=1");
        }
        else{
            listeBool.set(7, false);
            System.out.println("123 Etoiles=0");
        }
    }
    public void Change45Etoiles(ActionEvent event45Etoiles){
        if(MyCheckBox45Etoiles.isSelected()){
            listeBool.set(8, true);
            System.out.println("45Etoiles=1");
        }
        else{
            listeBool.set(8, false);
            System.out.println("45Etoiles=0");
        }
    }
    public void ChangeP_D(ActionEvent eventP_D){
        if(MyCheckBoxP_D.isSelected()){
            listeBool.set(9, true);
            System.out.println("P_D=1");
        }
        else{
            listeBool.set(9, false);
            System.out.println("P_D=0");
        }
    }
    public void ChangeRestaurant(ActionEvent eventRestaurant){
        if(MyCheckBoxRestaurant.isSelected()){
            listeBool.set(10, true);
            System.out.println("resto=1");
        }
        else{
            listeBool.set(10, false);
            System.out.println("resto=0");
        }
    }
    public void ChangeNoteClientNul(ActionEvent eventNoteClientNul){
        if(MyCheckBoxNoteClientNul.isSelected()){
            listeBool.set(11, true);
            System.out.println("client nul=1");
        }
        else{
            listeBool.set(11, false);
            System.out.println("client nul=0");
        }
    }
    public void ChangeNoteClientBien(ActionEvent eventNoteClientBien){
        if(MyCheckBoxNoteClientBien.isSelected()){
            listeBool.set(12, true);
            System.out.println("client bien=1");
        }
        else{
            listeBool.set(12, false);
            System.out.println("note client bien=0");
        }
    }
    public void ChangePiscine(ActionEvent eventPiscine){
        if(MyCheckBoxPiscine.isSelected()){
            listeBool.set(13, true);
            System.out.println("piscine=1");
        }
        else{
            listeBool.set(13, false);
            System.out.println("piscine=0");
        }
    }
    public void ChangeWifi(ActionEvent eventWifi){
        if(MyCheckBoxWifi.isSelected()){
            listeBool.set(14, true);
            System.out.println("wifi=1");
        }
        else{
            listeBool.set(14, false);
            System.out.println("wifi=0");
        }
    }
    public void ChangeClim(ActionEvent eventClim){
        if(MyCheckBoxClim.isSelected()){
            listeBool.set(15, true);
            System.out.println("clim=1");
        }
        else{
            listeBool.set(15, false);
            System.out.println("clim=0");
        }
    }
    public void ChangeFumeur(ActionEvent eventFumeur){
        if(MyCheckBoxFumeur.isSelected()){
            listeBool.set(16, true);
            System.out.println("fumeur=1");
        }
        else{
            listeBool.set(16, false);
            System.out.println("fumeur=0");
        }
    }
    public void ChangeAnimaux(ActionEvent eventAnimaux){
        if(MyCheckBoxAnimaux.isSelected()){
            listeBool.set(17, true);
            System.out.println("animaux=1");
        }
        else{
            listeBool.set(17, false);
            System.out.println("animaux=0");
        }
    }
    public void ChangeParking(ActionEvent eventParking){
        if(MyCheckBoxParking.isSelected()){
            listeBool.set(18, true);
            System.out.println("parking=1");
        }
        else{
            listeBool.set(18, false);
            System.out.println("parking=0");
        }
    }
    public void ChangeLocalSki(ActionEvent eventLocalSki){
        if(MyCheckBoxLocalSki.isSelected()){
            listeBool.set(19, true);
            System.out.println("loacalski=1");
        }
        else{
            listeBool.set(19, false);
            System.out.println("localski=0");
        }
    }
    public void ChangeCheminee(ActionEvent eventCheminee){
        if(MyCheckBoxCheminee.isSelected()){
            listeBool.set(20, true);
            System.out.println("cheminee=1");
        }
        else{
            listeBool.set(20, false);
            System.out.println("cheminee=0");
        }
        for(int i=0; i< listeBool.size();i++)
            System.out.println(listeBool.get(i));
    }

}
