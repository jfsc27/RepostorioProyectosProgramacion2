package co.edu.uniquindio.projectfinal.finalproject.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private static final int MAX_USUARIOS = 2;
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Mensaje> mensajes = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        if (usuarios.size() < MAX_USUARIOS) {
            usuarios.add(usuario);
        }
    }

    public void agregarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    // Getters y Setters
    public int getMaxUsuarios() {
        return MAX_USUARIOS;
    }

    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public void setUsuarios(List<Usuario> nuevosUsuarios) {
        usuarios.clear();
        usuarios.addAll(nuevosUsuarios.subList(0, Math.min(MAX_USUARIOS, nuevosUsuarios.size())));
    }

    public List<Mensaje> getMensajes() {
        return new ArrayList<>(mensajes);
    }

    public void setMensajes(List<Mensaje> nuevosMensajes) {
        mensajes.clear();
        mensajes.addAll(nuevosMensajes);
    }
}
