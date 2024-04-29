package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test (expected = IllegalArgumentException.class)
    public void testDivideException() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(3, 2));
        calc.divide(5, 0);
    }
}
