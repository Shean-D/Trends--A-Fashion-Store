package controller;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class WelcomeFormController {

    @FXML
    private TextField txtTime;


    public void txtTimeClickOnAction() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            LocalDateTime now = LocalDateTime.now();
            String formattedTime = formatter.format(now);
            txtTime.setText(formattedTime);
        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }
}
