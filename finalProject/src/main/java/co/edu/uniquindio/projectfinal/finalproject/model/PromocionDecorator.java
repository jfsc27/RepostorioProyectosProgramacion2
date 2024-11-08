package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.IPublicacion;

public class PromocionDecorator extends PublicacionDecorator{
    public PromocionDecorator(IPublicacion publicacion) {
        super(publicacion);
    }

    @Override
    public String getDescripcion() {
        return publicacion.getDescripcion() + ". Por tiempo limitado, pague uno lleve 2.";
    }
}
