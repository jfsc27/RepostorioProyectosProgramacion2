package co.edu.uniquindio.projectfinal.finalproject.factory;

import co.edu.uniquindio.projectfinal.finalproject.mapping.mappers.MarketPlaceMappingImpl;
import co.edu.uniquindio.projectfinal.finalproject.model.MarketPlace;
import co.edu.uniquindio.projectfinal.finalproject.model.Vendedor;
import org.controlsfx.control.PropertySheet;

public class ModelFactory {

    private static ModelFactory instance;
    private static MarketPlaceMappingImpl mapping;

    private ModelFactory() {
        inicializarDatos();
        mapping = new MarketPlaceMappingImpl();

    }
    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }
    private void inicializarDatos() {
        MarketPlace m = new MarketPlace();
        Vendedor v = new Vendedor("costeña", "sapaperra", "1234", "000", "user", "123", "01");

    }

    public static void setInstance(ModelFactory instance) {
        ModelFactory.instance = instance;
    }

    public static MarketPlaceMappingImpl getMapping() {
        return mapping;
    }

    public static void setMapping(MarketPlaceMappingImpl mapping) {
        ModelFactory.mapping = mapping;
    }
}
