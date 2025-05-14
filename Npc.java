package com.mycompany.laberinto;

/**
 *
 * @author cruces
 */
public class Npc {
    private String nombre;
    private String pista;
    
    public Npc(String nombre, String pista){
        this.nombre = nombre;
        this.pista = pista;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPista() {
        return this.pista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
    
}
