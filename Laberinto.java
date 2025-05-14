package com.mycompany.laberinto;

/**
 *
 * @author cruces
 */
public class Laberinto {

    private String dificultad;
    private Celda celdas[][];

    public Laberinto(String dificultad, int numCeldasX, int numCeldasY) {
        this.elegirLaberinto(dificultad, numCeldasX, numCeldasY);
    }

    public void elegirLaberinto(String dificultad, int numCeldasX, int numCeldasY) {
        if (numCeldasX <= 0 || numCeldasY <= 0) {
            System.out.println("El tamaño del laberinto debe ser mayor que 0.");
        }
        this.dificultad = dificultad;
        this.celdas = new Celda[numCeldasX][numCeldasY];

        // Inicializo todas las celdas
        for (int i = 0; i < numCeldasX; i++) {
            for (int j = 0; j < numCeldasY; j++) {
                this.celdas[i][j] = new Celda(i, j);
            }
        }
    }

    public String getDificultad() {
        return this.dificultad;
    }

    public Celda[][] getCeldas() {
        return this.celdas;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setCeldas(Celda[][] celdas) {
        this.celdas = celdas;
    }

}
