package com.example.bonprojetjavafx;

import classes.Administrateur;
import classes.Client;
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

public class ControllerAdministrateur {

    Administrateur adminn = new Administrateur();
    BaseDeDonnee labase = new BaseDeDonnee();
    @FXML
    private void BoutonAnnulerAdmin(ActionEvent event) throws IOException{

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
    private Label ErrorAdministrateur;
    @FXML
    private TextField AdminLogin;
    @FXML
    private TextField MotDePasseAdmin;

    private boolean onvatester;

    @FXML
    private void BoutonConnexionAdmin(ActionEvent event) throws IOException{
        /*if(AdminLogin.getText().isBlank() == false && MotDePasseAdmin.getText().isBlank() == false){
            adminn.setLogin(AdminLogin.getText());
            adminn.setMotDePasse(MotDePasseAdmin.getText());
            onvatester=labase.Connexion_Admin(adminn);
            System.out.println(onvatester);

            if(onvatester==true)
            {*/
                FXMLLoader loader = new FXMLLoader(getClass().getResource("page-choix-admin.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Stage newStage = new Stage();
                newStage.setTitle("GetAway/ADMIN/ChoixAction.com");
                newStage.setScene(scene);
                newStage.show();
                currentStage.close();
            /*}
            if (onvatester==false)
            {
                ErrorAdministrateur.setText("ERROR 404! erreur mot de passe ou pseudo");
            }
    }*/
}
}
