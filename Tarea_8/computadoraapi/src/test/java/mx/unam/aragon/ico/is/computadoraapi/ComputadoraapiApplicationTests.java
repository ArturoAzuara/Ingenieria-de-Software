package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora(){
		Computadora computadora = new Computadora(0,"HP","Pavilion2000", null, 13000.0f);
		computadoraRepository.save(computadora); //insert into
	}

	@Test
	void leerComputadoraPorClave(){
		int claveTmp= 2;
		computadoraRepository.findComputadoraByClave(claveTmp);
	}
	@Test
	public void eliminarComputadora(){
		int claveTmp= 2;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora(){
		int claveTmp= 4;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito 3000");
		computadoraRepository.save(tmp);

	}

}
