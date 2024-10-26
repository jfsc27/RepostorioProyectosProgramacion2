package co.edu.uniquindio.projectfinal.finalproject.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comentario extends Mensaje {
    private int numMeGustas = 0;

    public Comentario(Usuario usuario, LocalDate fecha, LocalTime hora, String mensaje) {
        super(usuario, fecha, hora, mensaje);
    }

    public Comentario() {
        super();
    }

    // Getters y Setters
    public int getNumMeGustas() {
        return numMeGustas;
    }

    public void setNumMeGustas(int numMeGustas) {
        this.numMeGustas = numMeGustas;
    }
}
