package mx.unam.aragon.ico.autos.api.controladores;

import mx.unam.aragon.ico.autos.api.modelos.Automovil;
import mx.unam.aragon.ico.autos.api.servicios.AutomovilService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/autos")
public class AutomovilRestController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping("/")
    public ResponseEntity<List<Automovil>> getAutomovil(){
        return ResponseEntity.ok(automovilService.getAutomovils());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Automovil> getAutomovil(@PathVariable Long id){
        //LoggerFactory.getLogger(AutomovilRestController.class).debug("getAutomovil: {}",id);
        return ResponseEntity.ok(automovilService.getAutomovil(id));
    }

    @PostMapping("/")
    public ResponseEntity<Automovil> createAutomovil(@RequestBody Automovil automovil){
        return ResponseEntity.ok(automovilService.createAutomovil(automovil));
    }

}
