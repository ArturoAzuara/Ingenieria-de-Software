package org.example;

public class Revistas implements Imprenta{

    private int issn;
    private String nombre;
    private int edicion;
    private int precio;
    private String periodicidad;

    public Revistas() {
    }

    public Revistas(int issn, String nombre, int edicion, int precio, String periodicidad) {
        this.issn = issn;
        this.nombre = nombre;
        this.edicion = edicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "issn=" + issn +
                ", nombre='" + nombre + '\'' +
                ", edicion=" + edicion +
                ", precio=" + precio +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
