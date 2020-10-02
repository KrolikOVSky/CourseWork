package com.course.frontEnd.controllers.header;

import com.course.Main;
import com.course.backEnd.Global;
import com.course.frontEnd.MakeWindow;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HeaderController {
    public BorderPane thisWindow;
    public MenuItem active;

    private boolean activity;

    public void newAction(ActionEvent actionEvent) {
        Global.newSource();
    }

    public void openAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Database");
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("MyDB files (*.mydb)", Global.extension);
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(Main.stage);
        Global.path = file.getPath();
        try{
            Global.fromFileToList();
        }catch (Exception exception){
            Global.errorReport(exception);
        }
    }

    public void saveAction(ActionEvent actionEvent) {
        if(Global.path != null){
            Global.fromListToFile();
        }
        else {
            saveAsAction(actionEvent);
        }
    }

    public void saveAsAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Database");
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("MyDB files (*.mydb)", Global.extension);
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(Main.stage);
        try{
            Global.fromListToFile();
        }catch (Exception exception){
            Global.errorReport(exception);
        }
    }

    public void exitAction(ActionEvent actionEvent) {
        Stage stage = (Stage) thisWindow.getScene().getWindow();
        stage.close();
    }

    public void addElementAction(ActionEvent actionEvent) {
    }

    public void deleteElementAction(ActionEvent actionEvent) {
    }

    public void addTableAction(ActionEvent actionEvent) {
    }

    public void deleteTableAction(ActionEvent actionEvent) {
    }

    public void helpAction(ActionEvent actionEvent) {
    }

    public void aboutAction(ActionEvent actionEvent) {
        try{
            MakeWindow aboutWindow = new MakeWindow("About", "/com.course/AboutWindow.fxml");
            aboutWindow.showDialog();
        }catch (Exception e){
            System.out.println(e.getMessage());
            Global.errorReport(e);
        }
    }
}
