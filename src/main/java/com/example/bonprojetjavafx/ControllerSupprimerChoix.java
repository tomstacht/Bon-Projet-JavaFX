package com.example.bonprojetjavafx;
import classes.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import java.io.IOException;


public class ControllerSupprimerChoix {
    @FXML
    private void BoutonAdminSupprimerHotel(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-admin-supprimer-hotel.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix/Supprimer/Hotel.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }

    @FXML
    private void BoutonAdminSupprimerVilla(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-admin-supprimer-villa.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix/Supprimer/Villa.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }
    @FXML
    private void BoutonAdminSupprimerAppartement(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-admin-supprimer-appartement.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix/Supprimer/Appartement.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }
    @FXML
    private void BoutonAdminSupprimerChalet(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("page-admin-supprimer-chalet.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("GetAway/ADMIN/Choix/Supprimer/Chalet.com");
        newStage.setScene(scene);
        newStage.show();
        currentStage.close();
    }
}
