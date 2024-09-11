package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Proyecto;

public interface ICrudProyecto {
    public  boolean crearProyecto (String nombre, String codigo);
    public  boolean eliminarProyecto(String codigo);
    public  boolean actualizarProyecto(String nombre, String codigo);
    public Proyecto getProyecto (String codigo);
}
