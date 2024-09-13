package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Presupuesto;
import co.edu.uniquindio.model.Proyecto;

public class PresupuestoBuilder {
    protected String idPresupuesto;
    protected Double valor;
    protected String estado;
    protected String descripcion;
    protected Proyecto proyecto;

    public Presupuesto build() {
        return new Presupuesto(idPresupuesto, valor, estado, descripcion);
    }

    public PresupuestoBuilder idPresupuesto(String idPresupuesto) {
        this.idPresupuesto = this.idPresupuesto;
        return this;
    }

    public PresupuestoBuilder valor(Double valor) {
        this.valor = valor;
        return this;
    }

    public PresupuestoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public PresupuestoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
}
