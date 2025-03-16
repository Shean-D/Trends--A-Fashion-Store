package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StoreFormController {

    @FXML
    private JFXButton btnAccessories;

    @FXML
    private JFXButton btnFootwear;

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnKids;

    @FXML
    private JFXButton btnMen;

    @FXML
    private JFXButton btnNewBill;

    @FXML
    private JFXButton btnSeasonal;

    @FXML
    private JFXButton btnStore;

    @FXML
    private JFXButton btnWomen;

    @FXML
    private JFXTextField txtTime;

    @FXML
    void btnAccessoriesOnAction(ActionEvent event) {

    }

    @FXML
    void btnFootwearOnAction(ActionEvent event) {

    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeDashBoard.fxml"))));
        stage.show();
    }

    @FXML
    void btnKidsOnAction(ActionEvent event) {

    }

    @FXML
    void btnMenOnAction(ActionEvent event) {

    }

    @FXML
    void btnNewBillOnAction(ActionEvent event) {

    }

    @FXML
    void btnSeasonalOnAction(ActionEvent event) {

    }

    @FXML
    void btnStoreOnAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Store.fxml"))));
        stage.show();
    }

    @FXML
    void btnWomenOnAction(ActionEvent event) {

    }

    public void initialize() {

        setTime();
    }

    private void setTime(){

        Timeline time = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            LocalTime now = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = now.format(formatter);
            txtTime.setText(formattedTime);
        }));

        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

}
