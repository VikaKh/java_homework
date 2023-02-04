package com.company;

import java.util.Arrays;

public class ArrayUtil {
    private String[] arrStrings = new String[10];
    private double[] arrOfNumber = new double[10];
    private double multiplicationResult = 1;
    private double additionResult = 0;
    public String[] getArrStrings() {
        return arrStrings;
    }

    public void setArrStrings(String[] arrStrings) {
        this.arrStrings = arrStrings;
    }

    public double[] getArrOfNumber() {
        return arrOfNumber;
    }

    public void setArrOfNumber(double[] arrOfNumber) {
        this.arrOfNumber = arrOfNumber;
    }

    public String[] arrStringWithOutEven (String[] arrStrings) {
        String[] newArrStrings = new String[(int)Math.ceil(arrStrings.length/2)];
        for (int i = 0; i < newArrStrings.length; i++){
            newArrStrings[i] = arrStrings[2*i+1];
        }
        return newArrStrings;
    }

    public double resultOfExpression (double[] arrOfNumber, MathOperation value) {
        switch (value){
            case MULTIPLICATION:
                for (int i = 0; i < arrOfNumber.length; i++){
                    multiplicationResult *= arrOfNumber[i];
                }
                return multiplicationResult;

            case ADDITION:
                for (int i = 0; i < arrOfNumber.length; i++){
                    additionResult += arrOfNumber[i];
                }
                return additionResult;

            case AVERAGE_CALCULATION:
                for (int i = 0; i < arrOfNumber.length; i++){
                    additionResult += arrOfNumber[i];
                }
                return additionResult/arrOfNumber.length;
            default:
                return -0;
        }
    }
}