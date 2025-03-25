package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.List;

public class CalculatorFormController {

    @FXML
    private TextField txtDisplay;

    @FXML
    void btnAddition(ActionEvent event) {

        getDisplayValues("+");
    }

    @FXML
    void btnClearAll(ActionEvent event) {

        txtDisplay.clear();
    }

    @FXML
    void btnDelete(ActionEvent event) {

        String display = txtDisplay.getText();
        String [] numbers = display.split(",");

        List<String> newDisplay = new ArrayList<>();

        for(String number : numbers){
            if (number.length() > 0){
                String newNumber = number.substring(0, number.length() - 1);
                newDisplay.add(newNumber);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String number : newDisplay){
            result.append(number);
        }
        txtDisplay.setText(result.toString());
    }

    @FXML
    void btnDivider(ActionEvent event) {

        getDisplayValues("/");
    }

    @FXML
    void btnDot(ActionEvent event) {

        getDisplayValues(".");
    }

    @FXML
    void btnEqual(ActionEvent event) {

    }

    @FXML
    void btnMultiple(ActionEvent event) {

        getDisplayValues("*");
    }

    @FXML
    void btnNumber0(ActionEvent event) {

        getDisplayValues("0");
    }

    @FXML
    void btnNumber1(ActionEvent event) {

        getDisplayValues("1");
    }

    @FXML
    void btnNumber2(ActionEvent event) {

        getDisplayValues("2");
    }

    @FXML
    void btnNumber3(ActionEvent event) {

        getDisplayValues("3");
    }

    @FXML
    void btnNumber4(ActionEvent event) {

        getDisplayValues("4");
    }

    @FXML
    void btnNumber5(ActionEvent event) {

        getDisplayValues("5");
    }

    @FXML
    void btnNumber6(ActionEvent event) {

        getDisplayValues("6");
    }

    @FXML
    void btnNumber7(ActionEvent event) {

        getDisplayValues("7");
    }

    @FXML
    void btnNumber8(ActionEvent event) {

        getDisplayValues("8");
    }

    @FXML
    void btnNumber9(ActionEvent event) {

        getDisplayValues("9");
    }

    @FXML
    void btnPlusMinus(ActionEvent event) {

    }

    @FXML
    void btnPrecentage(ActionEvent event) {


    }

    private void getDisplayValues(String text){

        String display = txtDisplay.getText();
        txtDisplay.setText(display + text);
    }

}
