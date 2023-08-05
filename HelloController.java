package com.example.parcialprogra1;


//Importar las clases necesarias
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class HelloController implements Initializable {

    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellido;
    @FXML
    private TextField tfDatos;

    @FXML
    private ChoiceBox<String> chAnio;

    @FXML
    private void accionMostrar(ActionEvent evento) {
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String anio = chAnio.getValue();
        tfDatos.setText("Nombre: " + nombre + " Apellido: " + apellido + " Año de nacimiento: " + anio);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfNombre.setText("-----");
        chAnio.getItems().addAll("2000", "2001", "2002", "2003");
    }
}
