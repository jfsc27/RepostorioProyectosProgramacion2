package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IPublicacion;

public class DescuentoDecorator extends PublicacionDecorator{
    public DescuentoDecorator(IPublicacion publicacion) {
        super(publicacion);
    }

    @Override
    public String getDescripcion() {
        return publicacion.getDescripcion()+", Solo por tiempo limitado un descuento del: 50%";
    }
}
