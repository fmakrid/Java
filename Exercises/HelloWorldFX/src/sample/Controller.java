package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;


public class Controller {

    public Controller() {
    }
    @FXML
    private DatePicker dater;
    @FXML
    private Slider slider;
    @FXML
    private Label label;
    public int currentSliderValue;
    @FXML
    public void actionTest() {
        Main m = new Main();
        slider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            double firstFilter = (double) newValue;
            currentSliderValue = (int) firstFilter;
            label.textProperty().setValue(Date(currentSliderValue));
        });
    }
    public String Date(int currentSliderValue){
        if((currentSliderValue >= 1) && (currentSliderValue <= 31)){
            return (currentSliderValue + " - January - 2020");
        }
        else if((currentSliderValue >= 32) && (currentSliderValue <= 60)){
            return ((currentSliderValue - 31)+ " - February - 2020");
        }
        else if((currentSliderValue >= 61) && (currentSliderValue <= 91)){
            return ((currentSliderValue -  60) + " - March - 2020");
        }
        else if((currentSliderValue >= 92) && (currentSliderValue <= 121)){
            return ((currentSliderValue - 91) + " - April - 2020");
        }
        else if((currentSliderValue >= 122) && (currentSliderValue <= 152)){
            return ((currentSliderValue - 121) + " - May - 2020");
        }
        else if((currentSliderValue >= 153) && (currentSliderValue <= 182)){
            return ((currentSliderValue - 152) + " - June - 2020");
        }
        else if((currentSliderValue >= 183) && (currentSliderValue <= 213)){
            return ((currentSliderValue - 182) + " - July - 2020");
        }
        else if((currentSliderValue >= 214) && (currentSliderValue <= 244)){
            return ((currentSliderValue - 213) + " - August - 2020");
        }
        else if((currentSliderValue >= 245) && (currentSliderValue <= 274)){
            return ((currentSliderValue - 244) + " - September - 2020");
        }
        else if((currentSliderValue >= 275) && (currentSliderValue <= 305)){
            return ((currentSliderValue - 274) + " - October - 2020");
        }
        else if((currentSliderValue >= 306) && (currentSliderValue <= 335)){
            return ((currentSliderValue - 305) + " - November - 2020");
        }
        else if((currentSliderValue >= 336) && (currentSliderValue <= 366)){
            return ((currentSliderValue - 335) + " - December - 2020");
        }
        else{
            return "FALSE VALUE";
        }
    }
}
