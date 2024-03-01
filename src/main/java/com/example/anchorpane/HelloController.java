package com.example.anchorpane;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private CheckBox confirmacion;

    @FXML
    private Label informacion;

    @FXML
    protected void onEnviar() {
        if (confirmacion.isSelected()){
            informacion.setText("El usuario acepta las condiciones");
        } else {
            informacion.setText("El usuario NO acepta las condiciones");
        }
    }
}