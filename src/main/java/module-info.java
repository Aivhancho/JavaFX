module com.example.anchorpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.anchorpane to javafx.fxml;
    exports com.example.anchorpane;
}