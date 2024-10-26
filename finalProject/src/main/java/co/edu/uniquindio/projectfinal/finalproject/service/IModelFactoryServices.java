package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.ProductoDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.PublicacionDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.UsuarioDTO;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.VendedorDTO;
import co.edu.uniquindio.projectfinal.finalproject.model.Muro;
import co.edu.uniquindio.projectfinal.finalproject.model.Usuario;

import java.util.List;

public interface IModelFactoryServices {
    public UsuarioDTO getUsuario(UsuarioDTO usuario);
    public boolean validarLogin(UsuarioDTO usuario);
    public Usuario getUsuarioCompleto(UsuarioDTO usuario);
    public void darMeGustaPublicacion(UsuarioDTO usuario, PublicacionDTO publicacion);
    public List<ProductoDTO> getListaProductosDisponibles(UsuarioDTO usuario);
    boolean agregarPublicacion(PublicacionDTO publicacion, VendedorDTO vendedor);
    boolean eliminarPublicacion(PublicacionDTO publicacion, VendedorDTO vendedor);
    boolean actualizarPublicacion(PublicacionDTO publicacion, VendedorDTO vendedor);
    List<PublicacionDTO> getListaPublicaciones(Muro muro);
}
