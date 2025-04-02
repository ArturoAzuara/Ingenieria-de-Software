package org.example;

public class Lobby {
    public void metodoLobby(){
        JuegoSingleton lobby = JuegoSingleton.getInstance();
        System.out.println("Nivel del jugador: " + lobby.getNivel());
        System.out.println("Jugadores en el Lobby: " + lobby.getMaximoJugadores());
        System.out.println("La partida inicio: " + lobby.getInicioPartida());

    }
}

