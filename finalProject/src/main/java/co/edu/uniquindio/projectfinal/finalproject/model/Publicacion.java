package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IInteractuar;
import co.edu.uniquindio.projectfinal.finalproject.service.IPublicacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion implements IInteractuar, IPublicacion {
    private String IdVendedor;
    private LocalDate fechaPublicacion;
    private LocalTime horaPublicacion;
    private String descripcion;
    private Producto producto;
    private List<Comentario> listaComentarios;
    private List<Vendedor> listaMegustas;

    public Publicacion(LocalDate fechaPublicacion, LocalTime horaPublicacion, Producto producto,String descripcion, String IdVendedor) {
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
        this.producto = producto;
        this.IdVendedor = IdVendedor;
        listaComentarios = new ArrayList<Comentario>();
        this.descripcion = descripcion;
        listaMegustas = new ArrayList<>();
    }
    public Publicacion() {
        listaComentarios = new ArrayList<Comentario>();
        listaMegustas = new ArrayList<>();
    }

    public void agregarComentario(Comentario comentario) {
        listaComentarios.add(comentario);
    }

    private void agregarMegusta(Vendedor vendedor) {
        listaMegustas.add(vendedor);
    }

    @Override
    public void darMeGusta(Vendedor vendedor) {
        darMeGusta(vendedor);
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalTime getHoraPublicacion() {
        return horaPublicacion;
    }

    public void setHoraPublicacion(LocalTime horaPublicacion) {
        this.horaPublicacion = horaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(List<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public List<Vendedor> getListaMegustas() {
        return listaMegustas;
    }

    public void setListaMegustas(List<Vendedor> listaMegustas) {
        this.listaMegustas = listaMegustas;
    }

    public String getIdVendedor() {
        return IdVendedor;
    }
    public void setIdVendedor(String IdVendedor) {
        this.IdVendedor = IdVendedor;
    }
}
