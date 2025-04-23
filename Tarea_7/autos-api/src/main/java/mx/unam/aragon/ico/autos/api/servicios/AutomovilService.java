package mx.unam.aragon.ico.autos.api.servicios;

import mx.unam.aragon.ico.autos.api.modelos.Automovil;

import java.util.List;

public interface AutomovilService {
    public List<Automovil> getAutomovils();
    public Automovil getAutomovil(Long id);
    public Automovil createAutomovil(Automovil automovil);
}
