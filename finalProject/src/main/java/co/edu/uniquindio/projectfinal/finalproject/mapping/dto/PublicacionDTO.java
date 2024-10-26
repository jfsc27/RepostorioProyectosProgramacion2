package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PublicacionDTO {
    private LocalDate fechaPublicacion;
    private LocalTime horaPublicacion;
    private String descripcion;
    private ProductoDto producto;
    private List<ComentarioDto> listaComentarios;
    private List<VendedorDTO> listaMegustas;


    public PublicacionDTO(LocalDate fechaPublicacion, LocalTime horaPublicacion, String descripcion, ProductoDto producto) {
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
        this.descripcion = descripcion;
        this.producto = producto;
        listaComentarios = new ArrayList<ComentarioDto>();
        listaMegustas = new ArrayList<VendedorDTO>();
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

    public ProductoDto getProducto() {
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
}

