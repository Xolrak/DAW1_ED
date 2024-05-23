package org.antonio;

import org.junit.Test;

import static org.junit.Assert.*;

import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;

public class TestGestorHeroes() {
    GestorHeroes gestor = new GestorHeroes();
    Heroe heroe1 = new Heroe("Hulk", "Superfuerza, regeneración", "Científico transformado en superhéroe");
    Heroe heroe2 = new Heroe("Thor", "Dios del trueno", "Hijo de Odín");
    gestor.agregarHeroe(heroe1);
    gestor.agregarHeroe(heroe2);
}