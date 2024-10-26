package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import java.util.ArrayList;
import java.util.List;

public class ChatDTO {

    private final int maxUsuarios = 2;
    private List<UsuarioDTO> listaUsuarios;
    private List<MensajeDTO> listaMensajes;

    public ChatDTO(){
        listaUsuarios = new ArrayList<>();
        listaMensajes = new ArrayList<>();
    }

    public int getMaxUsuarios() {
        return maxUsuarios;
    }

    public List<UsuarioDTO> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<UsuarioDTO> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<MensajeDTO> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(List<MensajeDTO> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }
}
