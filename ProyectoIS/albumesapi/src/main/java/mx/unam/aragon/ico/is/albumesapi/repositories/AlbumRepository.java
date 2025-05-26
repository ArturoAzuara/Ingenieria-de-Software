package mx.unam.aragon.ico.is.albumesapi.repositories;

import mx.unam.aragon.ico.is.albumesapi.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
