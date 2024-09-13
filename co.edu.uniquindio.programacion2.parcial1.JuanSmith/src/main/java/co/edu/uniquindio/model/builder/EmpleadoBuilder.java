package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;

public class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {

    protected String nombre;
    protected String id;
    protected Departamento departamento;
    protected Proyecto proyecto;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self ();
    }

    public T id(String id) {
        this.id = id;
        return self ();
    }


    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

   public Empleado build() {
        return new Empleado() {
            @Override
            public void contribuir() {

            }
        };
   }

}
