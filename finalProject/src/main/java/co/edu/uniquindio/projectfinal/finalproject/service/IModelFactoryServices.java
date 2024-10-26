package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.PublicacionDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.UsuarioDTO;
import co.edu.uniquindio.projectfinal.finalproject.model.Muro;
import co.edu.uniquindio.projectfinal.finalproject.model.Usuario;

public interface IModelFactoryServices {
    public UsuarioDTO getUsuario(UsuarioDTO usuario);
    public boolean validarLogin(UsuarioDTO usuario);
    public Usuario getUsuarioCompleto(UsuarioDTO usuario);
    public void darMeGustaPublicacion(UsuarioDTO usuario, PublicacionDTO publicacion);
    public List<ProductoDto> getListaProductosDisponibles(UsuarioDTO usuario);
    boolean agregarPublicacion(PublicacionDTO publicacion, VendedorDto vendedor);
    boolean eliminarPublicacion(PublicacionDTO publicacion, VendedorDto vendedor);
    boolean actualizarPublicacion(PublicacionDTO publicacion, VendedorDto vendedor);
    List<PublicacionDto> getListaPublicaciones(Muro muro);
}
