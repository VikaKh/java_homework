package com.company;

@FunctionalInterface
public interface ElementOfArray <U, T>{
    int countOfEntry(U a, T b);
}