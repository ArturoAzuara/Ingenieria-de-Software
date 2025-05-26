package mx.unam.aragon.ico.is.albumesapi;

import mx.unam.aragon.ico.is.albumesapi.entities.Album;
import mx.unam.aragon.ico.is.albumesapi.repositories.AlbumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class AlbumesapiApplicationTests {
	@Autowired
	private AlbumRepository albumRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertAlbum() {
		Album album = new Album();
		album.setTitulo("Definity Maybe");
		album.setArtista("Oasis");
		album.setAnioLanzamiento(2003);
		album.setGenero("Alternativo");

		albumRepository.save(album);

	}

	@Test
	void deleteAlbum() {
		int idAEliminar = 3;
		albumRepository.deleteById(idAEliminar);
	}
	@Test
	void updateAlbum() {
		int idActualizar = 5;
		Optional<Album> albumOptional = albumRepository.findById(idActualizar);
		if (albumOptional.isPresent()) {
			Album album = albumOptional.get();
			album.setTitulo("Amnesiac");
			album.setArtista("Radiohead");
			album.setAnioLanzamiento(2001);
			album.setGenero("Experimental Rock");
			albumRepository.save(album);
			System.out.println("Se actualizo");
		} else {
			System.out.println("No se encontro el álbum con ID " + idActualizar);
		}
	}
	@Test
	void getAlbums() {
		Iterable<Album> albumes = albumRepository.findAll();

		for (Album album : albumes) {
			System.out.println("ID: " + album.getIdAlbum());
			System.out.println("Título: " + album.getTitulo());
			System.out.println("Artista: " + album.getArtista());
			System.out.println("Año: " + album.getAnioLanzamiento());
			System.out.println("Género: " + album.getGenero());
			System.out.println("------------------------");
		}
	}
	@Test
	void getAlbumPorId() {
		int idBuscar = 2;
		Optional<Album> albumOptional = albumRepository.findById(idBuscar);

		if (albumOptional.isPresent()) {
			Album album = albumOptional.get();
			System.out.println("ID: " + album.getIdAlbum());
			System.out.println("Título: " + album.getTitulo());
			System.out.println("Artista: " + album.getArtista());
			System.out.println("Año: " + album.getAnioLanzamiento());
			System.out.println("Género: " + album.getGenero());
		} else {
			System.out.println("No se encontró el álbum con ID " + idBuscar);
		}
	}
	@Test
	void updateAlbumParcial() {
		int idActualizar = 5;
		Optional<Album> albumOptional = albumRepository.findById(idActualizar);

		if (albumOptional.isPresent()) {
			Album album = albumOptional.get();


			album.setAnioLanzamiento(1994);

			albumRepository.save(album);
			System.out.println("Se actualizó parcialmente");
		} else {
			System.out.println("No se encontró el álbum con ID " + idActualizar);
		}
	}


}
