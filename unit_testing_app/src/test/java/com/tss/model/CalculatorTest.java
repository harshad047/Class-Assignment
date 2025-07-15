package com.tss.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterAll
    static void display() {
        System.out.println("Testing done");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.addition(3, 2));
        assertEquals(9, calculator.addition(5, 4));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.Substraction(3, 2));
        assertEquals(2, calculator.Substraction(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiplication(3, 2));
        assertEquals(9, calculator.multiplication(3, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.division(4, 2));
        assertEquals(0, calculator.division(3, 0));
        // Test division by zero
        assertThrows(ArithmeticException.class, () -> calculator.division(3, 0));
    }
}
