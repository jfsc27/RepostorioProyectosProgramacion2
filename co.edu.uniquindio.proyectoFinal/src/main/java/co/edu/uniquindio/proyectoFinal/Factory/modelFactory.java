package co.edu.uniquindio.proyectoFinal.Factory;

public class modelFactory {
    private static modelFactory instance;

    private modelFactory() {}

    public static modelFactory getInstance() {
        if (instance == null) {
            instance = new modelFactory();
        }
        return instance;
    }
}
