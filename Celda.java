package com.mycompany.laberinto;

/**
 *
 * @author cruces
 */
public class Celda {
    private int posX;
    private int posY;
    
    // Constructor
    public Celda(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
    
    // Getters
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    // Setter
    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }
}
