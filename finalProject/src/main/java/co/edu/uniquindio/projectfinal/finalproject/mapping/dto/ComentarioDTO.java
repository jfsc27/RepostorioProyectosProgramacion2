package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ComentarioDTO extends MensajeDTO{
    private int numMeGustas;

    public ComentarioDTO(UsuarioDTO usuario , LocalDate fecha , LocalTime hora , String mensaje, int numMeGustas ) {
        super(usuario,fecha,hora,mensaje);
        this.numMeGustas = numMeGustas;
    }
    public ComentarioDTO() {}

    public int getNumMeGustas() {
        return numMeGustas;
    }

    public void setNumMeGustas(int numMeGustas) {
        this.numMeGustas = numMeGustas;
    }
}
