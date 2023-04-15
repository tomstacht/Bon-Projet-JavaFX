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
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.DatePicker;


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
        stage2.setTitle("GetAway/Connexion.com");
        stage2.setScene(scene2);
        stage2.show();
    }
    @FXML
    private void ButtonOnActionInscription(ActionEvent event2) throws IOException{
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("page-inscription.fxml"));
        Parent root2 = loader2.load();
        Scene scene2 = new Scene(root2);
        Stage stage2 = new Stage();
        stage2.setTitle("GetAway/Inscription.com");
        stage2.setScene(scene2);
        stage2.show();
    }

    private BaseDeDonnee b1 = new BaseDeDonnee();

    private boolean hotel;
    private boolean chalet;
    private boolean villa;
    private boolean appartement;
    private boolean pasCher;
    private boolean moyenCher;
    private boolean cher;
    private boolean etoiles1_2_3;
    private boolean etoiles4_5;
    private boolean petitDej;
    private boolean restau;
    private boolean noteClientInf8;
    private boolean noteClientSup8;
    private boolean piscine;
    private boolean wifi;
    private boolean clim;
    private boolean fumeur;
    private boolean animaux;
    private boolean parking;
    private boolean localSkis;
    private boolean cheminee;
    ArrayList<Boolean> listeCheckbox = new ArrayList<>();

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
        b1.initBdd();
        MessageErreurRechercheLabel.setText("Vos critères ont bien été enregistrés !");
        listeCheckbox.clear();
        listeCheckbox.add(hotel);
        listeCheckbox.add(villa);
        listeCheckbox.add(chalet);
        listeCheckbox.add(appartement);
        listeCheckbox.add(pasCher);
        listeCheckbox.add(moyenCher);
        listeCheckbox.add(cher);
        listeCheckbox.add(etoiles1_2_3);
        listeCheckbox.add(etoiles4_5);
        listeCheckbox.add(petitDej);
        listeCheckbox.add(restau);
        listeCheckbox.add(noteClientInf8);
        listeCheckbox.add(noteClientSup8);
        listeCheckbox.add(piscine);
        listeCheckbox.add(wifi);
        listeCheckbox.add(clim);
        listeCheckbox.add(fumeur);
        listeCheckbox.add(animaux);
        listeCheckbox.add(parking);
        listeCheckbox.add(localSkis);
        listeCheckbox.add(cheminee);

        System.out.println("Recherche lancée...");
        for(int i=0;i<listeCheckbox.size();i++)
            System.out.print(listeCheckbox.get(i)+"/");
        /*String destinationbdd = DestinantionTextField.getText();
        System.out.println(destinationbdd);
        LocalDate dateArriveebdd = DateArriveeDatePicker.getValue();
        System.out.println(dateArriveebdd);
        LocalDate dateDepartbdd = DateDepartDatePicker.getValue();
        System.out.println(dateDepartbdd);
        String NbAdulteBdd = NombreAdulteTextField.getText();
        System.out.println(NbAdulteBdd);
        String NbEnfantsBdd = NombreEnfantTextField.getText();
        System.out.println(NbEnfantsBdd);*/
        b1.filtrageBox(listeCheckbox);
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
        if(MyCheckBoxHotel.isSelected())
            hotel=true;
        else
            hotel=false;
    }
    public void ChangeVilla(ActionEvent eventVilla){
        if(MyCheckBoxVilla.isSelected())
            villa=true;
        else
            villa=false;
    }
    public void ChangeChalet(ActionEvent eventChalet){
        if(MyCheckBoxChalet.isSelected())
            chalet=true;
        else
            chalet=false;

    }
    public void ChangeAppart(ActionEvent eventAppart){
        if(MyCheckBoxAppartement.isSelected()){
            appartement=true;
        }
        else{
            appartement=false;
        }
    }
    public void ChangePasChere(ActionEvent eventPasChere){
        if(MyCheckBoxPaschere.isSelected()){
            pasCher=true;
        }
        else{
            pasCher=false;
        }
    }
    public void ChangeMoyen(ActionEvent eventMoyen){
        if(MyCheckBoxMoyen.isSelected()){
            moyenCher=true;
        }
        else{
            moyenCher=false;
        }
    }
    public void ChangeChere(ActionEvent eventChere){
        if(MyCheckBoxChere.isSelected()){
            cher=true;
        }
        else{
            cher=false;
        }
    }
    public void Change123Etoiles(ActionEvent event123Etoiles){
        if(MyCheckBox123Etoiles.isSelected()){
            etoiles1_2_3=true;
        }
        else{
            etoiles1_2_3=false;
        }
    }
    public void Change45Etoiles(ActionEvent event45Etoiles){
        if(MyCheckBox45Etoiles.isSelected()){
            etoiles4_5=true;
        }
        else{
            etoiles4_5=false;
        }
    }
    public void ChangeP_D(ActionEvent eventP_D){
        if(MyCheckBoxP_D.isSelected()){
            petitDej=true;
        }
        else{
            petitDej=false;
        }
    }
    public void ChangeRestaurant(ActionEvent eventRestaurant){
        if(MyCheckBoxRestaurant.isSelected()){
            restau=true;
        }
        else{
            restau=false;
        }
    }
    public void ChangeNoteClientNul(ActionEvent eventNoteClientNul){
        if(MyCheckBoxNoteClientNul.isSelected()){
            noteClientInf8=true;
        }
        else{
            noteClientInf8=false;
        }
    }
    public void ChangeNoteClientBien(ActionEvent eventNoteClientBien){
        if(MyCheckBoxNoteClientBien.isSelected()){
            noteClientSup8=true;
        }
        else{
            noteClientSup8=false;
        }
    }
    public void ChangePiscine(ActionEvent eventPiscine){
        if(MyCheckBoxPiscine.isSelected()){
            piscine=true;
        }
        else{
            piscine=false;
        }
    }
    public void ChangeWifi(ActionEvent eventWifi){
        if(MyCheckBoxWifi.isSelected()){
            wifi=true;
        }
        else{
            wifi=false;
        }
    }
    public void ChangeClim(ActionEvent eventClim){
        if(MyCheckBoxClim.isSelected()){
            clim=true;
        }
        else{
            clim=false;
        }
    }
    public void ChangeFumeur(ActionEvent eventFumeur){
        if(MyCheckBoxFumeur.isSelected()){
            fumeur=true;
        }
        else{
            fumeur=false;
        }
    }
    public void ChangeAnimaux(ActionEvent eventAnimaux){
        if(MyCheckBoxAnimaux.isSelected()){
            animaux=true;
        }
        else{
            animaux=false;
        }
    }
    public void ChangeParking(ActionEvent eventParking){
        if(MyCheckBoxParking.isSelected()){
            parking=true;
        }
        else{
            parking=false;
        }
    }
    public void ChangeLocalSki(ActionEvent eventLocalSki){
        if(MyCheckBoxLocalSki.isSelected()){
            localSkis=true;
        }
        else{
            localSkis=false;
        }
    }
    public void ChangeCheminee(ActionEvent eventCheminee){
        if(MyCheckBoxCheminee.isSelected()){
            cheminee=true;
        }
        else{
            cheminee=false;
        }
    }

}
