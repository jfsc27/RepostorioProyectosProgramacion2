package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;

import java.util.List;

public interface ICrudDepartamento {
    public  boolean crearDepartamento (String nombre, String codigo);
    public  boolean eliminarDepartamento (String codigo);
    public  boolean actualizarDepartamento (String nombre, String codigo, String codigoBuscar);
    public Departamento getDepartamento (String codigo);
    public List<Departamento> getDepartamentos ();

}
