package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Presupuesto;

import java.util.List;

public interface ICrudPresupuesto {

    public  boolean crearPresupuesto (String idPresupuesto, Double valor, String estado, String descripcion);
    public  boolean eliminarPresupuesto (String idPresupuesto);
    public  boolean actualizarPresupuesto (String idPresupuesto, Double valor, String estado, String descripcion, String codigoBuscar);
    public Presupuesto getPresupuesto (String idPresupuesto);
    public List<Presupuesto> getPresupuestos ();
}
