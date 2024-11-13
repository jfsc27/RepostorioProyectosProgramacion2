package co.edu.uniquindio.projectfinal.finalproject.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
    private static final int MAX_CONTACTOS = 10;
    private String idVendedor;
    private List<Vendedor> listaContactos = new ArrayList<>();
    private List<Producto> listaProductos = new ArrayList<>();
    private Muro muro = new Muro();

    public Vendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String password, String idVendedor) {
        super(nombre, apellido, cedula, direccion, usuario, password);
        this.idVendedor = idVendedor;
    }

    public Vendedor() {}

    public boolean verificarContactoRepetido(Vendedor vendedor){
        boolean repetido = false;
        for (Vendedor vendedor1 : listaContactos){
            if(vendedor1.getIdVendedor().equals(vendedor.getIdVendedor())){
                repetido = true;
            }
        }
        return repetido;
    }

    public void agregarContacto(Vendedor vendedor) {
        if(!verificarContactoRepetido(vendedor) && listaContactos.size() < MAX_CONTACTOS){
            listaContactos.add(vendedor);
        }
    }

    public List<Producto> getListaProductosDisponibles(){
        ArrayList<Producto> disponibles = new ArrayList<>();

        for (Producto producto : listaProductos){
            if (producto.getEstado() != Estado.PUBLICADO){
                disponibles.add(producto);
            }
        }
        return disponibles;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public List<Vendedor> getListaContactos() {
        return listaContactos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}