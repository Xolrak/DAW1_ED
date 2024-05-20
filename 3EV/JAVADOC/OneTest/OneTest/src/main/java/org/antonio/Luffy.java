/**
 * @version 1.0
 */
package org.antonio;

public class Luffy {
    private String nombre;
    private int poder;


/**
 * 
 * @param nombre nombre del personaje en String
 * @param poder poder del personaje en int
 */
    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    /**
     * 
     * @return devuelve el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return devuelve el poder total del personaje
     */
    public int getPoder() {
        return poder;
    }

    // Método para atacar a otro personaje
    /**
     * 
     * @param enemigo apunta al personaje enemigo
     * @see Personaje#recibirDanio(int)
     */
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}