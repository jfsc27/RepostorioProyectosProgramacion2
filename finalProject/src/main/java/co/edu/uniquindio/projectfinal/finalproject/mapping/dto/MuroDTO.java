package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import java.util.ArrayList;
import java.util.List;

public class MuroDTO {
    private List<PublicacionDTO> listaPublicaciones;
    private List<ChatDTO> listaChats;

    public MuroDTO() {
        listaPublicaciones = new ArrayList<>();
        listaChats = new ArrayList<>();
    }

    public List<PublicacionDTO> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(List<PublicacionDTO> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public List<ChatDTO> getListaChats() {
        return listaChats;
    }

    public void setListaChats(List<ChatDTO> listaChats) {
        this.listaChats = listaChats;
    }
}
