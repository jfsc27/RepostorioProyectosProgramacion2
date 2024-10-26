package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.model.Producto;

public interface ICrudProducto {
    boolean crearProducto(Producto producto);
    boolean eliminarProducto(Producto producto);
    boolean actualizarProducto(Producto producto);

}
