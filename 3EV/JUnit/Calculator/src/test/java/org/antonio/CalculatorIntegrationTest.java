package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {
    @Test
    public void testAddAndSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, calculator.subtract(6, 3)));
        assertEquals(7, calculator.subtract(13, calculator.add(4, 2)));
        //
        assertNotEquals(8, calculator.add(6, calculator.subtract(43, 2)));
        assertNotEquals(33, calculator.subtract(10, calculator.add(33, 81)));
    }

    @Test
    public void testMultiplyAndDivide() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2f, calculator.divide(6f, 2f)),0.001f);
        assertEquals(0.5, calculator.divide(6, calculator.multiply(4, 3)), 0.001);
        //
        assertNotEquals(5, calculator.multiply(2, calculator.divide(64, 8)), 0.001);
        assertNotEquals(3.0f, calculator.divide(6, calculator.multiply(32, 256)), 0.001);

    }

    @Test
    public void testAddWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(3, 0));
        assertEquals(0, calculator.add(0, 0));
        //
        assertNotEquals(2, calculator.add(3, 0)); 
        assertNotEquals(1, calculator.add(0, 0)); 

    }

    @Test
    public void testSubtractWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(3, 0));
        assertEquals(0, calculator.subtract(0, 0));
        //
        assertNotEquals(2, calculator.subtract(3, 0)); 
        assertNotEquals(1, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiplyWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(-3, 0), 0.001);
        assertEquals(0, calculator.multiply(433, 0), 0.001);
        //
        assertNotEquals(33, calculator.multiply(76, 0), 0.001);
        assertNotEquals(33, calculator.multiply(-354, 0), 0.001);
    }

    @Test
    public void testDivideWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0f, calculator.divide(0, 32), 0.001);
        assertEquals(0.0f, calculator.divide(0, -345), 0.001);
        //
        assertNotEquals(0.0f, calculator.divide(3, 4), 0.001);
        assertNotEquals(0.0f, calculator.divide(4, -5), 0.001);
    }
}
