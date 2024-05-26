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

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = (capacidad <= 10) ? capacidad : 10;
    }

    public boolean agregarTripulante() {
        if (this.capacidad < 10) {
            this.capacidad++;
            return true;
        }
        return false;
    }
}
