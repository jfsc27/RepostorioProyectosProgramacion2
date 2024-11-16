package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import co.edu.uniquindio.projectfinal.finalproject.model.Estado;

import java.awt.*;

public class ProductoDTO {
    private String nombre;
    private Image imagen;
    private String categoria;
    private Estado estado;
    private double precio;

    public ProductoDTO() {}
    public ProductoDTO(String nombre, Image imagen, String categoria, Estado estado, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  void getImagen(){
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
