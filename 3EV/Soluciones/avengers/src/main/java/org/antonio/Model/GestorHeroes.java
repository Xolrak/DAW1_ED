package org.antonio.Model;

import java.util.ArrayList;
import java.util.List;

import org.antonio.Exception.HeroeNoEncontradoException;

public class GestorHeroes {
    private List<Heroe> heroes;

    public GestorHeroes() {
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe) {
        this.heroes.add(heroe);
    }

    public Heroe buscarHeroe(String nombre) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getNombre().equals(nombre)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException("nombre "+nombre);
    }
    public List<Heroe> getHeroes(){
        return heroes;
    }

    public void eliminarHeroe(String nombre) throws HeroeNoEncontradoException {
        Heroe whoIsThisHeroe=this.buscarHeroe(nombre);
        this.heroes.remove(whoIsThisHeroe);
    }

    public Heroe buscarHeroePorSuperpoder(String superpoder) throws HeroeNoEncontradoException {
        for (Heroe heroe : this.heroes) {
            if (heroe.getSuperpoderes().contains(superpoder)) {
                return heroe;
            }
        }
        throw new HeroeNoEncontradoException("superpoder "+superpoder);
    }

    public List<Heroe> buscarHeroesPorSuperpoder(String superpoder) throws HeroeNoEncontradoException {
        List<Heroe> lista = new ArrayList<>();
        for (Heroe heroe : this.heroes) {
            if (heroe.getSuperpoderes().contains(superpoder)) {
                lista.add(heroe);
            }
        }

        if (lista.isEmpty()) 
            throw new HeroeNoEncontradoException("superpoder "+superpoder);
        
        return lista;
    }

    public void actualizarHeroe(Heroe heroeActualizado) throws HeroeNoEncontradoException {
        Heroe heroeAActualizar=this.buscarHeroe(heroeActualizado.getNombre());
        this.heroes.add(heroeActualizado);
        this.heroes.remove(heroeAActualizar);
    }

    public String listarHeroes(){
        List<String> listaNombresHeroes = new ArrayList<>();
        for (Heroe heroe : heroes) {
            listaNombresHeroes.add(heroe.getNombre());
        }

        String listado = String.join(", ", listaNombresHeroes);
        
        return listado;
    }
}
