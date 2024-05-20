/**
 * @version 1.0
 */
package org.antonio;

public class Zoro {
    private String nombre;
    private int poder;
    /**
     * 
     * @param nombre Nombre del personaje en String
     * @param poder Poder del personaje en int
     */
    public Zoro(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    /**
     * 
     * @return Se devuelve el nombre de Zoro
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return Se devuelve el poder de Zoro
     */
    public int getPoder() {
        return poder;
    }
    /**
     * 
     * @param enemigo El personaje que se ataca
     * @see Personaje#recibirDanio(int)
     */
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}
