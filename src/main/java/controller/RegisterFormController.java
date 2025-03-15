package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class RegisterFormController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnRegister;

    @FXML
    private ComboBox<String> comboRole;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtConfirmPassword;

    @FXML
    private JFXTextField txtContactNumber;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    void btnBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }


    public void initialize() {
        setComboRole();
    }

    private void setComboRole(){
        ObservableList<String> roles = FXCollections.observableArrayList("Admin","Employee","Customer");
        comboRole.setItems(roles);

    }

}



