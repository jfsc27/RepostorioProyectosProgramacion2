package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

public class Proyecto {
    private String nombre;
    private String codigo;
    public Collection<Empleado> EmpleadosAsignados;
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.EmpleadosAsignados = new ArrayList<Empleado>();
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

}
