package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.ProyectoBuilder;
import co.edu.uniquindio.services.IPrototypeProyecto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Proyecto implements IPrototypeProyecto {

    private String nombre;
    private String codigo;
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public static ProyectoBuilder builder (){
        return new ProyectoBuilder();
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

    @Override
    public IPrototypeProyecto clone() {
        Proyecto proyecto =null;
        try {
            proyecto = (Proyecto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return proyecto;
    }
}
