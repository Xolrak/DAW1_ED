package org.antonio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestBarco {

    Barco barco1;
    Barco barco2;

    @Before
    public void setUp() {
        barco1 = new Barco("Thousand Sunny", 5);
        barco2 = new Barco("Going Merry", 10);
    }

    @Test
    public void testAgregarTripulante() {
        boolean capacidad = barco1.agregarTripulante();
        assertTrue("Thousand Sunny", capacidad);
    }
    @Test
    public void testAgregarTripulanteMaximo() {
        boolean resultado = barco2.agregarTripulante();
        assertFalse("Going Merry", resultado);
    }
}
