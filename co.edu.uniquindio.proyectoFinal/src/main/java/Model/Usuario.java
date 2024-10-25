package Model;

import Model.Builders.UsuarioBuilder;

public class Usuario {
    private String nombreUsuario;
    private String Contrasenia;

    public Usuario(String nombreUsuario, String Contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.Contrasenia = Contrasenia;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

}
