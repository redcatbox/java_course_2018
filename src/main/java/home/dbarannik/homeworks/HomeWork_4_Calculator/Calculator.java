package home.dbarannik.homeworks.HomeWork_4_Calculator;

public class Calculator {
    public double calculate(double value1, double value2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Unknown operator " + operator);
            return Double.NaN;
        }

        return operation.resultFor(value1, value2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        }
        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println( calculator.calculate(100, 200, "+") );
        System.out.println( calculator.calculate(100, 200, "-") );
        System.out.println( calculator.calculate(100, 200, "*") );
        System.out.println( calculator.calculate(100, 200, "/") );
    }
}
