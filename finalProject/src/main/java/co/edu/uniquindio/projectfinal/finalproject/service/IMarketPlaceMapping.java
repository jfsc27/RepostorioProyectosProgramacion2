package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;

import java.util.List;

public interface IMarketPlaceMapping {

    UsuarioDTO usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDto);

    Publicacion publicacionDtoToPublicacion(PublicacionDTO publicacion);
    PublicacionDTO publicacionToPublicacionDto(Publicacion publicacion);

    ProductoDTO productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDTO productoDto);

    Mensaje mesajeDtoToMensaje(MensajeDTO mensaje);
    MensajeDTO mensajeToMensajeDto(Mensaje mensaje);

    Comentario comentarioDtoToComentario(ComentarioDTO comentario);
    ComentarioDTO comentarioToComentarioDto(Comentario comentario);

    Muro muroDtoToMuro(MuroDTO muro);
    MuroDTO muroToMuroDto(Muro muro);


    List<VendedorDTO> VendedoresToVendedoresDto(List<Vendedor> vendedores);
    List<Vendedor> VendedoresDtoToVendedores(List<VendedorDTO> vendedores);

    List<PublicacionDTO> publicacionesToPublicacionesDto(List<Publicacion> publicaciones);
    List<Publicacion> publicacionesDtoToPublicaciones(List<PublicacionDTO> publicacionesDto);

    List<ProductoDTO> productosToProductosDto(List<Producto> productos);
    List<Producto> productosDtoToProductos(List<ProductoDTO> productosDto);

    List<Comentario> comentariosDtoToComentarios(List<ComentarioDTO> comentariosDto);
    List<ComentarioDTO> comentariosToComentariosDto(List<Comentario> comentarios);

    List<Mensaje> mensajesDtoToMensajes(List<MensajeDTO> mensajesDto);
    List<MensajeDTO> mensajeToMensajesDto(List<Mensaje> mensajes);



}

