package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestGestorHeroes {
    
    GestorHeroes GestorHeroes;

    @Before
    public void setUp() {
        GestorHeroes = new GestorHeroes();
    }

    @Test
    public void testAgregaryBuscarHeroe() {
        Heroe Jolyne = new Heroe("Jolyne", "Stone Ocean", "Hija de Jotaro", "Portadora de la estrella Joestar");
        GestorHeroes.agregarHeroe(Jolyne);
        try {
            Heroe heroeEncontrado = GestorHeroes.buscarHeroe("Jolyne");
            assertEquals(Jolyne, heroeEncontrado);
        } catch (HeroeNoEncontradoException e) {
            fail("Este mensaje no se debería ver :/"); 
        }
    }

    // no me funciona este test
    @Test
    public void testEliminarHeroe() {
        Heroe Spidey = new Heroe("Peter Parker", "Poderes de araña", "Le picó una araña radiactiva", "Inteligente");
        GestorHeroes.agregarHeroe(Spidey);
        try {
            Heroe heroeEliminado = GestorHeroes.eliminarHeroe("Spidey");
        } catch (HeroeNoEncontradoException e) {
            fail("Este mensaje no se debería ver :/"); 
        }
    }

    @Test
    public void testAgregarVariosHeroes() {
        GestorHeroes = new GestorHeroes();
        Heroe Rei = new Heroe("Rei Ayanami", "Pilota el EVA00", "Desconocida", "Introvertida");
        Heroe Asuka = new Heroe("Asuka Langley","Pilota el EVA02","Nació en Alemania", "Mal caracter");
        try {
            Heroe heroeEncontrado = GestorHeroes.buscarHeroe("Asuka");
            Heroe heroeEncontrado2 = GestorHeroes.buscarHeroe("Rei");
            assertEquals(Asuka, heroeEncontrado);
            assertEquals(Rei, heroeEncontrado2);
        } catch (HeroeNoEncontradoException e) {
            fail("Este mensaje no se debería ver :/"); 
        }
    }
}