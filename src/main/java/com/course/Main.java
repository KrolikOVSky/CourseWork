package com.course;

import com.course.paths.IPaths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application implements IPaths {
    private static final Scene scene = new Scene(new Pane());
    public static Stage stage = new Stage();

    public static void setScene(String fxml) throws IOException {
        BorderPane pane = FXMLLoader.load(Main.class.getResource(HEADER));
        pane.setCenter(FXMLLoader.load(Main.class.getResource(fxml)));
//        scene.setUserAgentStylesheet("/com.course/caspian.css");
        scene.setRoot(pane);

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setScene(EDIT_WINDOW);
        stage.setResizable(false);
        stage.setScene(scene);

        primaryStage = stage;
        primaryStage.show();
    }
}
