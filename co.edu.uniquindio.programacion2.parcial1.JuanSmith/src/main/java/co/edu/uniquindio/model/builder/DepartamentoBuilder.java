package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoBuilder {

    protected String nombre;
    protected String codigo;
    protected List<Empleado> listaEmpleados = new ArrayList<Empleado>();

    public Departamento build (){
        return new Departamento(nombre, codigo);
    }

    public DepartamentoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
}
