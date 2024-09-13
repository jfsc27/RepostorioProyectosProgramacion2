package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.TecnicoBuilder;

public class Tecnico extends Empleado{

    public Tecnico(String nombre, String id) {
        super(nombre, id);
    }

    public static TecnicoBuilder builder(){
        return new TecnicoBuilder();

    }
    @Override
    public void contribuir() {
        System.out.println("El tecnico esta contribuyendo y arreglando");
    }
}
