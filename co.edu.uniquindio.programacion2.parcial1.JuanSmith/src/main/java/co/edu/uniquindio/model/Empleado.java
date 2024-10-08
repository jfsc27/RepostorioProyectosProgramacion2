package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IContribuyente;
//Aqui se aplica el principio de responsabilidad unica puesto que esta clase, si bien no crea objetos de tipo empleado como tal, es la clase padre de gerente y tecnico que si se crea, entonces solo esta encargada de crear Empleados;
public abstract class Empleado implements IContribuyente {

    private String nombre;
    private String id;
    private Departamento departamento;
    private Proyecto proyecto;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void asociarDepartamento(Departamento departamento) {
        if (departamento != null) {
            this.departamento = departamento;
        }
    }

    public void asociarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            this.proyecto = proyecto;
        }
    }
}
