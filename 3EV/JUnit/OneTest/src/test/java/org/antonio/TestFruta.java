package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestFruta {

    Fruta Manzana = null;
    Fruta FrutaDiablo = null;
    Fruta Durian = null;

    @Before
    public void setUp() {
        Manzana = new Fruta("Manzana", true);
        FrutaDiablo = new Fruta("Fruta del Diablo", false);
        Durian = new Fruta("Durian", false);
    }

    @Test
    public void testPuedoComerFrutaDeliciosa() {
        boolean resultado = Manzana.esDeliciosa();
        assertTrue(resultado);
    }

    @Test
    public void testPuedoComerFrutaDelDiablo() {
        boolean resultado = FrutaDiablo.esDeliciosa();
        assertFalse(resultado);
    }

    @Test
    public void testPuedoComerNoDeliciosa() {
        boolean resultado = Durian.esDeliciosa();
        assertFalse(resultado);
    }
}
