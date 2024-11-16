package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;

import java.util.List;

public interface IModelFactoryServices {
    public UsuarioDTO getUsuario(UsuarioDTO usuario);
    public boolean validarLogin(UsuarioDTO usuario);
    public Usuario getUsuarioCompleto(UsuarioDTO usuario);
    public void darMeGustaPublicacion(UsuarioDTO usuario, String idVendedor, PublicacionDTO dto);
    public List<ProductoDTO> getListaProductosDisponibles(UsuarioDTO usuario);
    boolean eliminarPublicacion(PublicacionDTO publicacion, VendedorDTO vendedor);
    boolean actualizarPublicacion(PublicacionDTO publicacion, VendedorDTO vendedor);
    List<PublicacionDTO> getListaPublicaciones(Muro muro);
    boolean crearUsuario(VendedorDTO vendedor);

    // Retorno de listas asociadas a clases
    List<ProductoDTO> getListaProductosDTO(String id);

    List<VendedorDTO> getListaContactosDTO(String id);
    List<Vendedor> getListaContactos(String id);

    List<Comentario> getListaComentarios(String idVendedor, PublicacionDTO publicacion);
    List<ComentarioDTO> getListaComentariosDTO(String idVendedor, PublicacionDTO publicacion);

    List<Vendedor> getListaMeGusta(String idVendedor, PublicacionDTO dto);
    List<VendedorDTO> getListaMeGustaDTO(String idVendedor, PublicacionDTO dto);

    List<Publicacion> getListaPublicaciones(String idVendedor);
    List<PublicacionDTO> getListaPublicacionesDTO(String idVendedor);

    // CRUD PUBLICACION
    boolean agregarPublicacion(PublicacionDTO publicacionDTO, String idVendedor);
    // CRUD COMENTARIO
    boolean agregarComentario(ComentarioDTO comentario, PublicacionDTO publicacion);
    void darLikeComentario(ComentarioDTO comentario, PublicacionDTO publicacion);
    int getLikesComentario(ComentarioDTO dto, PublicacionDTO publicacion);

