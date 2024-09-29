/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author bebet
 */
public class CalculatorModel {

    private double number1;
    private double number2;
    private String operator;

    public CalculatorModel(double number1, double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate() {
        if (operator.equals("+")) {
            return number1 + number2;
        }
        if (operator.equals("-")) {
            return number1 - number2;
        }
        if (operator.equals("*")) {
            return number1 * number2;
        }
        return number1 / number2;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        return number1 + " " + operator + " " + number2 + "= " + decimalFormat.format(calculate());
    }

}
