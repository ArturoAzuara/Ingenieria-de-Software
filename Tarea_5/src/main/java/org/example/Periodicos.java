package org.example;

public class Periodicos implements Imprenta {
    private int paginas;
    private String nombre;
    private String dia;
    private String mes;
    private String anio;
    private int precio;

    public Periodicos() {
    }

    public Periodicos(int paginas, String nombre, String dia, String mes, String anio, int precio) {
        this.paginas = paginas;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Periodicos{" +
                "paginas=" + paginas +
                ", nombre='" + nombre + '\'' +
                ", dia='" + dia + '\'' +
                ", mes='" + mes + '\'' +
                ", anio='" + anio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
