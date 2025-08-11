package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("add: returns sum of two integers")
    void add_returnsSum() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3, 4));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-9, calculator.add(-5, -4));
    }

    @Test
    @DisplayName("divide: returns double result for valid denominator")
    void divide_valid() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2), 1e-9);
        assertEquals(-3.0, calculator.divide(-9, 3), 1e-9);
        assertEquals(0.0, calculator.divide(0, 5), 1e-9);
    }

    @Test
    @DisplayName("divide: throws when denominator is zero")
    void divide_byZero_throws() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(1, 0)
        );
        assertTrue(exception.getMessage().toLowerCase().contains("zero"));
    }
}