package org.antonio.Model;

import org.antonio.Exception.HeroeNoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class GestorHeroes {
    private List<Heroe> heroes;

    public GestorHeroes() {
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe) {
        this.heroes.add(heroe);
    }
    public List<Heroe> getHeroes() {
    return this.heroes;
    }

    public Heroe buscarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }
    public void eliminarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (int i = 0; i < this.heroes.size(); i++) {
            Heroe heroe = this.heroes.get(i);
            if (heroe.getNombre().equals(nombre)) {
                this.heroes.remove(i);
                return;
            }
        }
        throw new HeroeNoEncontradoException(nombre);
    }
}