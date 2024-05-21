package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        //
        assertNotEquals(4, calculator.add(2, 3));
        assertNotEquals(0, calculator.add(2, -3));

    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
        //
        assertNotEquals(-2, calculator.subtract(2, 3));
        assertNotEquals(4, calculator.subtract(2, -3));

    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(2, 6), 0.001);
        assertEquals(-6, calculator.multiply(2, -3), 0.001);
        //
        assertNotEquals(12, calculator.multiply(2, 6), 0.001); 
        assertNotEquals(6, calculator.multiply(2, -3), 0.001);   

    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0f, calculator.divide(6, 3), 0.001);
        assertEquals(-2.0f, calculator.divide(6, -3), 0.001);
        //
        assertNotEquals(3.0f, calculator.divide(6, 3), 0.001);
        assertNotEquals(2.0f, calculator.divide(6, -3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
}
