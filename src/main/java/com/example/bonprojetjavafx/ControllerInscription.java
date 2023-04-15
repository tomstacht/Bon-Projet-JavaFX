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
import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
public class ControllerInscription {
    BaseDeDonnee baseinscription=new BaseDeDonnee();
    @FXML
    private Button CancelButton;
    @FXML
    private TextField UsernameTextField;
    @FXML
    private TextField PasswordTextField;
    @FXML
    private TextField MailTextField;
    @FXML
    private TextField PrenomTextField;
    @FXML
    private TextField NomTextField;
    @FXML
    private Label loginMessageLabel;
    private String prenom;
    private String nom;
    private String mdpp;
    private String Mail;
    private String pseudo;

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage3 = (Stage) CancelButton.getScene().getWindow();
        stage3.close();
    }

    public void InscriptionButtonOnAction(ActionEvent e) {
        if (UsernameTextField.getText().isBlank() == false && PasswordTextField.getText().isBlank() == false && MailTextField.getText().isBlank()==false && PrenomTextField.getText().isBlank()==false && NomTextField.getText().isBlank()==false)
        {
            prenom=PrenomTextField.getText();
            nom = NomTextField.getText();
            pseudo = UsernameTextField.getText();
            Mail = MailTextField.getText();
            mdpp = PasswordTextField.getText();
            baseinscription.InscriptionClient(prenom,nom,Mail,pseudo,mdpp);
            loginMessageLabel.setText("c'est bon");
        }
        else
        {
            loginMessageLabel.setText("Veuillez remplir les 5 zones de texte");
        }
    }
}