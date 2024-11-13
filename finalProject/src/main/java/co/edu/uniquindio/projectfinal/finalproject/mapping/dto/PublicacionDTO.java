package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PublicacionDTO {
    private String idVendedor;
    private LocalDate fechaPublicacion;
    private LocalTime horaPublicacion;
    private String descripcion;
    private ProductoDTO producto;
    private List<ComentarioDTO> listaComentarios;
    private List<VendedorDTO> listaMegustas;


    public PublicacionDTO(LocalDate fechaPublicacion, LocalTime horaPublicacion, String descripcion, ProductoDTO producto, String idVendedor) {
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
        this.descripcion = descripcion;
        this.producto = producto;
        this.idVendedor = idVendedor;
        listaComentarios = new ArrayList<ComentarioDTO>();
        listaMegustas = new ArrayList<VendedorDTO>();
    }

    public PublicacionDTO() {

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

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public List<ComentarioDTO> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(List<ComentarioDTO> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public List<VendedorDTO> getListaMegustas() {
        return listaMegustas;
    }

    public void setListaMegustas(List<VendedorDTO> listaMegustas) {
        this.listaMegustas = listaMegustas;
    }

    public String getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }
}

