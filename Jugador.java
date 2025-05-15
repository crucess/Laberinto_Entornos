/**
 * Clase Jugador que maneja nombre, vida y posicion del jugador
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Jugador {

    private String nombre;
    private int vida;
    private int posX;
    private int posY;

    /**
     * Constructor
     * @param nombre: nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.posX = 0;
        this.posY = 0;
    }

    /**
     * Mueve al jugador
     * @param direccion arriba, abajo, izquierda o derecha
     */
    public void mover(String direccion) {
        switch (direccion.toLowerCase()) {
            case "arriba": this.posY--; break;
            case "abajo": this.posY++; break;
            case "izquierda": this.posX--; break;
            case "derecha": this.posX++; break;
            default: System.out.println("Dirección no válida."); break;
        }
    }

    /**
     * Cura al jugador
     */
    public void curar() {
        this.vida += 50;
        if (this.vida > 100) this.vida = 100;
        System.out.println(this.nombre + " se ha curado y ahora tiene " + this.vida + " de vida.");
    }

    /**
     * Devuelve el nombre
     * @return nombre del jugador
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve la vida
     * @return puntos de vida actuales
     */
    public int getVida() {
        return this.vida;
    }

    /**
     * Devuelve la posición X
     * @return coordenada X
     */
    public int getPosX() {
        return this.posX;
    }

    /**
     * Devuelve la posición Y
     * @return coordenada Y
     */
    public int getPosY() {
        return this.posY;
    }

    /**
     * Establece el nombre
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la vida
     * @param vida nuevos puntos de vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Establece la posición X
     * @param posX nueva coordenada X
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Establece la posición Y
     * @param posY nueva coordenada Y
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }
}