package com.course.frontEnd.controllers.header;

import com.course.Main;
import com.course.backEnd.Global;
import com.course.frontEnd.MakeWindow;
import com.course.paths.IPaths;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HeaderController implements IPaths {
    public BorderPane thisWindow;

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
//        File file = new File(TEST_FILE);
        Global.path = file.getPath();
        try {
            Global.fromFileToList();
        } catch (Exception exception) {
            Global.errorReport(exception);
        }
    }

    public void saveAction(ActionEvent actionEvent) {
        if (Global.path != null) {
            Global.fromListToFile();
        } else {
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
        Global.path = file.getPath();
        try {
            Global.fromListToFile();
        } catch (Exception exception) {
            Global.errorReport(exception);
        }
    }

    public void exitAction(ActionEvent actionEvent) {
        if (Global.routes != null) {
            doYouWantToSaveWindow();
        } else {
            saveAsAction(actionEvent);
        }

        close();
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
        try {
            MakeWindow aboutWindow = new MakeWindow("About", "/com.course/AboutWindow.fxml");
            aboutWindow.showDialog();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Global.errorReport(e);
        }
    }

    private void close() {
        Stage stage = (Stage) thisWindow.getScene().getWindow();
        stage.close();
    }

    private void doYouWantToSaveWindow() {
        /*Button save_btn = new Button("Save");
        Button dontSave_btn = new Button("Don't save");
        Button cancel_btn = new Button("Cancel");
        Label label = new Label("Are you sure to exit?");
        HBox buttons = new HBox();
        BorderPane root = new BorderPane();
        Stage stage = new Stage();
        Scene scene;

        buttons.setAlignment(Pos.CENTER);*/


    }
}
