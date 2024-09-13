package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;

import java.util.List;

public interface ICrudGerente {
    public boolean crearGerente (String nombre, String id);
    public boolean eliminarGerente (String id);
    public boolean actualizarGerente (String nombre, String id, String idBuscar);
    public Gerente getGerente (String id);
    public List<Gerente> getGerentes (String nombre);
}
