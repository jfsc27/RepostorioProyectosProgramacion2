package co.edu.uniquindio.proyectoFinal.Model.Builders;

import co.edu.uniquindio.proyectoFinal.Model.Usuario;

public class UsuarioBuilder {
    protected String nombreUsuario;
    protected String contrasenia;

    public UsuarioBuilder nombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public UsuarioBuilder contrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombreUsuario, contrasenia);
    }
}
