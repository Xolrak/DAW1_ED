/**
 * @version 1.0
 */
package org.antonio;

public class Fruta {

    private String nombre;
    private boolean esDeliciosa;
    /** 
     * @param nombre Nombre de la fruta en String
     * @param esDeliciosa Determina si es deliciosa mediante boleano
     */
    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }
    /**
     * @return devuelve el nombre de la fruta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @return si es deliciosa será True
     */
    public boolean esDeliciosa() {
        return esDeliciosa;
    }
    /**
     * @return será verdadero si es deliciosa y no es igual a "Fruta del Diablo"
     */
    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}
