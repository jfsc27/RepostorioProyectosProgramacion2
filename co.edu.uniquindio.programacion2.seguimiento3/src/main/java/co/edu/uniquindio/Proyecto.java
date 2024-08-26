package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
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

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void asignarEmpleados(List<Empleado> empleados) {
        this.empleadosAsignados = empleados;
    }

    public String mostrarProgreso() {
        return "Progreso del proyecto " + nombre;
    }

    public String generarResumen() {
        return "Resumen del proyecto " + nombre;
    }
}
