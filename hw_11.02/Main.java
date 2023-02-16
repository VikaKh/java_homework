package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElementOfArray<String,String[]> elementOfArray = (c, arr) -> {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(c)) {
                    count++;
                }
            }
            return count;
        };

        ElementOfArray<Integer, Integer[]> elementOfArray1 = (c , arr) -> {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(c)) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(elementOfArray.countOfEntry("abc", new String[]{"abc", "abd", "def", "acf", "abc", "afx"}));
        System.out.println(elementOfArray1.countOfEntry(5, new Integer[]{1, 5, 6, 7, 5, 10, 5, 2, 5, 5}));
    }
}
