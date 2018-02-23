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
        } else if ("^".equals(operator)) {
            return new Power();
        } else if ("log".equals(operator)) {
            return new Logarithm();
        } else if ("root".equals(operator)) {
            return new Root();
        }
        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double left = 5;
        double right = 20;

        System.out.println( left + " + " + right + " = " + calculator.calculate(left, right, "+") );
        System.out.println( left + " - " + right + " = " + calculator.calculate(left, right, "-") );
        System.out.println( left + " * " + right + " = " + calculator.calculate(left, right, "*") );
        System.out.println( left + " / " + right + " = " + calculator.calculate(left, right, "/") );
        System.out.println( left + " ^ " + right + " = " + calculator.calculate(left, right, "^") );
        System.out.println( left + " log " + right + " = " + calculator.calculate(left, right, "log") );
        System.out.println( left + " root " + right + " = " + calculator.calculate(left, right, "root") );
    }
}
