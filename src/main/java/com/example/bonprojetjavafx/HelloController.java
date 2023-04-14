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

    public void ChangeHotel(ActionEvent eventHotel){
        if(MyCheckBoxHotel.isSelected()){
            System.out.println("Hotel=1");
        }
        else{
            System.out.println("Hotel=0");
        }
    }

}
