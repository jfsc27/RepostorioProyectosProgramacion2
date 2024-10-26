module co.edu.uniquindio.projectfinal.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires jdk.management;

    opens co.edu.uniquindio.projectfinal.finalproject.viewController;
    opens co.edu.uniquindio.projectfinal.finalproject to javafx.fxml;
    exports co.edu.uniquindio.projectfinal.finalproject;
}