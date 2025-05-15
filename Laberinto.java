/**
 * Clase Laberinto que genera y almacena las celdas
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Laberinto {

    private String dificultad;
    private Celda[][] celdas;

    /**
     * Constructor.
     * @param dificultad: nivel de dificultad del laberinto
     * @param numCeldasX numero de columnas del laberinto
     * @param numCeldasY num de filas del laberinto
     */
    public Laberinto(String dificultad, int numCeldasX, int numCeldasY) {
        this.elegirLaberinto(dificultad, numCeldasX, numCeldasY);
    }

    /**
     * Inicializa el laberinto
     * @param dificultad nivel del laberinto
     * @param numCeldasX numero de columnas del laberinto
     * @param numCeldasY num de filas del laberinto
     */
    public void elegirLaberinto(String dificultad, int numCeldasX, int numCeldasY) {
        if (numCeldasX <= 0 || numCeldasY <= 0) {
            System.out.println("El tamaño del laberinto debe ser mayor que 0.");
        }
        this.dificultad = dificultad;
        this.celdas = new Celda[numCeldasX][numCeldasY];

        for (int i = 0; i < numCeldasX; i++) {
            for (int j = 0; j < numCeldasY; j++) {
                this.celdas[i][j] = new Celda(i, j);
            }
        }
    }

    /**
     * Devuelve la dificultad
     * @return nivel de dificultad
     */
    public String getDificultad() {
        return this.dificultad;
    }

    /**
     * Devuelve las celda
     * @return matriz de celdas
     */
    public Celda[][] getCeldas() {
        return this.celdas;
    }

    /**
     * Establece la dificultad
     * @param dificultad nuevo nivel
     */
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Establece las celdas
     * @param celdas nueva matriz de celdas
     */
    public void setCeldas(Celda[][] celdas) {
        this.celdas = celdas;
    }

}