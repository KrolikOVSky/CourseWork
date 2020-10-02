package test;

import com.course.paths.IPaths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TestController implements IPaths{

    @FXML
    private void clickAction(ActionEvent actionEvent) throws IOException {
        AppTest.setScene(MAIN_WINDOW);
        System.out.println("Action pressed");
    }
}
