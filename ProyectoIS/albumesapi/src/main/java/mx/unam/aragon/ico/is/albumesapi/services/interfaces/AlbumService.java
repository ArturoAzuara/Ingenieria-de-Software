package mx.unam.aragon.ico.is.albumesapi.services.interfaces;

import mx.unam.aragon.ico.is.albumesapi.entities.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    Album guardarAlbum(Album album);
    void eliminarAlbumPorId(Long id);
    Optional<Album> obtenerAlbumPorId(Long id);
    List<Album> obtenerTodosLosAlbumes();
    Album actualizarAlbum(Long id, Album album);
    Album actualizarAlbumParcial(Long id, Album datosParciales);
}
