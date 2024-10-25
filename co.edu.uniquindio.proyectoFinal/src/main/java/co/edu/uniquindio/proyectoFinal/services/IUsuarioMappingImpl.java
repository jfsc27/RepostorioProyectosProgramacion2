package co.edu.uniquindio.proyectoFinal.services;

import Mapping.DTO.UsuarioDTO;
import co.edu.uniquindio.proyectoFinal.model.Usuario;

import java.util.List;

public interface IUsuarioMappingImpl {
    List<UsuarioDTO> getClientesDto(List<UsuarioDTO> listaUsuarios);
    UsuarioDTO usuarioToUsuarioDTO(Usuario Usuario);
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
