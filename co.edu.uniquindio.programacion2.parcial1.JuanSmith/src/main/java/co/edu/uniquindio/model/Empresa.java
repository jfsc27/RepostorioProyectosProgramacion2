package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudGerente;
import co.edu.uniquindio.services.ICrudProyecto;
import co.edu.uniquindio.services.ICrudTecnico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Empresa implements ICrudDepartamento, ICrudProyecto, ICrudTecnico, ICrudGerente {

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

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public List<Proyecto> getListaProyectos() {
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
    public List<Departamento> getDepartamentos() {
        if (listaDepartamentos.size() >0){
            return listaDepartamentos;
        }else {
            return null;
        }
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

    @Override
    public List<Proyecto> getProyectos() {
        if (listaProyectos.size() >0){
            return listaProyectos;
        }else {
            return null;
        }
    }


    @Override
    public boolean crearGerente(String nombre, String id, Departamento departamento) {
        if (!verificarGerenteRepetido(nombre)){
            Gerente gerente = Gerente.builder().nombre(nombre).id(id).build();
            listaEmpleados.add(gerente);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarGerente(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente){
                if (empleado.getId().equals(id)){
                    listaEmpleados.remove(empleado);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarGerente(String nombre, String id, Departamento departamento) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente){
                if (empleado.getId().equals(id) && empleado.getNombre().equals(nombre)){
                    empleado.setNombre(nombre);
                    empleado.setId(id);
                    empleado.setDepartamento(departamento);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Gerente getGerente(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente){
                if (empleado.getId().equals(id)){
                    return (Gerente) empleado;
                }
            }
        }
        return null;
    }

    @Override
    public List<Gerente> getGerentes(String nombre) {
        List<Gerente> gerentes = new ArrayList<Gerente>();
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente){
                gerentes.add((Gerente) empleado);
            }
        }
        return gerentes;
    }

    @Override
    public boolean crearTecnico(String nombre, String id, Departamento departamento) {
        if (!verificarTecnicoRepetido(nombre)){
            Tecnico tecnico = Tecnico.builder().nombre(nombre).id(id).build();
            listaEmpleados.add(tecnico);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarTecnico(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico){
                if (empleado.getId().equals(id)){
                    listaEmpleados.remove(empleado);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarTecnico(String nombre, String id, Departamento departamento) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico){
                if (empleado.getId().equals(id) && empleado.getNombre().equals(nombre)){
                    empleado.setNombre(nombre);
                    empleado.setId(id);
                    empleado.setDepartamento(departamento);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Tecnico getTecnico(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico){
                if (empleado.getId().equals(id)){
                    return (Tecnico) empleado;
                }
            }
        }
        return null;
    }

    @Override
    public List<Tecnico> getTecnicos(String nombre) {
        List<Tecnico> tecnicos = new ArrayList<Tecnico>();
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico){
                tecnicos.add((Tecnico) empleado);
            }
        }
        return tecnicos;
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

    private boolean verificarTecnicoRepetido (String id){
        for (Empleado empleado : listaEmpleados){
            if (empleado instanceof Tecnico){
                if (empleado.getId().equals(id)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verificarGerenteRepetido (String id){
        for (Empleado empleado : listaEmpleados){
            if (empleado instanceof Gerente){
                if (empleado.getId().equals(id)){
                    return true;
                }
            }
        }
        return false;
    }
}
