package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class DateController {
    @FXML
    private DatePicker dater;
    @FXML
    private Label label;

    @FXML
    private void actionTest(){
        LocalDate date = dater.getValue();
        label.textProperty().setValue(String.valueOf(date));
    }

}
