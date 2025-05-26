package mx.unam.aragon.ico.is.albumesapi.controllers;

import mx.unam.aragon.ico.is.albumesapi.entities.Album;
import mx.unam.aragon.ico.is.albumesapi.services.interfaces.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/albumes")
public class AlbumRestController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Album>> getAlbum() {
        return new ResponseEntity<>(albumService.obtenerTodosLosAlbumes(), HttpStatus.OK);
    }

    @GetMapping("/{clave}")
    public ResponseEntity<Album> getAlbumPorClave(@PathVariable Long clave) {
        Optional<Album> tmp = albumService.obtenerAlbumPorId(clave);
        if (tmp.isPresent()) {
            return new ResponseEntity<>(tmp.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Album> createAlbum(@RequestBody Album album) {
        return new ResponseEntity<>(albumService.guardarAlbum(album), HttpStatus.CREATED);

    }

    @PostMapping("/{id}")
    public ResponseEntity<String> noExiste() {
        return new ResponseEntity<>("End Point no soportado", HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/{clave}")
    public ResponseEntity<Album> updateParcial(@PathVariable Long clave, @RequestBody Album album) {
        Album tmp = albumService.obtenerAlbumPorId(clave).orElse(null);
        if (tmp != null) {
            if (album.getTitulo() != null) tmp.setTitulo(album.getTitulo());
            if (album.getGenero() != null) tmp.setGenero(album.getGenero());
            if (album.getAnioLanzamiento() != null) tmp.setAnioLanzamiento(album.getAnioLanzamiento());
            if (album.getArtista() != null) tmp.setArtista(album.getArtista());

            return new ResponseEntity<>(albumService.actualizarAlbum(clave, tmp), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{clave}")
    public ResponseEntity<Album> updateAlbum(@PathVariable Long clave, @RequestBody Album album) {
        Optional tmp = albumService.obtenerAlbumPorId(clave);
        if (tmp.isPresent()) {
            return new ResponseEntity<>(albumService.actualizarAlbum(clave, album), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{clave}")
    public ResponseEntity<Album> deleteAlbum(@PathVariable Long clave) {
        Optional<Album> tmp = albumService.obtenerAlbumPorId(clave);
        if (tmp.isPresent()) {
            albumService.eliminarAlbumPorId(clave);
            return new ResponseEntity<>(tmp.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
