package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudGerente;
import co.edu.uniquindio.services.ICrudProyecto;
import co.edu.uniquindio.services.ICrudTecnico;

import java.util.List;

public class ModelFactory implements ICrudProyecto, ICrudDepartamento, ICrudTecnico, ICrudGerente {
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
    public List<Departamento> getDepartamentos() {
        return empresa.getDepartamentos();
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

    @Override
    public List<Proyecto> getProyectos() {
        return empresa.getProyectos();
    }

    @Override
    public boolean crearGerente(String nombre, String id, Departamento departamento) {
        return empresa.crearGerente(nombre, id, departamento);
    }

    @Override
    public boolean eliminarGerente(String id) {
        return empresa.eliminarGerente(id);
    }

    @Override
    public boolean actualizarGerente(String nombre, String id, Departamento departamento) {
        return empresa.actualizarGerente(nombre, id, departamento);
    }

    @Override
    public Gerente getGerente(String id) {
        return empresa.getGerente(id);
    }

    @Override
    public List<Gerente> getGerentes(String nombre) {
        return empresa.getGerentes(nombre);
    }

    @Override
    public boolean crearTecnico(String nombre, String id, Departamento departamento) {
        return empresa.crearTecnico(nombre, id, departamento);
    }

    @Override
    public boolean eliminarTecnico(String id) {
        return empresa.eliminarTecnico(id);
    }

    @Override
    public boolean actualizarTecnico(String nombre, String id, Departamento departamento) {
        return empresa.actualizarTecnico(nombre, id, departamento);
    }

    @Override
    public Tecnico getTecnico(String id) {
        return empresa.getTecnico(id);
    }

    @Override
    public List<Tecnico> getTecnicos(String nombre) {
        return empresa.getTecnicos(nombre);
    }

    private void inicializarDatosQuemados() {
    }
}
