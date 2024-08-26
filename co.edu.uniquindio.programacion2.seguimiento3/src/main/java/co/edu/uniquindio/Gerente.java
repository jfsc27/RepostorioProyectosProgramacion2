package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado implements Contribuyente {
    private List<Proyecto> proyectosGestionados;

    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
        this.proyectosGestionados = new ArrayList<>();
    }


    public void asignarProyecto(Proyecto proyecto, List<Empleado> empleados) {
        proyecto.asignarEmpleados(empleados);
        if (!proyectosGestionados.contains(proyecto)) {
            proyectosGestionados.add(proyecto);
        }
    }

    public void revisarProgreso(Proyecto proyecto) {
        System.out.println(proyecto.mostrarProgreso());
    }

    public void generarInforme(Proyecto proyecto) {
        System.out.println(proyecto.generarResumen());
    }

    public void evaluarDesempenoEquipo() {
        for (Proyecto proyecto : proyectosGestionados) {
            for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
                System.out.println("Evaluando desempeño de: " + empleado.getNombre());
                // Lógica adicional para la evaluación
            }
        }
    }

    public void organizarReunion(String fecha, List<Empleado> empleados) {
        System.out.println("Reunión organizada para el " + fecha + " con: ");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }

    public void resolverConflictos() {
        System.out.println("Resolviendo conflictos en el equipo.");
    }

    @Override
    public void contribuir() {
        System.out.println("Gerente contribuye a la planificación y ejecución de proyectos.");
    }
}
