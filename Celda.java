/**
 * Clase Celda que guarda las coordenadas X e Y de cada casilla del laberinto
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Celda {
    private int posX;
    private int posY;

    /**
     * El constructor para crear celdas
     * @param posX posición X de la celda
     * @param posY posición Y de la celda
     */
    public Celda(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * Setea la nueva posicion X
     * @param posX nueva posición X
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Setea la nueva posicion Y
     * @param posY nueva posición Y
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Devuelve la X
     * @return posición X actual
     */
    public int getPosX() {
        return this.posX;
    }

    /**
     * Devuelve la Y
     * @return posición Y actual
     */
    public int getPosY() {
        return this.posY;
    }
}