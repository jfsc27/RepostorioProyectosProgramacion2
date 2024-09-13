package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudGerente;
import co.edu.uniquindio.services.ICrudProyecto;
import co.edu.uniquindio.services.ICrudTecnico;

import java.util.Arrays;
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
    public boolean actualizarDepartamento(String nombre, String codigo, String codigoBuscar) {
        return empresa.actualizarDepartamento(nombre, codigo, codigoBuscar);
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
    public boolean actualizarProyecto(String nombre, String codigo,String codigoBuscar) {
        return empresa.actualizarProyecto(nombre, codigo,codigoBuscar);
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
    public boolean crearGerente(String nombre, String id) {
        return empresa.crearGerente(nombre, id);
    }

    @Override
    public boolean eliminarGerente(String id) {
        return empresa.eliminarGerente(id);
    }

    @Override
    public boolean actualizarGerente(String nombre, String id, String idBuscar) {
        return empresa.actualizarGerente(nombre, id, idBuscar);
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
    public boolean crearTecnico(String nombre, String id) {
        return empresa.crearTecnico(nombre, id);
    }

    @Override
    public boolean eliminarTecnico(String id) {
        return empresa.eliminarTecnico(id);
    }

    @Override
    public boolean actualizarTecnico(String nombre, String id, String idBuscar) {
        return empresa.actualizarTecnico(nombre, id, idBuscar);
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

        Empresa empresa = new Empresa("Homecenter");

        Departamento departamento1 = Departamento.builder().nombre("Ventas").codigo("123").build();
        Departamento departamento2 = Departamento.builder().nombre("Servicio Tecnico").codigo("323").build();
        Departamento departamento3 = Departamento.builder().nombre("Gerencia").codigo("143").build();
        Departamento departamento4 = Departamento.builder().nombre("Post Venta").codigo("923").build();
        Departamento departamento5 = Departamento.builder().nombre("Marketing").codigo("153").build();

        Proyecto proyecto1 = Proyecto.builder().nombre("Planificacion de ventas").codigo("123").build();
        Proyecto proyecto2 = Proyecto.builder().nombre("Planificacion de recursos").codigo("423").build();
        Proyecto proyecto3 = Proyecto.builder().nombre("Planificacion de estrategias").codigo("923").build();
        Proyecto proyecto4 = Proyecto.builder().nombre("Planificacion de marketing").codigo("153").build();
        Proyecto proyecto5 = Proyecto.builder().nombre("Planificacion de garantias").codigo("723").build();

        Gerente gerente1 = Gerente.builder().nombre("Juan").id("323").build();
        Gerente gerente2 = Gerente.builder().nombre("Camilo").id("163").build();
        Gerente gerente3 = Gerente.builder().nombre("Diego").id("124").build();
        Gerente gerente4 = Gerente.builder().nombre("Ruben").id("923").build();
        Gerente gerente5 = Gerente.builder().nombre("Javier").id("103").build();

        Tecnico tecnico1 = Tecnico.builder().nombre("Simon").id("623").build();
        Tecnico tecnico2 = Tecnico.builder().nombre("Pablo").id("523").build();
        Tecnico tecnico3 = Tecnico.builder().nombre("Julian").id("323").build();
        Tecnico tecnico4 = Tecnico.builder().nombre("Manuela").id("153").build();
        Tecnico tecnico5 = Tecnico.builder().nombre("Santiago").id("823").build();

        gerente1.asociarDepartamento(departamento1);
        gerente1.asociarProyecto(proyecto1);
        gerente2.asociarDepartamento(departamento2);
        gerente2.asociarProyecto(proyecto2);
        gerente3.asociarDepartamento(departamento3);
        gerente3.asociarProyecto(proyecto3);
        gerente4.asociarDepartamento(departamento4);
        gerente4.asociarProyecto(proyecto4);
        gerente5.asociarDepartamento(departamento5);
        gerente5.asociarProyecto(proyecto5);

        tecnico1.asociarDepartamento(departamento1);
        tecnico1.asociarProyecto(proyecto1);
        tecnico2.asociarDepartamento(departamento2);
        tecnico2.asociarProyecto(proyecto2);
        tecnico3.asociarDepartamento(departamento3);
        tecnico3.asociarProyecto(proyecto3);
        tecnico4.asociarDepartamento(departamento4);
        tecnico4.asociarProyecto(proyecto4);
        tecnico5.asociarDepartamento(departamento5);
        tecnico5.asociarProyecto(proyecto5);

        List<Object> parametros = Arrays.asList(departamento1,departamento2,departamento3,departamento4,departamento5,proyecto1,proyecto2,proyecto3,proyecto4,gerente1,gerente2,gerente3,gerente4,gerente5,tecnico1,tecnico2,tecnico3,tecnico4,tecnico5);
        parametros.forEach(empresa::agregarAutomaticamente);
        ModelFactory.empresa =empresa;

    }
}
