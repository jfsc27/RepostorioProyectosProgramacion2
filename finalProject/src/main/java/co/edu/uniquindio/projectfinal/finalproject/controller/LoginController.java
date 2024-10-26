package co.edu.uniquindio.projectfinal.finalproject.controller;

import co.edu.uniquindio.projectfinal.finalproject.factory.ModelFactory;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.UsuarioDTO;
import co.edu.uniquindio.projectfinal.finalproject.service.ILoginControllerServices;

public class LoginController implements ILoginControllerServices {
    ModelFactory modelFactory;

    public LoginController() {
        modelFactory = ModelFactory.getInstance();
    }
    @Override
    public UsuarioDTO getUsuario(UsuarioDTO usuario) {
        return null;
    }
}
