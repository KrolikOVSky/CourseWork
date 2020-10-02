package com.course.frontEnd.controllers;


import com.course.paths.IPaths;
import javafx.event.ActionEvent;
import test.AppTest;

public class MainWindowController implements IPaths {

    public void firstAction(ActionEvent actionEvent) throws Exception{
        AppTest.setScene(ABOUT_WINDOW);
    }

    public void secondAction(ActionEvent actionEvent) throws Exception{
        AppTest.setScene(TEST);
    }
}
