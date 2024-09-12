package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Tecnico;

import java.util.List;

public interface ICrudGerente {
    public boolean crearGerente (String nombre, String id, Departamento departamento);
    public boolean eliminarGerente (String id);
    public boolean actualizarGerente (String nombre, String id, Departamento departamento);
    public Gerente getGerente (String id);
    public List<Gerente> getGerentes (String nombre);
}
