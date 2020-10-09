package com.course.frontEnd.controllers;

import com.course.backEnd.Global;
import com.course.backEnd.Route;
import com.course.backEnd.Routes;
import com.course.paths.IPaths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EditWindowController implements IPaths {

    public TableView<Route> mainTable;
    @FXML private TableColumn idTableField = new TableColumn();
    @FXML private TableColumn nameTableField = new TableColumn();
    @FXML private TableColumn typeTableField = new TableColumn();
    @FXML private TableColumn lengthTableField = new TableColumn();
    @FXML private TableColumn stopsTableField = new TableColumn();

    public static void initialization(Route route){

    }

    public void addToTable(Routes routes){
        var i = 0;
        mainTable.getItems().clear();
//        mainTable.getItems().add(Global.routes);
        for (var el : Global.routes.getRoutes()) {
            mainTable.getItems().add(el);
        }
        /*for (var el : routes.getRoutes()) {
            idTableField.setText(String.valueOf(el.getId()));
            nameTableField.setText(el.getName());
            typeTableField.setText(el.getTypeOfTransport());
            lengthTableField.setText(String.valueOf(el.getLength()));
            stopsTableField.setText(String.valueOf(el.getCountOfStops()));
        }*/
//        idTableField.

    }

    public void clickAction(ActionEvent actionEvent) {
        addToTable(Global.routes);
    }
}
