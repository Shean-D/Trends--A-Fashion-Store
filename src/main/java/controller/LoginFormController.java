package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginFormController {

    @FXML
    private Button btnBack;

    public void btnBackOnAction() throws IOException {

        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Welcome.fxml"))));
        stage.setTitle("Welcome Page");
        stage.show();

    }


    public void btnLoginOnAction(ActionEvent actionEvent) {
    }
}
