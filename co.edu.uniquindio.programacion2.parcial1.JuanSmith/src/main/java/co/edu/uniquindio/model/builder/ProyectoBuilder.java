package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class ProyectoBuilder {

    protected String nombre;
    protected String codigo;
    protected List<Empleado> listaEmpleados = new ArrayList<Empleado>();

    public Proyecto build (){
        return new Proyecto(nombre, codigo);
    }

    public ProyectoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProyectoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
}
