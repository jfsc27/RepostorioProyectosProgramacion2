package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;

public interface ICrudDepartamento {
    public  boolean crearDepartamento (String nombre, String codigo);
    public  boolean eliminarDepartamento (String codigo);
    public  boolean actualizarDepartamento (String nombre, String codigo);
    public Departamento getDepartamento (String codigo);

}
