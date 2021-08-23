package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;


public class Controller {

    public Controller() {
    }
    @FXML
    private Slider slider;
    @FXML
    private Label label;

    @FXML
    private void actionTest(){
        Main m = new Main();
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                label.textProperty().setValue(String.valueOf(newValue));
            }
        });

}
