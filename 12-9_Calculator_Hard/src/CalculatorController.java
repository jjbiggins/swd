import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class CalculatorController {

    private CalculatorModel model = new CalculatorModel();
    private double result;

    @FXML
    private Text output;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void numberPadAction(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        System.out.println(value);
        output.setText(output.getText() + value);
    }

    @FXML
    private void clear(ActionEvent event){
        output.setText("");
    }


    @FXML
    private void operatorAction(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;

            operator = value;
            model.setNumber1(Long.parseLong(output.getText()));
            output.setText("");
        }
        else {
            if (operator.isEmpty())
                return;

            model.setNumber2(Long.parseLong(output.getText()));
            result = model.calculate(operator);
            output.setText(String.valueOf(result));
            operator = "";
            start = true;
        }
    }

}
