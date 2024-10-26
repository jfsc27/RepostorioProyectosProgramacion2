package co.edu.uniquindio.projectfinal.finalproject.mapping.dto;

public class AdministradorDTO extends UsuarioDTO{
    private String IdAdmin;

    public AdministradorDTO(String nombre, String apellido, String cedula, String direccion, String usuario, String password,String IdAdmin) {
        super(nombre, apellido, cedula, direccion, usuario, password);
        this.IdAdmin = IdAdmin;
    }

    public String getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        IdAdmin = idAdmin;
    }
}
