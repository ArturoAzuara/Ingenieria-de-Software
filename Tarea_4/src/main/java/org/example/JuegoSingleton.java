package org.example;

public class JuegoSingleton {
    private int id;
    private String nombre;
    private int nivel;
    private int maximo_jugadores;
    private boolean inicio_partida;
    private static JuegoSingleton instance;

    private JuegoSingleton() {

    }

    public static JuegoSingleton getInstance() {
        if (instance == null) {
            instance = new JuegoSingleton();
        }
        return instance;
    }

    public void inicializar(int id, String nombre, int nivel, int maximo_jugadores, boolean inicio_partida) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.maximo_jugadores = maximo_jugadores;
        this.inicio_partida = inicio_partida;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getMaximoJugadores() { return maximo_jugadores; }
    public boolean getInicioPartida() { return inicio_partida; }
}
