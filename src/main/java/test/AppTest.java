package test;

import com.course.paths.IPaths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppTest extends Application implements IPaths {
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
        setScene(TEST);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
