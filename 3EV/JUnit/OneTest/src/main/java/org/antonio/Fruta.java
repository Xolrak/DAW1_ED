package org.antonio;

public class Fruta {
    private String nombre;
    private boolean esDeliciosa;

    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }

    public String getNombre() {
        return nombre;
    }

    //Setter para el nombre de la fruta
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esDeliciosa() {
        return esDeliciosa;
    }

    //Setter para determinar si la fruta es deliciosa
    public void setEsDeliciosa(boolean esDeliciosa) {
        this.esDeliciosa = esDeliciosa;
    }

    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}
