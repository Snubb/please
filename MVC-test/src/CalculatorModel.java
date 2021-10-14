public class CalculatorModel {
    private double result;

    public CalculatorModel() {

    }

    public void addNumbers(double num1, double num2) {
        result = num1 + num2;
    }

    public double getResult() {
        return result;
    }
}
