package com.mycompany.laberinto;

public class Jugador {

    private String nombre;
    private int vida;
    private int posX;
    private int posY;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.posX = 0;
        this.posY = 0;
    }

    public void mover(String direccion) {
        switch (direccion.toLowerCase()) {
            case "arriba":
                this.posY--;
                break;
            case "abajo":
                this.posY++;
                break;
            case "izquierda":
                this.posX--;
                break;
            case "derecha":
                this.posX++;
                break;
            default:
                System.out.println("Dirección no válida.");
                break;
        }
    }
    
    public void curarse(){
        this.vida += 50;
        if(this.vida > 100){
            this.vida = 100;
        }
        System.out.println(this.nombre+" se ha curado 50 puntos de vida, ahora tiene "+this.vida+" puntos de vida!");
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
