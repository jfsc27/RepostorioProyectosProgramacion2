package co.edu.uniquindio;

public class Tecnico extends Empleado implements Contribuyente {

    public Tecnico(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }


    public void realizarTareaTecnica(String tarea) {
        System.out.println("Técnico " + getNombre() + " está realizando la tarea: " + tarea);
        // Lógica adicional para la tarea técnica
    }

    public void asistirReunion(String fecha) {
        System.out.println("Técnico " + getNombre() + " asistirá a la reunión técnica el " + fecha);
    }

    public void proporcionarSoporteTecnico() {
        System.out.println("Técnico " + getNombre() + " está proporcionando soporte técnico.");
        // Lógica adicional para el soporte técnico
    }

    @Override
    public void contribuir() {
        System.out.println("Técnico contribuye con habilidades técnicas en proyectos.");
    }
}
