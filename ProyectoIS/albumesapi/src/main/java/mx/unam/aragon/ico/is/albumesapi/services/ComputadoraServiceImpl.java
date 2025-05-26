package mx.unam.aragon.ico.is.albumesapi.services;

import mx.unam.aragon.ico.is.albumesapi.entities.Album;
import mx.unam.aragon.ico.is.albumesapi.repositories.AlbumRepository;
import mx.unam.aragon.ico.is.albumesapi.services.interfaces.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputadoraServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public Album guardarAlbum(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void eliminarAlbumPorId(Long id) {
        albumRepository.deleteById(id.intValue());
    }

    @Override
    public Optional<Album> obtenerAlbumPorId(Long id) {
        return albumRepository.findById(id.intValue());
    }

    @Override
    public List<Album> obtenerTodosLosAlbumes() {
        return (List<Album>) albumRepository.findAll();
    }

    @Override
    public Album actualizarAlbum(Long id, Album album) {
        Optional<Album> existente = albumRepository.findById(id.intValue());
        if (existente.isPresent()) {
            album.setIdAlbum(id.intValue());
            return albumRepository.save(album);
        }
        return null;
    }

    @Override
    public Album actualizarAlbumParcial(Long id, Album datosParciales) {
        Optional<Album> existente = albumRepository.findById(id.intValue());
        if (existente.isPresent()) {
            Album album = existente.get();

            if (datosParciales.getTitulo() != null) {
                album.setTitulo(datosParciales.getTitulo());
            }
            if (datosParciales.getArtista() != null) {
                album.setArtista(datosParciales.getArtista());
            }
            if (datosParciales.getAnioLanzamiento() != 0) {
                album.setAnioLanzamiento(datosParciales.getAnioLanzamiento());
            }
            if (datosParciales.getGenero() != null) {
                album.setGenero(datosParciales.getGenero());
            }

            return albumRepository.save(album);
        }
        return null;
    }
}
