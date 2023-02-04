package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Homework 1
      String[] arr = {"one", "two", "three", "fourth", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(Arrays.toString(arrayUtil.arrStringWithOutEven(new String[] {"one", "two", "three", "fourth", "five", "six", "seven", "eight", "nine", "ten"})));

        //Homework 2
        MathOperation operation = null;
        System.out.println("Enter 1, 2 or 3: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
            case 1: operation = MathOperation.MULTIPLICATION;
            break;
            case 2: operation = MathOperation.ADDITION;
            break;
            case 3: operation = MathOperation.AVERAGE_CALCULATION;
            break;
            default:
                System.out.println("You entered the wrong number!");
                break;
        }
        ArrayUtil arrayUtil1 = new ArrayUtil();
        System.out.println(arrayUtil1.resultOfExpression(new double[] {1, 2, 3, 4}, operation));
    }
}
