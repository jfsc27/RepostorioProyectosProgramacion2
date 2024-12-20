package co.edu.uniquindio.projectfinal.finalproject.model;

import co.edu.uniquindio.projectfinal.finalproject.service.ICrudPublicacion;
import co.edu.uniquindio.projectfinal.finalproject.service.IInteraccion;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements IInteraccion, ICrudPublicacion {
    private String nombre;
    private List<Administrador> listaAdministradores;
    private List<Usuario> listaUsuarios;
    private List<Vendedor> listaVendedores;

    public MarketPlace(String nombre) {
        this.nombre = nombre;
        this.listaAdministradores = new ArrayList<Administrador>();
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaVendedores = new ArrayList<Vendedor>();
    }

    public MarketPlace() {}

    public <T> void agregarAutomatico(T objeto){
        if (objeto instanceof Usuario){
            listaUsuarios.add((Usuario)objeto);
            if(objeto instanceof Administrador){
                listaAdministradores.add((Administrador)objeto);
            }else if(objeto instanceof Vendedor) {
                listaVendedores.add((Vendedor)objeto);
            }
        }
    }

    public Usuario getUsuario(String usuario, String password) {
        return listaUsuarios.stream()
                .filter(u -> u.getUsuario().equals(usuario) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    /**
     * Metodo para buscar la lista de productos de un vendedor por id
     * @param id
     * @return
     */
    public List<Producto> getListaProductosVendedor(String id) {
        List<Producto> productos = new ArrayList<>();
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getIdVendedor().equals(id)) {
                productos = vendedor.getListaProductos();
            }
        }
        return productos;
    }

    public Usuario getUsuarioLogin(String usuario, String password) {
        return getUsuario(usuario, password);
    }

    public boolean verificarUsuario(String usuario, String password) {
        return getUsuario(usuario, password) != null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(List<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }
    public boolean verificarPublicacionExiste(Publicacion publicacion) {
        List<Publicacion> publicaciones = new ArrayList<>();
        for(Vendedor vendedor : listaVendedores){
            publicaciones.addAll(vendedor.getMuro().getListaPublicaciones());
        }

        for(Publicacion publi : publicaciones){
            if(publi.getProducto() == publicacion.getProducto()){
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean crearPublicacion(Publicacion publicacion, String idVendedor) {
        if(!verificarPublicacionExiste(publicacion)){
            for(Vendedor vendedor : listaVendedores){
                vendedor.setEstadoProducto(publicacion.getProducto());
                vendedor.getMuro().agregarPublicacion(publicacion);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarPublicacion(Publicacion publicacion, Vendedor vendedor) {
        return false;
    }

    @Override
    public boolean actualizarPublicacion(Publicacion publicacion, Vendedor vendedor) {
        return false;
    }

    @Override
    public void agregarContactosEntreSi(Vendedor contacto1, Vendedor contacto2) {

    }

    @Override
    public void darMeGustaPublicacion(Vendedor usuario, Publicacion publicacion) {



    }
}
