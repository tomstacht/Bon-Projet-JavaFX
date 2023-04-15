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
    @FXML
    private Button CancelButton;
    @FXML
    private TextField UsernameTextField;
    @FXML
    private TextField PasswordTextField;

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage3 = (Stage) CancelButton.getScene().getWindow();
        stage3.close();
    }

    public void InscriptionButtonOnAction(ActionEvent e) {
        if (UsernameTextField.getText().isBlank() == false && PasswordTextField.getText().isBlank() == false) {
            String id = UsernameTextField.getText();
            String mdpp = PasswordTextField.getText();
        }
    }
}