package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.model.Publicacion;
import co.edu.uniquindio.projectfinal.finalproject.model.Vendedor;

public interface IInteraccion {
    public void agregarContactosEntreSi(Vendedor contacto1, Vendedor contacto2);
    public void darMeGustaPublicacion(Vendedor usuario, Publicacion publicacion);
}
