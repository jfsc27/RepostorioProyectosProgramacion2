package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.GerenteBuilder;

public class Gerente extends Empleado{


    public Gerente(String nombre, String id, Departamento departamento) {
        super(nombre, id, departamento);
    }

    public static GerenteBuilder builder (){
        return new GerenteBuilder();
    }


    @Override
    public void contribuir() {
        System.out.println("El gerente esta contribuyendo y dirigiendo");
    }
}
