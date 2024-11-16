package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;

import java.util.List;

public interface IMarketPlaceMapping {
    UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);

    Publicacion publicacionDTOToPublicacion(PublicacionDTO publicacion);
    PublicacionDTO publicacionToPublicacionDTO(Publicacion publicacion);

    ProductoDTO productoToProductoDTO(Producto producto);
    Producto productoDTOToProducto(ProductoDTO productoDTO);

    Mensaje mensajeDTOToMensaje(MensajeDTO mensaje);
    MensajeDTO mensajeToMensajeDTO(Mensaje mensaje);

    Comentario comentarioDTOToComentario(ComentarioDTO comentario);
    ComentarioDTO comentarioToComentarioDTO(Comentario comentario);

    Muro muroDTOToMuro(MuroDTO muro);
    MuroDTO muroToMuroDTO(Muro muro);

    List<VendedorDTO> VendedoresToVendedoresDTO(List<Vendedor> vendedores);
    List<Vendedor> VendedoresDTOToVendedores(List<VendedorDTO> vendedores);

    List<PublicacionDTO> publicacionesToPublicacionesDTO(List<Publicacion> publicaciones);
    List<Publicacion> publicacionesDTOToPublicaciones(List<PublicacionDTO> publicacionesDTO);

    List<ProductoDTO> productosToProductosDTO(List<Producto> productos);
    List<Producto> productosDTOToProductos(List<ProductoDTO> productosDTO);

    List<Comentario> comentariosDTOToComentarios(List<ComentarioDTO> comentariosDTO);
    List<ComentarioDTO> comentariosToComentariosDTO(List<Comentario> comentarios);

    List<Mensaje> mensajesDTOToMensajes(List<MensajeDTO> mensajesDTO);
    List<MensajeDTO> mensajeToMensajesDTO(List<Mensaje> mensajes);



}

