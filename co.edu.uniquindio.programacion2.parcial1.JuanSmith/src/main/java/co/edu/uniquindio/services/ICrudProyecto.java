package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Proyecto;

import java.util.List;

public interface ICrudProyecto {
    public  boolean crearProyecto (String nombre, String codigo);
    public  boolean eliminarProyecto(String codigo);
    public  boolean actualizarProyecto(String nombre, String codigo);
    public Proyecto getProyecto (String codigo);
    public List<Proyecto> getProyectos ();
}
