package co.edu.uniquindio.projectfinal.finalproject.mapping.mappers;

import co.edu.uniquindio.projectfinal.finalproject.factory.ModelFactory;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;
import co.edu.uniquindio.projectfinal.finalproject.service.IMarketPlaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketPlaceMappingImpl implements IMarketPlaceMapping {
    ModelFactory modelFactory;


    @Override
    public UsuarioDTO usuarioToUsuarioDto(Usuario usuario) {
        Vendedor vendedor = (Vendedor) usuario;
        if (usuario instanceof Vendedor) {
            VendedorDTO vendedorDTO = new VendedorDTO();
            vendedorDTO.setNombre(usuario.getNombre());
            vendedorDTO.setApellido(usuario.getApellido());
            vendedorDTO.setCedula(usuario.getCedula());
            vendedorDTO.setDireccion(usuario.getDireccion());
            vendedorDTO.setUsuario(usuario.getUsuario());
            vendedorDTO.setPassword(usuario.getPassword());
            return vendedorDTO;
        } else if (usuario instanceof Administrador) {
            Administrador administrador = (Administrador) usuario;
            AdministradorDTO administradorDto = new AdministradorDTO();
            administradorDto.setNombre(administrador.getNombre());
            administradorDto.setApellido(administrador.getApellido());
            administradorDto.setCedula(administrador.getCedula());
            administradorDto.setDireccion(administrador.getDireccion());
            administradorDto.setUsuario(administrador.getUsuario());
            administradorDto.setPassword(administrador.getPassword());
            return administradorDto;

        }
        return null;

    }

        @Override
    public Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDto) {
        if (usuarioDto instanceof VendedorDTO){
        VendedorDTO vendedorDTO = (VendedorDTO) usuarioDto;
        Vendedor vendedor = new Vendedor();
        vendedor.setNombre(vendedorDTO.getNombre());
        vendedor.setApellido(vendedorDTO.getApellido());
        vendedor.setCedula(vendedorDTO.getCedula());
        vendedor.setDireccion(vendedorDTO.getDireccion());
        vendedor.setUsuario(vendedorDTO.getUsuario());
        vendedor.setPassword(vendedorDTO.getPassword());

            vendedor.setListaProductos(productosDtoToProductos(modelFactory.getListaProductosDto(vendedorDTO.getIdVendedor())));
            vendedor.setMuro(muroDtoToMuro(vendedorDTO.getMuro()));
            vendedor.setListaContactos(modelFactory.getListaContactos(vendedorDTO.getIdVendedor()));
        return vendedor;
    } else if (usuarioDto instanceof AdministradorDTO) {
            AdministradorDTO administradorDTO = (AdministradorDTO) usuarioDto;
            Administrador administrador = new Administrador();
            administrador.setNombre(administradorDTO.getNombre());
            administrador.setApellido(administradorDTO.getApellido());
            administrador.setCedula(administradorDTO.getCedula());
            administrador.setDireccion(administradorDTO.getDireccion());
            administrador.setUsuario(administradorDTO.getUsuario());
            administrador.setPassword(administradorDTO.getPassword());
            return administrador;
        }
            return null;}

    @Override
    public Publicacion publicacionDtoToPublicacion(PublicacionDTO publicacionDto) {

        Publicacion publicacion = new Publicacion();
        publicacion.setFechaPublicacion(publicacionDto.getFechaPublicacion());
        publicacion.setHoraPublicacion(publicacionDto.getHoraPublicacion());
        publicacion.setProducto(productoDtoToProducto(publicacionDto.getProducto()));
        publicacion.setDescripcion(publicacionDto.getDescripcion());

        publicacion.setListaComentarios(modelFactory.getListaComentarios(publicacionDto.getIdVendedor(), publicacionDto));
        publicacion.setListaMegustas(modelFactory.getListaMeGusta(publicacionDto.getIdVendedor(), publicacionDto));
        return publicacion;
    }

    @Override
    public PublicacionDTO publicacionToPublicacionDto(Publicacion publicacion) {
        PublicacionDTO publicacionDto = new PublicacionDTO();
        publicacionDto.setFechaPublicacion(publicacion.getFechaPublicacion());
        publicacionDto.setHoraPublicacion(publicacion.getHoraPublicacion());
        publicacionDto.setProducto(productoToProductoDto(publicacion.getProducto()));
        publicacionDto.setDescripcion(publicacion.getDescripcion());
        return publicacionDto;

    }

    @Override
    public ProductoDTO productoToProductoDto(Producto producto) {
        ProductoDTO productoDto = new ProductoDTO();
        productoDto.setNombre(producto.getNombre());
        productoDto.setCategoria(producto.getCategoria());
        productoDto.setPrecio(producto.getPrecio());
        producto.setEstado(producto.getEstado());
        producto.setImagen(producto.getImagen());
        return productoDto;
    }

    @Override
    public Producto productoDtoToProducto(ProductoDTO productoDto) {
        Producto producto = new Producto();
        producto.setNombre(productoDto.getNombre());
        producto.setCategoria(productoDto.getCategoria());
        producto.setPrecio(productoDto.getPrecio());
        producto.setEstado(productoDto.getEstado());
        producto.setImagen(productoDto.getImagen());
        return producto;
    }

    @Override
    public Mensaje mesajeDtoToMensaje(MensajeDTO mensajeDto) {
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje(mensajeDto.getMensaje());
        mensaje.setUsuario(usuarioDtoToUsuario(mensajeDto.getUsuario()));
        mensaje.setFecha(mensajeDto.getFecha());
        mensaje.setHora(mensajeDto.getHora());
        return mensaje;
    }

    @Override
    public MensajeDTO mensajeToMensajeDto(Mensaje mensaje) {
        MensajeDTO mensajeDto = new MensajeDTO();
        mensajeDto.setMensaje(mensaje.getMensaje());
        mensajeDto.setUsuario(usuarioToUsuarioDto(mensaje.getUsuario()));
        mensajeDto.setFecha(mensaje.getFecha());
        mensajeDto.setHora(mensaje.getHora());
        return mensajeDto;
    }

    @Override
    public Comentario comentarioDtoToComentario(ComentarioDTO comentarioDTO) {
        Comentario comentario = new Comentario();
        comentario.setFecha(comentarioDTO.getFecha());
        comentario.setHora(comentarioDTO.getHora());
        comentario.setMensaje(comentarioDTO.getMensaje());
        comentario.setUsuario(usuarioDtoToUsuario(comentarioDTO.getUsuario()));
        comentario.setNumMeGustas(comentarioDTO.getNumMeGustas());
        return comentario;
    }

    @Override
    public ComentarioDTO comentarioToComentarioDto(Comentario comentario) {
        ComentarioDTO comentarioDto = new ComentarioDTO();
        comentarioDto.setFecha(comentario.getFecha());
        comentarioDto.setHora(comentario.getHora());
        comentarioDto.setMensaje(comentario.getMensaje());
        comentarioDto.setUsuario(usuarioToUsuarioDto(comentario.getUsuario()));
        comentarioDto.setNumMeGustas(comentario.getNumMeGustas());
        return comentarioDto;
    }

    @Override
    public Muro muroDtoToMuro(MuroDTO muroDto) {
        Muro muro = new Muro();
        muro.setListaChats(ListaChatsDtoToListaChats(muroDto.getListaChats()));
        muro.setListaPublicaciones(publicacionesDtoToPublicaciones(muroDto.getListaPublicaciones()));
        return muro;
    }

    private List<Chat> ListaChatsDtoToListaChats(List<ChatDTO> listaChatsDto) {
        List<Chat> listaChats = new ArrayList<>();
        for (ChatDTO chatDto : listaChatsDto) {
            listaChats.add(chatDtoToChat(chatDto));
        }
        return listaChats;

    }

    private Chat chatDtoToChat(ChatDTO chatDto) {
        Chat chat = new Chat();
        chat.setMensajes(mensajesDtoToMensajes(chatDto.getListaMensajes()));
        chat.setUsuarios(usuariosDtoToUsuarios(chatDto.getListaUsuarios()));
        return chat;
    }

    private List<Usuario> usuariosDtoToUsuarios(List<UsuarioDTO> listaUsuariosDto) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        for (UsuarioDTO usuarioDto : listaUsuariosDto) {
            listaUsuarios.add(usuarioDtoToUsuario(usuarioDto));
        }
        return listaUsuarios;

    }

    @Override
    public MuroDTO muroToMuroDto(Muro muro) {
        MuroDTO muroDto = new MuroDTO();
        muroDto.setListaChats(listaChatsToListaChatsDto(muro.getListaChats()));
        muroDto.setListaPublicaciones(publicacionesToPublicacionesDto(modelFactory.getListaPublicaciones(muro.getIdVendedor())));
        return null;
    }

    private List<ChatDTO> listaChatsToListaChatsDto(List<Chat> listaChats) {
        List<ChatDTO> listaChatsDto = new ArrayList<>();
        for (Chat chat : listaChats) {
            listaChatsDto.add(chatToChatDto(chat));
        }
        return listaChatsDto;

    }

    private ChatDTO chatToChatDto(Chat chat) {
        ChatDTO chatDto = new ChatDTO();
        chatDto.setListaUsuarios(usuariosToUsuariosDto(chat.getUsuarios()));
        chatDto.setListaMensajes(mensajeToMensajesDto(chat.getMensajes()));
        return chatDto;
    }

    private List<UsuarioDTO> usuariosToUsuariosDto(List<Usuario> usuarios) {
        List<UsuarioDTO> usuariosDto = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuarioToUsuarioDto(usuario);
            usuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return usuariosDto;
    }

    @Override
    public List<VendedorDTO> VendedoresToVendedoresDto(List<Vendedor> vendedores) {
        List<VendedorDTO> vendedoresDto = new ArrayList<>();
        for (Vendedor vendedor : vendedores) {
            VendedorDTO vendedorDto = new VendedorDTO();
            vendedorDto.setNombre(vendedor.getNombre());
            vendedorDto.setApellido(vendedor.getApellido());
            vendedorDto.setCedula(vendedor.getCedula());
            vendedorDto.setDireccion(vendedor.getDireccion());
            vendedorDto.setUsuario(vendedor.getUsuario());
            vendedorDto.setPassword(vendedor.getPassword());
            vendedoresDto.add(vendedorDto);

        }
        return vendedoresDto;
    }

    @Override
    public List<Vendedor> VendedoresDtoToVendedores(List<VendedorDTO> vendedoresDto) {
        List<Vendedor> vendedores = new ArrayList<>();
        for (VendedorDTO vendedorDto : vendedoresDto) {
            Vendedor vendedor = new Vendedor();
            vendedor.setNombre(vendedorDto.getNombre());
            vendedor.setApellido(vendedorDto.getApellido());
            vendedor.setCedula(vendedorDto.getCedula());
            vendedor.setDireccion(vendedorDto.getDireccion());
            vendedor.setUsuario(vendedorDto.getUsuario());
            vendedor.setPassword(vendedorDto.getPassword());

            vendedor.setListaProductos(productosDtoToProductos(modelFactory.getListaProductosDto(vendedorDto.getIdVendedor())));
            vendedor.setMuro(muroDtoToMuro(vendedorDto.getMuro()));
            vendedor.setListaContactos(modelFactory.getListaContactos(vendedorDto.getIdVendedor()));


        }
        return vendedores;
    }

    @Override
    public List<PublicacionDTO> publicacionesToPublicacionesDto(List<Publicacion> publicaciones) {
        List<PublicacionDTO> publicacionesDto = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            publicacionesDto.add(publicacionToPublicacionDto(publicacion));
        }
        return publicacionesDto;
    }

    @Override
    public List<Publicacion> publicacionesDtoToPublicaciones(List<PublicacionDTO> publicacionesDto) {
        List<Publicacion> publicaciones = new ArrayList<>();
        for (PublicacionDTO publicacionDto : publicacionesDto) {
            publicaciones.add(publicacionDtoToPublicacion(publicacionDto));
        }
        return publicaciones;
    }

    @Override
    public List<ProductoDTO> productosToProductosDto(List<Producto> productos) {
        List<ProductoDTO> productosDto = new ArrayList<>();
        for (Producto producto : productos) {
            productosDto.add(productoToProductoDto(producto));
        }
        return productosDto;
    }

    @Override
    public List<Producto> productosDtoToProductos(List<ProductoDTO> productosDto) {
        List<Producto> productos = new ArrayList<>();
        for (ProductoDTO productoDto : productosDto) {
            productos.add(productoDtoToProducto(productoDto));
        }
        return productos;
    }

    @Override
    public List<Comentario> comentariosDtoToComentarios(List<ComentarioDTO> comentariosDto) {
        List<Comentario> comentarios = new ArrayList<>();
        for (ComentarioDTO comentarioDto : comentariosDto) {
            comentarios.add(comentarioDtoToComentario(comentarioDto));
        }
        return comentarios;
    }

    @Override
    public List<ComentarioDTO> comentariosToComentariosDto(List<Comentario> comentarios) {
        List<ComentarioDTO> comentariosDto = new ArrayList<>();
        for (Comentario comentario : comentarios) {
            comentariosDto.add(comentarioToComentarioDto(comentario));
        }
        return comentariosDto;
    }

    @Override
    public List<Mensaje> mensajesDtoToMensajes(List<MensajeDTO> mensajesDto) {
        List<Mensaje> mensajes = new ArrayList<>();
        for (MensajeDTO mensajeDto : mensajesDto) {
            mensajes.add(mesajeDtoToMensaje(mensajeDto));
        }
        return mensajes;
    }

    @Override
    public List<MensajeDTO> mensajeToMensajesDto(List<Mensaje> mensajes) {
        List<MensajeDTO> mensajesDto = new ArrayList<>();
        for (Mensaje mensaje : mensajes) {
            mensajesDto.add(mensajeToMensajeDto(mensaje));
        }
        return mensajesDto;
    }
}
