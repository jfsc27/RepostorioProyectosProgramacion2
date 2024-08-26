package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class Departamento {
    private String nombre;
    private String codigo;
    private Collection<Empleado> listaEmpleados;

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = new ArrayList<>();
    }

    // Getters y setters
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

    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }
}

