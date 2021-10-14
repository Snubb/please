import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {


    private JTextField num1;
    private JTextField num2;
    private JTextField result;
    private JButton calculate;
    private JPanel calculatorPanel;


    public CalculatorView() {

    }

    public JPanel getPanel() {
        return calculatorPanel;
    }

    public JButton getCalculateButton() {
        return calculate;
    }

    public double getFirstNumber() {
        return Double.parseDouble(num1.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(num2.getText());
    }

    public void setResult(double result) {
        this.result.setText("" + result);
    }
}
