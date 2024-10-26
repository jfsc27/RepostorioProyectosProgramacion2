package co.edu.uniquindio.projectfinal.finalproject.factory;

import co.edu.uniquindio.projectfinal.finalproject.mapping.mappers.UsuarioMappingImpl;
import co.edu.uniquindio.projectfinal.finalproject.model.MarketPlace;
import co.edu.uniquindio.projectfinal.finalproject.model.Vendedor;
import org.controlsfx.control.PropertySheet;

public class ModelFactory {

    private static ModelFactory instance;
    private static UsuarioMappingImpl mapping;

    private ModelFactory() {
        inicializarDatos();
        mapping = new UsuarioMappingImpl();

    }
    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }
    private void inicializarDatos() {
        MarketPlace m = new MarketPlace();
        Vendedor v = new Vendedor("pepe", "si", "alli", "000", "user", "123", "01");

    }

    public static void setInstance(ModelFactory instance) {
        ModelFactory.instance = instance;
    }

    public static UsuarioMappingImpl getMapping() {
        return mapping;
    }

    public static void setMapping(UsuarioMappingImpl mapping) {
        ModelFactory.mapping = mapping;
    }
}
