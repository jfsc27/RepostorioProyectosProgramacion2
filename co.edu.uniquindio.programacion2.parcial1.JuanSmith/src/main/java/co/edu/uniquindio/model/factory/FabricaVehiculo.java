package co.edu.uniquindio.model.factory;

public class FabricaVehiculo {

    public IVehiculo crearVehiculo(String tipoVehiculo) {
        switch (tipoVehiculo.toLowerCase()) {
            case "carro":
                return new Carro();
            case "moto":
                return new Moto();
            case "camion":
                return new Camion();
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipoVehiculo);
        }
    }
}
