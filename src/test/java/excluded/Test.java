package excluded;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button save_btn = new Button("Save");
        Button dontSave_btn = new Button("Don't save");
        Button cancel_btn = new Button("Cancel");
        Label label = new Label("Are you sure to exit?");
        HBox buttons = new HBox();
        BorderPane root = new BorderPane();
        Stage stage = new Stage();

        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-background-color: blue");

        stage.setHeight(100);
        stage.setWidth(200);

        buttons.getChildren().addAll(save_btn, dontSave_btn, cancel_btn);
        buttons.setAlignment(Pos.CENTER);


        root.setTop(label);
        root.setCenter(buttons);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        primaryStage = stage;
        primaryStage.show();
    }
}
