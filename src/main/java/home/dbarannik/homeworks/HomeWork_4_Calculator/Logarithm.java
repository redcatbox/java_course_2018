package home.dbarannik.homeworks.HomeWork_4_Calculator;

public class Logarithm implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.log(left)/Math.log(right);
    }
}
