package com;

import org.junit.Assert.*;

import com.ccg.Ejercicios;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EjerciciosTest {
    @Test
    public void testSuma() {
        Ejercicios ej = new Ejercicios();
        assertEquals(5, ej.suma(3, 2));
        assertEquals(-33, ej.suma(-22, -11));
        assertNotEquals(69, ej.suma(33, 33));
        assertNotEquals(-43, ej.suma(-34, -100));
    }
    @Test
    public void testSort() {
        Ejercicios ej = new Ejercicios();
            assertArrayEquals(new int [] {1, 2, 3 ,4}, ej.sort(new int [] {4, 3, 2 ,1}));
            
        }
    }
}
