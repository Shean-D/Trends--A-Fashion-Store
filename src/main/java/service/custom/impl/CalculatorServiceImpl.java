package service.custom.impl;

import service.custom.CalculatorService;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String addition(String text) {
        return "";
    }

    @Override
    public String subtraction(String text) {
        return "";
    }

    @Override
    public String multiplication(String text) {
        return "";
    }

    @Override
    public String divition(String text) {
        return "";
    }

    @Override
    public String delete(String text) {

        String [] displayedNumbers = text.split(",");

        List<String> newNumberList = new ArrayList<>();

        for(String number : displayedNumbers){
            if(number.length() > 0){
                String singleNumber = number.substring(0, number.length() - 1);
                newNumberList.add(singleNumber);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String number : newNumberList){
            result.append(number);
        }

        return result.toString();
    }

    @Override
    public String equal(String text) {

        return "";
    }
}
