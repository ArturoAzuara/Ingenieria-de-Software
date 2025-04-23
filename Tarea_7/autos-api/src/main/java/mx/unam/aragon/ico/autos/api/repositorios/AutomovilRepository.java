package mx.unam.aragon.ico.autos.api.repositorios;

import mx.unam.aragon.ico.autos.api.modelos.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
}
