package org.example;


public class Main {
    public static void main(String[] args) {
        JuegoSingleton juego = JuegoSingleton.getInstance();
        juego.inicializar(1, "SweetPain0507", 10, 8, false);

        Juego objJuego = new Juego();
        Lobby objLobby = new Lobby();


        objJuego.metodoJuego();
        objLobby.metodoLobby();

        System.out.println("--------------------------");

        juego.setNombre("Paincake2000");
        juego.setInicioPartida(true);

        objJuego.metodoJuego();
        objLobby.metodoLobby();
    }
}
