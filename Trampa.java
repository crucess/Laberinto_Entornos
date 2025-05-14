package com.mycompany.laberinto;

/**
 *
 * @author cruces
 */
public class Trampa {

    private String tipo;
    private int damage;
    
    // Constructor
    public Trampa(String tipo, int damage) {
        this.tipo = tipo;
        this.damage = damage;
    }
    
    // Metodo para quitarle vida a un jugador cuando active una trampa
    public void activarTrampa(Jugador jugador) {
        int nuevaVida = jugador.getVida() - this.damage;
        if (nuevaVida < 0) {
            nuevaVida = 0;
        }
        jugador.setVida(nuevaVida);
        System.out.println(jugador.getNombre() + " ha activado una trampa de tipo " + tipo + " y ha perdido " + damage + " de vida!");
    }
    
    
    // Getters y Setters
    public String getTipo() {
        return this.tipo;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
