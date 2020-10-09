package excluded;

import com.course.Main;
import com.course.paths.IPaths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TestController implements IPaths{

    @FXML
    private void clickAction(ActionEvent actionEvent) throws IOException {
        Main.setScene(EDIT_WINDOW);
        System.out.println("Action pressed");
    }
}
