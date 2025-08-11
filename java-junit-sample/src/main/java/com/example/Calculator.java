package com.example;

public class Calculator {
    public int add(int left, int right) {
        return left + right;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator must not be zero");
        }
        return (double) numerator / (double) denominator;
    }
}