package org.example;

public class Lobby {
    public void metodoLobby(){
        JuegoSingleton juego = JuegoSingleton.getInstance();
        System.out.println("La partida inicio: " + juego.getInicioPartida());
    }
}

