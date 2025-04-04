package org.example;

public class Revistas implements Imprenta{
    private String titulo;
    private String editor;
    private String genero;
    private int numero;
    private int precio;

    public Revistas() {
    }

    public Revistas(String titulo, String editor, String genero, int numero, int precio) {
        this.titulo = titulo;
        this.editor = editor;
        this.genero = genero;
        this.numero = numero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", genero='" + genero + '\'' +
                ", numero=" + numero +
                ", precio=" + precio +
                '}';
    }
}
