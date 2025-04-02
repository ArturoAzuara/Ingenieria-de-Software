package org.example;

public class Juego {
    public void metodoJuego(){
        JuegoSingleton juego = JuegoSingleton.getInstance();
        System.out.println("Jugador numero: " + juego.getId());
        System.out.println("Nombre del jugador: " + juego.getNombre());
    }
}
