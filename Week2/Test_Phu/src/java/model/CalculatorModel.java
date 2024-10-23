/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */ 
  

public class CalculatorModel {
    private double n1,n2;
    private String operator;

    public CalculatorModel() {
    }

    public CalculatorModel(double n2, double n1, String operator) {
        this.n2 = n2;
        this.n1 = n1;
        this.operator = operator;
    }

    public double getN1() {
        return n1;
    }

    public double Calculate(){
        if (operator.equals("+")){
            return n1+n2;
        }
        if (operator.equals("-")){
            return n1-n2;
        }
        if (operator.equals("*")){
            return n1*n2;
        }
        if (operator.equals("/")){
            return n1/n2;
        }
        else return 0;
    }
}


