package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestHeroes {
    Heroe ironman = null;
    Heroe spiderman = null;
    Heroe capitanAmerica = null;

    @Before
    public void setUp() {
        ironman = new Heroe("Iron Man", "Traje de alta tecnología", "Filantropo y rico", "3000");
        spiderman = new Heroe("Peter Parker", "Sentido arácnido","Estudiante", "Amigo y vecino");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial","capi");
    }
    @Test
    public void testSettersHeroe() {
        Heroe catWoman = new Heroe(null, null, null, null);
        catWoman.setNombre("Cat Woman");
        catWoman.setSuperpoderes("Trepar y arañar");
        catWoman.setBiografia("Es la amiga de Batman");

        assertEquals("Cat Woman", catWoman.getNombre());
        assertEquals("Trepar y arañar", catWoman.getSuperpoderes());
        assertEquals("Es la amiga de Batman", catWoman.getBiografia());

        assertNotEquals("Giorno Giovanna", catWoman.getNombre());
        assertNotEquals("Golden Wild Experience", catWoman.getSuperpoderes());
        assertNotEquals("Hijo de DIO", catWoman.getBiografia());
    }
}