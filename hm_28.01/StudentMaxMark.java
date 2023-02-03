package com.company;

public class StudentMaxMark {
    private String surname;
    private int  groupNumber;
    private int[] marks = new int[5];

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public StudentMaxMark(String surname, int groupNumber, int[] marks) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public int MaxMark(int[] marks){
        int max = marks[0];
        for (int i = 1; i < marks.length; i++){
            if (max < marks[i]){
                max = marks[i];
            }
        }
        return max;
    }
}
