package co.edu.uniquindio.proyectoFinal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloAplicacion extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloAplicacion.class.getResource("Test.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 454, 526);
        stage.setTitle("CRUD Producto");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
