package mx.unam.aragon.ico.is.albumesapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "albumes")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    private int idAlbum;

    @Column(name = "titulo_album", nullable = false, length = 50)
    @NotBlank(message = "No acepta campos vacios")
    @NotNull(message = "No deberia ser nulo")
    private String titulo;

    @Column(name = "artista_album", columnDefinition = "VARCHAR(50) not null")
    private String artista;

    @Column(name = "anio_album", nullable = false, length = 10)
    private Integer anioLanzamiento;

    @Column(name = "genero_album", nullable = false, length = 20)
    private String genero;

    public Album() {
    }

    public Album(int idAlbum, String titulo, String artista, Integer anioLanzamiento, String genero) {
        this.idAlbum = idAlbum;
        this.titulo = titulo;
        this.artista = artista;
        this.anioLanzamiento = anioLanzamiento;
        this.genero = genero;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(Integer anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Album{" +
                "idAlbum=" + idAlbum +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return idAlbum == album.idAlbum && Objects.equals(titulo, album.titulo) && Objects.equals(artista, album.artista) && Objects.equals(anioLanzamiento, album.anioLanzamiento) && Objects.equals(genero, album.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlbum, titulo, artista, anioLanzamiento, genero);
    }
}