public class Calculator {
    // Fields
    private double result;

    // Constructor
    public Calculator() {
        result = 0;
    }

    // Methods
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("Error: Division by zero");
        }
        return result;
    }

    public double getResult() {
        return result;
    }
}
