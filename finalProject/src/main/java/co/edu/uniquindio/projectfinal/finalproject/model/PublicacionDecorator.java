package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IPublicacion;

public abstract class PublicacionDecorator implements IPublicacion {
    protected IPublicacion publicacion;

    public PublicacionDecorator(IPublicacion publicacion) {
        this.publicacion = publicacion;
    }

    public String getDescripcion() {
        return publicacion.getDescripcion();
    }

}
