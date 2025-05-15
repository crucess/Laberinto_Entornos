/**
 * Clase Trampa que define tipo y daño
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Trampa {

    private String tipo;
    private int damage;
    
    /**
     * Constructor
     * @param tipo tipo de trampa
     * @param damage daño que hace la trampa
     */
    public Trampa(String tipo, int damage) {
        this.tipo = tipo;
        this.damage = damage;
    }
    
    /**
     * Activar trampa
     * @param jugador jugador que recibe daño
     */
    public void activarTrampa(Jugador jugador) {
        int nuevaVida = jugador.getVida() - this.damage;
        if (nuevaVida < 0) nuevaVida = 0;
        jugador.setVida(nuevaVida);
        System.out.println(jugador.getNombre() + " ha activado trampa tipo " + tipo + " y pierde " + damage + " de vida");
    }
    
    /**
     * Devuelve tipo
     * @return tipo de trampa
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * Devuelve damage
     * @return daño de la trampa
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * Establece el tipo de trampa
     * @param tipo tipo de trampa
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Establece el daño
     * @param damage daño de la trampa
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

}