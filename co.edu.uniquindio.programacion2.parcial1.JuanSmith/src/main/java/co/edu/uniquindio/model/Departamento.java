package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.DepartamentoBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Departamento {

    private String nombre;
    private String codigo;
    private List<Empleado> listaEmpleados = new ArrayList <Empleado>();

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public static DepartamentoBuilder builder(){
        return new DepartamentoBuilder();


    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}
