package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.antonio.Exception.HeroeNoEncontradoException;
import org.antonio.Model.GestorHeroes;
import org.antonio.Model.Heroe;
import org.junit.Before;
import org.junit.Test;

public class TestGestorHeroes {
    Heroe ironMan;
    Heroe spiderMan;
    Heroe capitanAmerica;
    Heroe catwoman;
    GestorHeroes gh;


    @Before
    public void setUp(){
        ironMan = new Heroe("Iron Man", "Traje de alta tecnología", "Millonario y filántropo");
        spiderMan = new Heroe("Spider-Man", "Sentido arácnido, trepador", "Tímido estudiante de secundaria");
        capitanAmerica = new Heroe("Capitán América", "Superfuerza, agilidad, resistencia", "Soldado de la Segunda Guerra Mundial");
        catwoman = new Heroe("Catwoman", "Superfuerza, trepar, arañar", "Su indumentaria le permite moverse ágilmente");
        
        gh =  new GestorHeroes();
        gh.agregarHeroe(capitanAmerica);
        gh.agregarHeroe(ironMan);
        gh.agregarHeroe(spiderMan);
        gh.agregarHeroe(catwoman);
    }

    @Test
    public void testGetters(){
        
        GestorHeroes lista= new GestorHeroes();
        lista.agregarHeroe(capitanAmerica);
        lista.agregarHeroe(ironMan);
        lista.agregarHeroe(spiderMan);
        lista.agregarHeroe(ironMan);
        assertNotSame(lista.getHeroes(), gh.getHeroes());
        assertEquals(lista.getHeroes().size(), gh.getHeroes().size());
    }

    @Test
    public void testAddSeek()throws HeroeNoEncontradoException{
        gh.agregarHeroe(catwoman);
        assertSame(catwoman, gh.buscarHeroe("Catwoman"));
    }


    @Test(expected = HeroeNoEncontradoException.class)
    public void testHeroeNoEncontradoException() throws HeroeNoEncontradoException{
        gh.buscarHeroe("Linterna Verde");
    }

    @Test
    public void actualizaTest() throws HeroeNoEncontradoException{
        capitanAmerica.setDescripcion("Superfuerza, agilidad, resistencia, saltos en altura");
        Heroe h = gh.buscarHeroe(capitanAmerica.getNombre());
        assertNotNull(h.getDescripcion());
        assertEquals(capitanAmerica.getDescripcion(), h.getDescripcion());

    }

    @Test
    public void  eliminaTest() throws HeroeNoEncontradoException{
        int cantidad = gh.getHeroes().size();
        gh.eliminarHeroe(spiderMan.getNombre());
        assertTrue(cantidad > gh.getHeroes().size());       
    }

    @Test(expected = HeroeNoEncontradoException.class)
    public void testBuscarHeroeEliminadoNoEncontrado() throws HeroeNoEncontradoException{
        gh.eliminarHeroe(spiderMan.getNombre());
        gh.buscarHeroe(spiderMan.getNombre());
    }

    @Test
    public void testMultipleAgregado() throws HeroeNoEncontradoException {
        Heroe h1 = gh.buscarHeroe(spiderMan.getNombre());
        Heroe h2 = gh.buscarHeroe(ironMan.getNombre());
        Heroe h3 = gh.buscarHeroe(capitanAmerica.getNombre());
        assertNotEquals(ironMan.getNombre(), h1.getNombre());
        assertSame(ironMan, h2);
        assertEquals(capitanAmerica.getBiografia(), h3.getBiografia());
    }

    @Test
    public void testBusquedaHeroePorSuperpoder() throws HeroeNoEncontradoException{
        assertSame(spiderMan, gh.buscarHeroePorSuperpoder("trepador"));
        assertEquals(catwoman.getNombre(), gh.buscarHeroePorSuperpoder("arañar").getNombre());
    }

    @Test(expected = HeroeNoEncontradoException.class)
    public void testBusquedaHeroesPorSuperpoderNoEncontrado() throws HeroeNoEncontradoException{
        assertSame(spiderMan, gh.buscarHeroePorSuperpoder("superfuerza"));
    }

    @Test
    public void testActualizaHeroe() throws HeroeNoEncontradoException {
        Heroe h = new Heroe("Catwoman", "Negociadora", "Le mordió un gato");
        gh.actualizarHeroe(h);
        assertEquals(h.getBiografia(), gh.buscarHeroe(catwoman.getNombre()).getBiografia());
        assertNotNull(gh.buscarHeroe(catwoman.getNombre()));
    }
    
    @Test
    public void testLista(){
        String listaNombres = capitanAmerica.getNombre() + ", " + ironMan.getNombre() + ", " + spiderMan.getNombre() + ", " + catwoman.getNombre();
        assertNotNull(gh.listarHeroes());
        assertEquals(listaNombres, gh.listarHeroes());
        assertNotEquals(ironMan.getNombre(), gh.listarHeroes());
    }

    @Test
    public void testBusquedaHeroesPorSuperpoder() throws HeroeNoEncontradoException{
        List<Heroe> lista = new ArrayList();
        lista.add(spiderMan);
        lista.add(capitanAmerica);
        assertTrue(gh.buscarHeroesPorSuperpoder("arañar").contains(catwoman));
        assertNotSame(lista,gh.buscarHeroesPorSuperpoder("Superfuerza"));
        assertNotNull(gh.buscarHeroesPorSuperpoder(spiderMan.getSuperpoderes()));        
    }


}
