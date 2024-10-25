package co.edu.uniquindio.proyectoFinal.services;

import co.edu.uniquindio.proyectoFinal.model.Usuario;

import java.util.List;

public interface IUsuarioControllerService {
    List<Usuario> obtenerUsuariosDto();

    boolean agregarCliente(Usuario usuario);

    boolean actualizarCliente(String nombreUsuario, Usuario usuario);

    boolean eliminarCliente(String nombreUsuario);
}