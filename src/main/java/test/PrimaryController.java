package test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class PrimaryController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}