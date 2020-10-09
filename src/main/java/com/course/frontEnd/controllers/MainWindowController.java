package com.course.frontEnd.controllers;


import com.course.Main;
import com.course.paths.IPaths;
import javafx.event.ActionEvent;

public class MainWindowController implements IPaths {

    public void clickAction(ActionEvent actionEvent) throws Exception{
        Main.setScene(EDIT_WINDOW);
    }
}
