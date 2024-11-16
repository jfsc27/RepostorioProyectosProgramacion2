package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IProducto;
import javafx.scene.image.Image;

public class Producto implements IProducto {
    private String nombre;
    private Image imagen;
    private String categoria;
    private Estado estado;
    private double precio;

    public Producto(String nombre, Image imagen, String categoria, Estado estado, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

    public Producto() {

    }

    public Producto(String nombre, String categoria, Estado estado, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

    @Override
    public void mostrarProducto() {

    }

    // Método privado para cargar la imagen
    private Image cargarImagen(String rutaImagen) {
        return new Image(getClass().getResource(rutaImagen).toExternalForm());
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image getImagen() {
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
