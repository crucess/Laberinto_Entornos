/**
 * Clase Npc que guarda nombre y pista
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Npc {
    private String nombre;
    private String pista;

    /**
     * Constructor
     * @param nombre nombre del NPC
     * @param pista pista que da el NPC
     */
    public Npc(String nombre, String pista) {
        this.nombre = nombre;
        this.pista = pista;
    }

    /**
     * Devuelve nombre
     * @return nombre del NPC
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve pista
     * @return pista que da el NPC
     */
    public String getPista() {
        return this.pista;
    }

    /**
     * Establece nombre
     * @param nombre nuevo nombre del NPC
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece pista
     * @param pista nueva pista del NPC
     */
    public void setPista(String pista) {
        this.pista = pista;
    }
}