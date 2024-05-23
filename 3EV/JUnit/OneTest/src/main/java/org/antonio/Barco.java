package org.antonio;

public class Barco {
    private String nombre;
    private int capacidad;

    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    //Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //Setter para la capacidad del barco
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}
