package com.example.anchorpane;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;

public class HelloController {

    @FXML
    private CheckBox confirmacion;

    @FXML
    private Label informacion;

    @FXML
    protected void onEnviar() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("¡¡ALERTA, ALERTA!! NOS ATACAN!");
        alert.showAndWait();

        if (confirmacion.isSelected()){
            informacion.setText("El usuario acepta las condiciones");
        } else {
            informacion.setText("El usuario NO acepta las condiciones");
        }
    }
}