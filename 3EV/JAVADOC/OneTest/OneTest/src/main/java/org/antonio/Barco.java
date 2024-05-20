/**
 * @version 1.0
 */
package org.antonio;

public class Barco {
    private String nombre;
    private int capacidad;

    /**
     * 
     * @param nombre Nombre del barco en String
     * @param capacidad Capacidad máxima del barco
     */
    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    /**
     * 
     * @return Devuelve el nombre del barco
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return Devuelva la capacidad del del barco
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * 
     * @return Verdadero o falso en función de si la capacidad del barco ha llegado a 10
     */
    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}
