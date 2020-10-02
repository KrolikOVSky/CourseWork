package com.course.frontEnd.controllers;

import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AboutWindowController {

    public BorderPane mainPane;

    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage)mainPane.getScene().getWindow();
        stage.close();
    }
}
