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

public class ControllerConnexion {

    @FXML
    private Button CancelButton;

    public void CancelButtonOnAction(ActionEvent e){
        Stage stage3 = (Stage) CancelButton.getScene().getWindow();
        stage3.close();
    }

    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField UsernameTextField;
    @FXML
    private TextField PasswordTextField;
    public void loginButtonOnAction(ActionEvent e){
        if(UsernameTextField.getText().isBlank() == false && PasswordTextField.getText().isBlank() == false){
            loginMessageLabel.setText("Vous avez essayé de vous connecter !");
        }else{
            loginMessageLabel.setText("Veuillez entrer votre adresse mail et votre mot de passe:");
        }
    }
}
