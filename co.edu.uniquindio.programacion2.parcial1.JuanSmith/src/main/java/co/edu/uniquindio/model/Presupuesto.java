package co.edu.uniquindio.model;


import co.edu.uniquindio.model.builder.PresupuestoBuilder;
import co.edu.uniquindio.model.builder.ProyectoBuilder;

public class Presupuesto {
    private String idPresupuesto;
    private Double valor;
    private String estado;
    private String descripcion;
    private Proyecto proyecto;

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Presupuesto(String idPresupuesto, Double valor, String estado, String descripcion) {
        this.idPresupuesto = idPresupuesto;
        this.valor = valor;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public static PresupuestoBuilder builder (){
        return new PresupuestoBuilder();
    }

    public void asociarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            this.proyecto = proyecto;
        }
    }
}
