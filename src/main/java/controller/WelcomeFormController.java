package controller;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class WelcomeFormController {

    @FXML
    public Button btnRegister;

    @FXML
    public Button btnLogin;

    @FXML
    private TextField txtTime;

    public void initialize() {
        txtTimeClickOnAction();
    }

    public void txtTimeClickOnAction() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            LocalDateTime now = LocalDateTime.now();
            String formattedTime = formatter.format(now);
            txtTime.setText(formattedTime);
        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    public void btnRegisterOnAction() throws IOException {
        Stage stage = (Stage) btnRegister.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Register.fxml"))));
        stage.setTitle("Register Page");
        stage.show();
    }

    public void btnLogonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeDashBoard.fxml"))));
        stage.setTitle("Login Page");
        stage.show();
    }

}
