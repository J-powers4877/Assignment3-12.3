package Chapter12_3;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField tfTotal;

    @FXML
    private TextField tfAmount;

    @FXML
    private TextField tfTipPerPerson;

    @FXML
    private Label lTipPercent;

    @FXML
    private TextField tfNumberOfPeople;

    @FXML
    private Slider slideTip;

    @FXML
    void calculateTip(ActionEvent event)
    {

    }

}
