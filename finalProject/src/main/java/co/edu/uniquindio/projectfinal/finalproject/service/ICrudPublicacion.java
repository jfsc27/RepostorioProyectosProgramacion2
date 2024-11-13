package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.model.Publicacion;
import co.edu.uniquindio.projectfinal.finalproject.model.Vendedor;

public interface ICrudPublicacion {
    boolean crearPublicacion(Publicacion publicacion, String idVendedor);
    boolean eliminarPublicacion(Publicacion publicacion, Vendedor vendedor);
    boolean actualizarPublicacion(Publicacion publicacion, Vendedor vendedor);
}
