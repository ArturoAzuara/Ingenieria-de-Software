package org.example;

public class Libros implements Imprenta {
    private int isbn;
    private String nombre;
    private String reseña;
    private String autor;
    private int precio;
    private int paginas;

    public Libros() {
    }

    public Libros(int isbn, String nombre, String reseña, String autor, int precio, int paginas) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.reseña = reseña;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "isbn=" + isbn +
                ", nombre='" + nombre + '\'' +
                ", reseña='" + reseña + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", paginas=" + paginas +
                '}';
    }
}