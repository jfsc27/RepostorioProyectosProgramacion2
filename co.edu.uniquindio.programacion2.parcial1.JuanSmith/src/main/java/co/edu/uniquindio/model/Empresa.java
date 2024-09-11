package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudProyecto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Empresa implements ICrudDepartamento, ICrudProyecto {

    private String nombre;
    private List<Empleado> listaEmpleados = new ArrayList <Empleado>();
    private List<Departamento> listaDepartamentos = new ArrayList <Departamento>();
    private List<Proyecto> listaProyectos = new ArrayList <Proyecto>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Collection<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Collection<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        if (!verificarDepartamentoRepetido(nombre)){
            Departamento departamento = Departamento.builder().nombre(nombre).codigo(codigo).build();
            listaDepartamentos.add(departamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getCodigo().equals(codigo)){
                listaDepartamentos.remove(departamento);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarDepartamento(String nombre, String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getNombre().equals(nombre) && departamento.getCodigo().equals(codigo)){
                departamento.setNombre(nombre);
                departamento.setCodigo(codigo);
                return true;
            }
        }
        return false;
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getCodigo().equals(codigo)){
                return departamento;
            }
        }
        return null;
    }

    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        if (!verificarProyectoRepetido(nombre)){
            Proyecto proyecto = Proyecto.builder().nombre(nombre).codigo(codigo).build();
            listaProyectos.add(proyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                listaProyectos.remove(proyecto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarProyecto(String nombre, String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getNombre().equals(nombre) && proyecto.getCodigo().equals(codigo)){
                proyecto.setNombre(nombre);
                proyecto.setCodigo(codigo);
                return true;
            }
        }
        return false;
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos){
            if (proyecto.getCodigo().equals(codigo)){
                return proyecto;
            }
        }
        return null;
    }

    private boolean verificarDepartamentoRepetido (String nombre){
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    private boolean verificarProyectoRepetido (String nombre){
        for (Proyecto proyecto : listaProyectos){
            if (proyecto.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
}
