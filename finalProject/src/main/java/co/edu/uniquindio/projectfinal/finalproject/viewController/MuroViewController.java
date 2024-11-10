package co.edu.uniquindio.projectfinal.finalproject.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;

public class MuroViewController  implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> cb1Vend;

    @FXML
    private ComboBox<?> cb2Vend;

    @FXML
    private ComboBox<?> cbProd;

    @FXML
    private ImageView marketplacepng;

    @FXML
    private Label productos;

    @FXML
    private Button reportebttn;

    @FXML
    private ScrollPane scrollEstProd;

    @FXML
    private ScrollPane scrollEstVend;

    @FXML
    private ScrollPane scrollUltProduc;

    @FXML
    private ScrollPane scrollcontactos;

    @FXML
    private ScrollPane scrollprod;

    @FXML
    void initialize() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
