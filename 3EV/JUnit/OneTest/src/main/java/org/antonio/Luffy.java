package org.antonio;

public class Luffy {
    private String nombre;
    private int poder;
    private int poderMax = 100;
    private int contador = 1;

    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    //Setters
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPoder(int poder) {
        if (contador == 1) {
          this.poder = poderMax;
          contador++;
        }
        else {
          this.poder = poder;
          contador++;
        }
    }


    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}