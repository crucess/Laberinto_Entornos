/**
 * Clase Juego que controla el flujo de la partida del laberinto
 *
 * @author cruces
 * @version 1.0
 */
package com.mycompany.laberinto;

public class Juego {

    private Laberinto laberinto;
    private Jugador jugador;
    private String estado;
    private float limite_tiempo;

    /**
     * Constructor
     * Inicializa el estado y el límite de tiempo
     */
    public Juego() {
        this.estado = "No iniciado";
        this.limite_tiempo = 0;
    }

    /**
     * Inicia la partida
     */
    public void iniciarPartida() {
        this.estado = "En progreso";
        System.out.println("La partida ha comenzado");
    }

    /**
     * Guarda el progreso de la partida
     */
    public void guardarProgreso() {
        System.out.println("Progreso guardado para el jugador " + jugador.getNombre());
    }

    /**
     * Termina la partida
     */
    public void terminarPartida() {
        this.estado = "Finalizado";
        System.out.println("La partida ha terminado");
    }
    
    /**
     * Avanza el tiempo de la partida
     * @param segundos segundos a restar del límite
     */
    public void avanzarTiempo(float segundos) {
        this.limite_tiempo -= segundos;

        float tiempoRestante = this.limite_tiempo;
        if (tiempoRestante < 0) {
            tiempoRestante = 0;
        }

        System.out.println("Han pasado " + segundos + " segundos. Quedan " + tiempoRestante + " segundos para que termine la partida");
        
        if (this.limite_tiempo <= 0) {
            this.limite_tiempo = 0;
            terminarPartida();
        }
    }

    /**
     * Devuelve el laberinto actual
     * @return laberinto del juego
     */
    public Laberinto getLaberinto() {
        return this.laberinto;
    }

    /**
     * Devuelve el jugador
     * @return jugador actual
     */
    public Jugador getJugador() {
        return this.jugador;
    }

    /**
     * Devuelve el estado de la partida
     * @return estado actual
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * Devuelve el tiempo límite
     * @return límite de tiempo restante
     */
    public float getLimite_tiempo() {
        return this.limite_tiempo;
    }

    /**
     * Establece el laberinto
     * @param laberinto nuevo laberinto
     */
    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    /**
     * Pone el jugador
     * @param jugador nuevo jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Le pone el estado de la partida
     * @param estado nuevo estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Le pone el tiempo limite
     * @param limite_tiempo nuevo limite de tiempo
     */
    public void setLimite_tiempo(float limite_tiempo) {
        this.limite_tiempo = limite_tiempo;
    }

}