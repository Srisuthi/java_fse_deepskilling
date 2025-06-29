package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator cleared");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 4, b = 6;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }
}
