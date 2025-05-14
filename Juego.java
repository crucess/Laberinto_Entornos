package com.mycompany.laberinto;

public class Juego {

    private Laberinto laberinto;
    private Jugador jugador;
    private String estado;
    private float limite_tiempo;

    // Constructor
    public Juego() {
        this.estado = "No iniciado";
        this.limite_tiempo = 0;
    }

    // Metodo para iniciar la partida
    public void iniciarPartida() {
        this.estado = "En progreso";
        System.out.println("La partida ha comenzado");
    }

    // Guardar el progreso de la partda actual
    public void guardarProgreso() {
        System.out.println("Progreso guardado para el jugador " + jugador.getNombre());
    }

    // Terminamos la partida actual
    public void terminarPartida() {
        this.estado = "Finalizado";
        System.out.println("La partida ha terminado");
    }
    
    public void avanzarTiempo(float segundos) {
        // Restamos tiempo
        this.limite_tiempo -= segundos;

        // Tiempo no negativo
        float tiempoRestante = this.limite_tiempo;
        if (tiempoRestante < 0) {
            tiempoRestante = 0;
        }

        System.out.println("Han pasado " + segundos + " segundos. Quedan " + tiempoRestante + " segundos para que termine la partida");
        
        // Terminamos partida si se acaba el tiempo
        if (this.limite_tiempo <= 0) {
            this.limite_tiempo = 0;
            terminarPartida();
        }
    }

    // Getters
    public Laberinto getLaberinto() {
        return this.laberinto;
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    public String getEstado() {
        return this.estado;
    }

    public float getLimite_tiempo() {
        return this.limite_tiempo;
    }

    // Setters
    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLimite_tiempo(float limite_tiempo) {
        this.limite_tiempo = limite_tiempo;
    }

}
