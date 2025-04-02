package org.example;

public class Juego {
    public void metodoJuego(){
        JuegoSingleton juego = JuegoSingleton.getInstance();
        System.out.println("Estas jugando: " + juego.getNombre());
    }
}
