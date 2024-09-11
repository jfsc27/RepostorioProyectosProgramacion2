package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empresa;
import co.edu.uniquindio.model.Proyecto;
import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudProyecto;

public class ModelFactory implements ICrudProyecto, ICrudDepartamento {
    private static ModelFactory instance;
    private static Empresa empresa;

    private ModelFactory(){
        inicializarDatosQuemados();
    }

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        return empresa.crearDepartamento(nombre, codigo);
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        return empresa.eliminarDepartamento(codigo);
    }

    @Override
    public boolean actualizarDepartamento(String nombre, String codigo) {
        return empresa.actualizarDepartamento(nombre, codigo);
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        return empresa.getDepartamento(codigo);
    }

    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        return empresa.crearProyecto(nombre, codigo);
    }

    @Override
    public boolean eliminarProyecto(String codigo) {
        return empresa.eliminarProyecto(codigo);
    }

    @Override
    public boolean actualizarProyecto(String nombre, String codigo) {
        return empresa.actualizarProyecto(nombre, codigo);
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        return empresa.getProyecto(codigo);
    }

    private void inicializarDatosQuemados() {
    }
}
