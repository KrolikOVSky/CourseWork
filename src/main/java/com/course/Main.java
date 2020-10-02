package com.course;

import com.course.frontEnd.MakeWindow;
import com.course.paths.IPaths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import test.App;

import java.io.IOException;


public class Main extends Application implements IPaths {
    public static Stage stage = new Stage();

    private static final Scene scene = new Scene(new Pane());

    public static void setScene(String fxml) throws IOException {
        BorderPane pane = FXMLLoader.load(App.class.getResource(HEADER));
        pane.setCenter(FXMLLoader.load(App.class.getResource(fxml)));
        scene.setRoot(pane);

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setScene(MAIN_WINDOW);
//        primaryStage.setResizable(false);
//        primaryStage.setScene(scene);

        stage.setResizable(false);
        stage.setScene(scene);
        primaryStage = stage;
        primaryStage.show();
    }

    /*public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        *//*
        MakeWindow window = new MakeWindow("MainWindow", MAIN_WINDOW);
        window.show();
        Parent root = FXMLLoader.load(getClass().getResource("MainWindowvv.fxml"));
        Scene scene =new Scene(root);
        primaryStage.setTitle("test");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.printf("into class com.course.Main: %s\n\n", getClass().getResource(MAIN_WINDOW));
        System.out.printf("into class com.course.Main path: %s\n\n", MAIN_WINDOW);
       *//*



    }*/
}
