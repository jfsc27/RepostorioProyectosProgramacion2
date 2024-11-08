package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IProducto;
import javafx.scene.image.Image;

import java.util.List;

public class Kit extends Producto implements IProducto {
    private List<Producto> productos;

    public Kit(String nombre, String rutaImagen, String categoria, Estado estado, double precio) {
        super(nombre, rutaImagen, categoria, estado, precio);
    }

    @Override
    public void mostrarProducto() {
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }

    }

    // Método privado para cargar la imagen
    private Image cargarImagen(String rutaImagen) {
        return new Image(getClass().getResource(rutaImagen).toExternalForm());
    }

}

