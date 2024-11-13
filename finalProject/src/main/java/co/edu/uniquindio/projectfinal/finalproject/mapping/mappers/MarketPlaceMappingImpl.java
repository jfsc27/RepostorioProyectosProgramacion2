package co.edu.uniquindio.projectfinal.finalproject.mapping.mappers;

import co.edu.uniquindio.projectfinal.finalproject.factory.ModelFactory;
import co.edu.uniquindio.projectfinal.finalproject.mapping.dto.*;
import co.edu.uniquindio.projectfinal.finalproject.model.*;
import co.edu.uniquindio.projectfinal.finalproject.service.IMarketPlaceMapping;

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
    public Publicacion publicacionDtoToPublicacion(PublicacionDTO publicacion) {
        return null;
    }

    @Override
    public PublicacionDTO publicacionToPublicacionDto(Publicacion publicacion) {
        return null;
    }

    @Override
    public ProductoDTO productoToProductoDto(Producto producto) {
        return null;
    }

    @Override
    public Producto productoDtoToProducto(ProductoDTO productoDto) {
        return null;
    }

    @Override
    public Mensaje mesajeDtoToMensaje(MensajeDTO mensaje) {
        return null;
    }

    @Override
    public MensajeDTO mensajeToMensajeDto(Mensaje mensaje) {
        return null;
    }

    @Override
    public Comentario comentarioDtoToComentario(ComentarioDTO comentario) {
        return null;
    }

    @Override
    public ComentarioDTO comentarioToComentarioDto(Comentario comentario) {
        return null;
    }

    @Override
    public Muro muroDtoToMuro(MuroDTO muro) {
        return null;
    }

    @Override
    public MuroDTO muroToMuroDto(Muro muro) {
        return null;
    }

    @Override
    public List<VendedorDTO> VendedoresToVendedoresDto(List<Vendedor> vendedores) {
        return List.of();
    }

    @Override
    public List<Vendedor> VendedoresDtoToVendedores(List<VendedorDTO> vendedores) {
        return List.of();
    }

    @Override
    public List<PublicacionDTO> publicacionesToPublicacionesDto(List<Publicacion> publicaciones) {
        return List.of();
    }

    @Override
    public List<Publicacion> publicacionesDtoToPublicaciones(List<PublicacionDTO> publicacionesDto) {
        return List.of();
    }

    @Override
    public List<ProductoDTO> productosToProductosDto(List<Producto> productos) {
        return List.of();
    }

    @Override
    public List<Producto> productosDtoToProductos(List<ProductoDTO> productosDto) {
        return List.of();
    }

    @Override
    public List<Comentario> comentariosDtoToComentarios(List<ComentarioDTO> comentariosDto) {
        return List.of();
    }

    @Override
    public List<ComentarioDTO> comentariosToComentariosDto(List<Comentario> comentarios) {
        return List.of();
    }

    @Override
    public List<Mensaje> mensajesDtoToMensajes(List<MensajeDTO> mensajesDto) {
        return List.of();
    }

    @Override
    public List<MensajeDTO> mensajeToMensajesDto(List<Mensaje> mensajes) {
        return List.of();
    }
}
