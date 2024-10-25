package co.edu.uniquindio.projectfinal.finalproject.model;

public class Usuario {
    String nombre;
    String apellido;
    String direccion;
    String cedula;
    String nombreUsuario;
    String contraseña;
    String idUsuario;

    public Usuario(String nombre, String apellido, String direccion, String cedula, String nombreUsuario, String contraseña,String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cedula = cedula;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.idUsuario = idUsuario;
    }

}
