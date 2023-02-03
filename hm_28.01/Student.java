package com.company;

import org.jetbrains.annotations.NotNull;


public class Student {
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

    public Student(String surname, int groupNumber, int[] marks) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public boolean excellent_student (int[] marks){
        for (int i = 0; i < marks.length; i++){
            if (marks[i] == 3) {
                return false;
            }
        }
        return true;
  }
}
