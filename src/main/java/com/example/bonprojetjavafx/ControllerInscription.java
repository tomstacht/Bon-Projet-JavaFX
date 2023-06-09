package com.example.bonprojetjavafx;

import classes.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
    Client inscriptionclient= new Client();
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
    private Label InscriptionMessageLabel;

    public void CancelButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-invite.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/Home.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }

    @FXML
    private void retourPremierePage(MouseEvent event) throws IOException{
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

    public void InscriptionButtonOnAction(ActionEvent e) throws IOException{
        if (UsernameTextField.getText().isBlank() == false && PasswordTextField.getText().isBlank() == false && MailTextField.getText().isBlank()==false && PrenomTextField.getText().isBlank()==false && NomTextField.getText().isBlank()==false)
        {
            inscriptionclient.setPrenom(PrenomTextField.getText());
            inscriptionclient.setNom(NomTextField.getText());
            inscriptionclient.setPseudo(UsernameTextField.getText());
            inscriptionclient.setEmail(MailTextField.getText());
            inscriptionclient.setPassword(PasswordTextField.getText());
            baseinscription.InscriptionClient(inscriptionclient);
            InscriptionMessageLabel.setText("VOUS ETES BIEN INSCRIT !");

            //Ouverture page connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("page-connexion.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage currentStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Stage newStage = new Stage();
            newStage.setTitle("GetAway/Connexion.com");
            newStage.setScene(scene);
            newStage.show();
            currentStage.close();
        }
        else
        {
            InscriptionMessageLabel.setText("ERREUR 404 ! VEUILLEZ BIEN REMPLIR LES 5 ZONES DE TEXTE");
        }
    }
}