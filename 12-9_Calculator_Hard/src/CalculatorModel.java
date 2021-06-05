public class CalculatorModel {

    private double number1;
    private double number2;

    public CalculatorModel(){
        this.number1 = 0;
        this.number2 = 0;
    }

    public double calculate(String operator) {
        switch (operator) {
            case "+":
                number1 = number1 + number2;
                return number1;
            case "-":
                number1 = number1 - number2;
                return number1;
            case "*":
                number1 = number1 * number2;
                return number1;
            case "/":
                if (number2 == 0) {
                    return 0;
                }
                else{
                    number1 = number1 / number2;
                    return number1;
                }
        }
        return number1;
    }


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
