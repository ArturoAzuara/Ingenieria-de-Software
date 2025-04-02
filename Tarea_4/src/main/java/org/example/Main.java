package org.example;


public class Main {
    public static void main(String[] args) {
        JuegoSingleton juego = JuegoSingleton.getInstance();
        juego.inicializar(1, "Halo Reach", 10, 8, false);

        Juego objJuego = new Juego();
        Lobby objLobby = new Lobby();

        objJuego.metodoJuego();
        objLobby.metodoLobby();
    }
}
