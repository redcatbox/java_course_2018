package home.dbarannik.homeworks.HomeWork_4_Calculator;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    final static Pattern VALID_EXPRESSION = Pattern.compile("^[0-9]+\\.?[0-9]*\\s[a-z\\+\\-\\*\\/\\^]+\\s[0-9]+\\.?[0-9]*$");
    double left;
    double right;
    double result;
    String operator;
    private String expression;
    private ConsoleReader reader = new ConsoleReader();

    public void getValidExpression() {
        while (true) {
            expression = "";
            expression = reader.getInputString();
            Matcher mat = VALID_EXPRESSION.matcher(expression);
            if (mat.matches()) {
                parseExpression();
                result = calculate(left, right, operator);
                break;
            } else {
                System.out.println("\033[31;1mInvalid expression! Try again...\033[0m");
            }
        }
    }

    public void parseExpression() {
        String[] arguments = expression.split(" ");
        left = Double.parseDouble(arguments[0]);
        operator = arguments[1];
        right = Double.parseDouble(arguments[2]);
    }

    public double calculate(double left, double right, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Unknown operator " + operator);
            return Double.NaN;
        }
        return operation.resultFor(left, right);
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
}
