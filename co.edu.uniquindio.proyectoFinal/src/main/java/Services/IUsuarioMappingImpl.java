package Services;

import Mapping.DTO.UsuarioDTO;
import Model.Usuario;

import java.util.List;

public interface IUsuarioMappingImpl {
    List<UsuarioDTO> getClientesDto(List<UsuarioDTO> listaUsuarios);
    UsuarioDTO usuarioToUsuarioDTO(Usuario Usuario);
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
