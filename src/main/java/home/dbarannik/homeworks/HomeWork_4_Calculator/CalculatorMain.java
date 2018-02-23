package home.dbarannik.homeworks.HomeWork_4_Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Supported expression must be:");
        System.out.println("number operator number");

        while (true) {
            // Show information
            System.out.println();
            System.out.println("Enter your expression:");

            calculator.getValidExpression();
            System.out.println( calculator.left + " " + calculator.operator + " " + calculator.right + " = " + calculator.result);
        }
    }
}
