package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {
    @Test
    public void testAddAndSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertNotEquals(7, calculator.add(2, 3));
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplyAndDivide() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(2.0f, calculator.divide(6, 3), 0.001);
        assertEquals(-4, calculator.multiply(2, -2));
        assertEquals(-2.0f, calculator.divide(6, -3), 0.001);
    }

    @Test
    public void testAddWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(3, 0));
        assertEquals(3, calculator.add(0, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtractWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(3, 0));
        assertEquals(-3, calculator.subtract(0, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiplyWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(3, 0));
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void testDivideWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0f, calculator.divide(0, 3), 0.001);
        assertEquals(0.0f, calculator.divide(0, -3), 0.001);
    }
}
