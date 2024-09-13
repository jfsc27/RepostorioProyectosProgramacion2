package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

import java.util.List;

public interface ICrudTecnico {
    public boolean crearTecnico (String nombre, String id);
    public boolean eliminarTecnico (String id);
    public boolean actualizarTecnico (String nombre, String id, String idBuscar);
    public Tecnico getTecnico (String id);
    public List<Tecnico> getTecnicos (String nombre);
}
