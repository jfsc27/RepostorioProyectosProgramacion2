package co.edu.uniquindio;


import co.edu.uniquindio.factory.ModelFactory;

import java.sql.SQLOutput;

public class EmpresaMain {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudProyecto (modelFactory);
    }

    public static void crudProyecto (ModelFactory modelFactory) {
        //crearProyecto (modelFactory);
        //eliminarProyecto (modelFactory);
        //actualizarProyecto (modelFactory);
        //getProyecto (modelFactory);
        getProyectos(modelFactory);

    }

    private static void crearProyecto (ModelFactory modelFactory) {
        boolean crear =modelFactory.crearProyecto("Planificacion", "123");
        System.out.println("El proceso de creacion del proyecto es: " + crear);
    }

    private static void eliminarProyecto (ModelFactory modelFactory) {
        boolean eliminar =modelFactory.eliminarProyecto("123");
        System.out.println("El proceso de eliminacion del proyecto es: " + eliminar);
    }

    private static void actualizarProyecto (ModelFactory modelFactory) {
        if (!modelFactory.actualizarProyecto("Contruccion en ventas", "999","123")){
            System.out.println("No se pudo modificar");
        }else{
            System.out.println("si se modifico");
        }
    }
    private static void getProyecto (ModelFactory modelFactory) {
        if (modelFactory.getProyecto("123")== null){
            System.out.println("No se encontro el proyecto");
        } else {
            System.out.println("Se encontro el proyecto exitosamente");
            System.out.println(modelFactory.getProyecto("123").getNombre());
        }
    }

    private static void getProyectos (ModelFactory modelFactory) {
        if (modelFactory.getProyectos() == null){
            System.out.println("No se encontro la lista de proyectos");
        } else {
            System.out.println("Se encontro la lista de proyectos");
            System.out.println(modelFactory.getProyectos());
        }
    }
}