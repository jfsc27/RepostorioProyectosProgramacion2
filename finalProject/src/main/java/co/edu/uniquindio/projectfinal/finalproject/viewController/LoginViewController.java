package co.edu.uniquindio.projectfinal.finalproject.viewController;

import co.edu.uniquindio.projectfinal.finalproject.controller.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {

    LoginController loginController;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private TextField passText;

    @FXML
    private TextField usuarioText;

    @FXML
    void onIniciarSesion(ActionEvent event) {
        UsuarioDTO buscar = new UsuarioDTO(usuarioText.getText(), passText.getText());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginController = new LoginController();
    }
}
