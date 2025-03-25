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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EmployeeDashBoardFormController {

    @FXML
    private JFXButton btnCalc;

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnNewBill;

    @FXML
    private JFXButton btnStore;

    @FXML
    private JFXTextField txtDate;

    @FXML
    private JFXTextField txtTime;

    @FXML
    void btnCalcOnAction(ActionEvent event) throws IOException {

        Stage newStage1 = new Stage();
        newStage1.setTitle("Calculator");
        newStage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Calculator.fxml"))));
        newStage1.show();

    }

    @FXML
    void btnHomeOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Welcome.fxml"))));
        stage.setTitle("Welcome Page");
        stage.show();
    }

    @FXML
    void btnNewBillOnAction(ActionEvent event) {

    }

    @FXML
    void btnStoreOnAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Store.fxml"))));
        stage.show();
    }

    public void initialize() {
        setDateAndTime();
    }

    private void setDateAndTime(){
        LocalDate date = LocalDate.now();
        txtDate.setText(date.toString());

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime time = LocalTime.now();
            String formattedTime = formatter.format(time);
            txtTime.setText(formattedTime);
        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }


}