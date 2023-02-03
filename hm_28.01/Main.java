package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // homework exercise №1
        System.out.println("Enter rectangle's length and width: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int wid = in.nextInt();
	    Rectangle rectangle = new Rectangle(len, wid);
        System.out.println(rectangle.perimeter(rectangle.getLength(), rectangle.getWidth()));
        System.out.println(rectangle.square(rectangle.getLength(), rectangle.getWidth()));
        System.out.println();

        // homework exercise №2
         Student[] arr = new Student[3];
         arr [0] = new Student("Ivanov", 11, new int[]{5, 4, 3, 5, 5});
         arr [1] = new Student("Petrov", 13, new int[]{5, 4, 4, 4, 5});
         arr [2] = new Student("Sidorov", 12, new int[]{5, 4, 4, 5, 5});
        for(int i =0; i < arr.length; i++){
            if (arr[i].excellent_student(arr[i].getMarks()))
            System.out.println(arr[i].getSurname());
        }
        System.out.println();

        // homework exercise №3
        StudentMaxMark[] arrMax = new StudentMaxMark[3];
        arrMax [0] = new StudentMaxMark("Ivanov", 11, new int[]{2, 4, 3, 3, 3});
        arrMax [1] = new StudentMaxMark("Petrov", 13, new int[]{5, 2, 4, 4, 5});
        arrMax [2] = new StudentMaxMark("Sidorov", 12, new int[]{3, 4, 4, 3, 4});

        for (int i = 0; i < arrMax.length; i++){
            System.out.println(arrMax[i].getSurname() + ": " + arrMax[i].MaxMark(arrMax[i].getMarks()));
        }
    }
}
