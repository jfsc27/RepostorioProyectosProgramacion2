package Mapping.Mappers;

import Mapping.DTO.UsuarioDTO;
import Model.Usuario;
import Services.IUsuarioMappingImpl;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMappingImpl implements IUsuarioMappingImpl {

    public List<UsuarioDTO> getUsuariosDTO(List<Usuario> listaUsuarios) {
        if(listaUsuarios == null){
            return null;
        }

        List<UsuarioDTO> listaUsuariosDTO = new ArrayList<>(listaUsuarios.size());
        for (Usuario usuario : listaUsuarios) {
            listaUsuariosDTO.add(usuarioToUsuarioDTO(usuario));
        }

        return listaUsuariosDTO;
    }

    @Override
    public List<UsuarioDTO> getClientesDto(List<UsuarioDTO> listaClientes) {
        return List.of();
    }

    @Override
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getNombreUsuario(),
                usuario.getContrasenia());

    }

    @Override
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }


}
