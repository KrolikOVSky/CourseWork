package com.course.frontEnd;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MakeWindow {
    private Parent root;
    private Stage stage;
    private FXMLLoader loader;
    private Scene scene;

    public MakeWindow(){}

    public MakeWindow(String title, String path) throws Exception{
        System.out.printf("into class MakeWindow: %s\n\n", getClass().getResource(path));
        loader = new FXMLLoader();
        root = FXMLLoader.load(getClass().getResource(path));
        stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
    }

    public MakeWindow(String title, String path, boolean resizable) throws Exception{
        loader = new FXMLLoader(getClass().getResource(path));
        root = loader.load();
        stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.setResizable(resizable);
    }

    public MakeWindow(String title, String path, boolean resizable, double layoutX, double layoutY) throws Exception{
        loader = new FXMLLoader(getClass().getResource(path));
        root = loader.load();
        stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root, layoutX, layoutY));
        stage.setResizable(resizable);
    }


    public MakeWindow(Stage stage) throws Exception{
        this.stage = stage;
    }

    public FXMLLoader getLoader(){ return this.loader; }
    public Stage getStage() { return stage; }
    public Parent getRoot() { return root; }
    public Scene getScene() { return scene; }

    public void show(){ this.stage.show(); }
    public void showDialog(){ this.stage.showAndWait(); }
    public void hide() { this.stage.hide(); }
    public void close(){ this.stage.close(); }

}
