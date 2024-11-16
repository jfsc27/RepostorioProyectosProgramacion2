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
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
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
            AdministradorDTO administradorDTO = new AdministradorDTO();
            administradorDTO.setNombre(administrador.getNombre());
            administradorDTO.setApellido(administrador.getApellido());
            administradorDTO.setCedula(administrador.getCedula());
            administradorDTO.setDireccion(administrador.getDireccion());
            administradorDTO.setUsuario(administrador.getUsuario());
            administradorDTO.setPassword(administrador.getPassword());
            return administradorDTO;
        }
        return null;
    }

    @Override
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        if (usuarioDTO instanceof VendedorDTO) {
            VendedorDTO vendedorDTO = (VendedorDTO) usuarioDTO;
            Vendedor vendedor = new Vendedor();
            vendedor.setNombre(vendedorDTO.getNombre());
            vendedor.setApellido(vendedorDTO.getApellido());
            vendedor.setCedula(vendedorDTO.getCedula());
            vendedor.setDireccion(vendedorDTO.getDireccion());
            vendedor.setUsuario(vendedorDTO.getUsuario());
            vendedor.setPassword(vendedorDTO.getPassword());

            vendedor.setListaProductos(productosDTOToProductos(modelFactory.getListaProductosDTO(vendedorDTO.getIdVendedor())));
            vendedor.setMuro(muroDTOToMuro(vendedorDTO.getMuro()));
            vendedor.setListaContactos(modelFactory.getListaContactos(vendedorDTO.getIdVendedor()));
            return vendedor;
        } else if (usuarioDTO instanceof AdministradorDTO) {
            AdministradorDTO administradorDTO = (AdministradorDTO) usuarioDTO;
            Administrador administrador = new Administrador();
            administrador.setNombre(administradorDTO.getNombre());
            administrador.setApellido(administradorDTO.getApellido());
            administrador.setCedula(administradorDTO.getCedula());
            administrador.setDireccion(administradorDTO.getDireccion());
            administrador.setUsuario(administradorDTO.getUsuario());
            administrador.setPassword(administradorDTO.getPassword());
            return administrador;
        }
        return null;
    }

    @Override
    public Publicacion publicacionDTOToPublicacion(PublicacionDTO publicacionDTO) {
        Publicacion publicacion = new Publicacion();
        publicacion.setFechaPublicacion(publicacionDTO.getFechaPublicacion());
        publicacion.setHoraPublicacion(publicacionDTO.getHoraPublicacion());
        publicacion.setProducto(productoDTOToProducto(publicacionDTO.getProducto()));
        publicacion.setDescripcion(publicacionDTO.getDescripcion());

        publicacion.setListaComentarios(modelFactory.getListaComentarios(publicacionDTO.getIdVendedor(), publicacionDTO));
        publicacion.setListaMegustas(modelFactory.getListaMeGusta(publicacionDTO.getIdVendedor(), publicacionDTO));
        return publicacion;
    }

    @Override
    public PublicacionDTO publicacionToPublicacionDTO(Publicacion publicacion) {
        PublicacionDTO publicacionDTO = new PublicacionDTO();
        publicacionDTO.setFechaPublicacion(publicacion.getFechaPublicacion());
        publicacionDTO.setHoraPublicacion(publicacion.getHoraPublicacion());
        publicacionDTO.setProducto(productoToProductoDTO(publicacion.getProducto()));
        publicacionDTO.setDescripcion(publicacion.getDescripcion());
        return publicacionDTO;
    }

    @Override
    public ProductoDTO productoToProductoDTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setCategoria(producto.getCategoria());
        productoDTO.setPrecio(producto.getPrecio());
        producto.setEstado(producto.getEstado());
        producto.setImagen(producto.getImagen());
        return productoDTO;
    }

    @Override
    public Producto productoDTOToProducto(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setCategoria(productoDTO.getCategoria());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setEstado(productoDTO.getEstado());
        producto.setImagen(productoDTO.getImagen());
        return producto;
    }

    @Override
    public Mensaje mensajeDTOToMensaje(MensajeDTO mensajeDTO) {
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje(mensajeDTO.getMensaje());
        mensaje.setUsuario(usuarioDTOToUsuario(mensajeDTO.getUsuario()));
        mensaje.setFecha(mensajeDTO.getFecha());
        mensaje.setHora(mensajeDTO.getHora());
        return mensaje;
    }

    @Override
    public MensajeDTO mensajeToMensajeDTO(Mensaje mensaje) {
        MensajeDTO mensajeDTO = new MensajeDTO();
        mensajeDTO.setMensaje(mensaje.getMensaje());
        mensajeDTO.setUsuario(usuarioToUsuarioDTO(mensaje.getUsuario()));
        mensajeDTO.setFecha(mensaje.getFecha());
        mensajeDTO.setHora(mensaje.getHora());
        return mensajeDTO;
    }

    @Override
    public Comentario comentarioDTOToComentario(ComentarioDTO comentarioDTO) {
        Comentario comentario = new Comentario();
        comentario.setFecha(comentarioDTO.getFecha());
        comentario.setHora(comentarioDTO.getHora());
        comentario.setMensaje(comentarioDTO.getMensaje());
        comentario.setUsuario(usuarioDTOToUsuario(comentarioDTO.getUsuario()));
        comentario.setNumMeGustas(comentarioDTO.getNumMeGustas());
        return comentario;
    }

    @Override
    public ComentarioDTO comentarioToComentarioDTO(Comentario comentario) {
        ComentarioDTO comentarioDTO = new ComentarioDTO();
        comentarioDTO.setFecha(comentario.getFecha());
        comentarioDTO.setHora(comentario.getHora());
        comentarioDTO.setMensaje(comentario.getMensaje());
        comentarioDTO.setUsuario(usuarioToUsuarioDTO(comentario.getUsuario()));
        comentarioDTO.setNumMeGustas(comentario.getNumMeGustas());
        return comentarioDTO;
    }

    @Override
    public Muro muroDTOToMuro(MuroDTO muroDTO) {
        Muro muro = new Muro();
        muro.setListaChats(ListaChatsDTOToListaChats(muroDTO.getListaChats()));
        muro.setListaPublicaciones(publicacionesDTOToPublicaciones(muroDTO.getListaPublicaciones()));
        return muro;
    }

    private List<Chat> ListaChatsDTOToListaChats(List<ChatDTO> listaChatsDTO) {
        List<Chat> listaChats = new ArrayList<>();
        for (ChatDTO chatDTO : listaChatsDTO) {
            listaChats.add(chatDTOToChat(chatDTO));
        }
        return listaChats;
    }

    private Chat chatDTOToChat(ChatDTO chatDTO) {
        Chat chat = new Chat();
        chat.setMensajes(mensajesDTOToMensajes(chatDTO.getListaMensajes()));
        chat.setUsuarios(usuariosDTOToUsuarios(chatDTO.getListaUsuarios()));
        return chat;
    }

    private List<Usuario> usuariosDTOToUsuarios(List<UsuarioDTO> listaUsuariosDTO) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        for (UsuarioDTO usuarioDTO : listaUsuariosDTO) {
            listaUsuarios.add(usuarioDTOToUsuario(usuarioDTO));
        }
        return listaUsuarios;
    }

    @Override
    public MuroDTO muroToMuroDTO(Muro muro) {
        MuroDTO muroDTO = new MuroDTO();
        muroDTO.setListaChats(listaChatsToListaChatsDTO(muro.getListaChats()));
        muroDTO.setListaPublicaciones(publicacionesToPublicacionesDTO(modelFactory.getListaPublicaciones(muro.getIdVendedor())));
        return null;
    }

    private List<ChatDTO> listaChatsToListaChatsDTO(List<Chat> listaChats) {
        List<ChatDTO> listaChatsDTO = new ArrayList<>();
        for (Chat chat : listaChats) {
            listaChatsDTO.add(chatToChatDTO(chat));
        }
        return listaChatsDTO;
    }

    private ChatDTO chatToChatDTO(Chat chat) {
        ChatDTO chatDTO = new ChatDTO();
        chatDTO.setListaUsuarios(usuariosToUsuariosDTO(chat.getUsuarios()));
        chatDTO.setListaMensajes(mensajeToMensajesDTO(chat.getMensajes()));
        return chatDTO;
    }

    private List<UsuarioDTO> usuariosToUsuariosDTO(List<Usuario> usuarios) {
        List<UsuarioDTO> usuariosDTO = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuariosDTO.add(usuarioToUsuarioDTO(usuario));
        }
        return usuariosDTO;
    }

    @Override
    public List<VendedorDTO> VendedoresToVendedoresDTO(List<Vendedor> vendedores) {
        List<VendedorDTO> vendedoresDTO = new ArrayList<>();
        for (Vendedor vendedor : vendedores) {
            VendedorDTO vendedorDTO = new VendedorDTO();
            vendedorDTO.setNombre(vendedor.getNombre());
            vendedorDTO.setApellido(vendedor.getApellido());
            vendedorDTO.setCedula(vendedor.getCedula());
            vendedorDTO.setDireccion(vendedor.getDireccion());
            vendedorDTO.setUsuario(vendedor.getUsuario());
            vendedorDTO.setPassword(vendedor.getPassword());
            vendedoresDTO.add(vendedorDTO);
        }
        return vendedoresDTO;
    }

    @Override
    public List<Vendedor> VendedoresDTOToVendedores(List<VendedorDTO> vendedoresDTO) {
        List<Vendedor> vendedores = new ArrayList<>();
        for (VendedorDTO vendedorDTO : vendedoresDTO) {
            Vendedor vendedor = new Vendedor();
            vendedor.setNombre(vendedorDTO.getNombre());
            vendedor.setApellido(vendedorDTO.getApellido());
            vendedor.setCedula(vendedorDTO.getCedula());
            vendedor.setDireccion(vendedorDTO.getDireccion());
            vendedor.setUsuario(vendedorDTO.getUsuario());
            vendedor.setPassword(vendedorDTO.getPassword());

            vendedor.setListaProductos(productosDTOToProductos(modelFactory.getListaProductosDTO(vendedorDTO.getIdVendedor())));
            vendedor.setMuro(muroDTOToMuro(vendedorDTO.getMuro()));
            vendedor.setListaContactos(modelFactory.getListaContactos(vendedorDTO.getIdVendedor()));
        }
        return vendedores;
    }

    @Override
    public List<PublicacionDTO> publicacionesToPublicacionesDTO(List<Publicacion> publicaciones) {
        List<PublicacionDTO> publicacionesDTO = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            publicacionesDTO.add(publicacionToPublicacionDTO(publicacion));
        }
        return publicacionesDTO;
    }

    @Override
    public List<Publicacion> publicacionesDTOToPublicaciones(List<PublicacionDTO> publicacionesDTO) {
        List<Publicacion> publicaciones = new ArrayList<>();
        for (PublicacionDTO publicacionDTO : publicacionesDTO) {
            publicaciones.add(publicacionDTOToPublicacion(publicacionDTO));
        }
        return publicaciones;
    }

    @Override
    public List<ProductoDTO> productosToProductosDTO(List<Producto> productos) {
        List<ProductoDTO> productosDTO = new ArrayList<>();
        for (Producto producto : productos) {
            productosDTO.add(productoToProductoDTO(producto));
        }
        return productosDTO;
    }

    @Override
    public List<Producto> productosDTOToProductos(List<ProductoDTO> productosDTO) {
        List<Producto> productos = new ArrayList<>();
        for (ProductoDTO productoDTO : productosDTO) {
            productos.add(productoDTOToProducto(productoDTO));
        }
        return productos;
    }

    @Override
    public List<Comentario> comentariosDTOToComentarios(List<ComentarioDTO> comentariosDTO) {
        List<Comentario> comentarios = new ArrayList<>();
        for (ComentarioDTO comentarioDTO : comentariosDTO) {
            comentarios.add(comentarioDTOToComentario(comentarioDTO));
        }
        return comentarios;
    }

    @Override
    public List<ComentarioDTO> comentariosToComentariosDTO(List<Comentario> comentarios) {
        List<ComentarioDTO> comentariosDTO = new ArrayList<>();
        for (Comentario comentario : comentarios) {
            comentariosDTO.add(comentarioToComentarioDTO(comentario));
        }
        return comentariosDTO;
    }

    @Override
    public List<Mensaje> mensajesDTOToMensajes(List<MensajeDTO> mensajesDTO) {
        List<Mensaje> mensajes = new ArrayList<>();
        for (MensajeDTO mensajeDTO : mensajesDTO) {
            mensajes.add(mensajeDTOToMensaje(mensajeDTO));
        }
        return mensajes;
    }

    @Override
    public List<MensajeDTO> mensajeToMensajesDTO(List<Mensaje> mensajes) {
        List<MensajeDTO> mensajesDTO = new ArrayList<>();
        for (Mensaje mensaje : mensajes) {
            mensajesDTO.add(mensajeToMensajeDTO(mensaje));
        }
        return mensajesDTO;
    }
}