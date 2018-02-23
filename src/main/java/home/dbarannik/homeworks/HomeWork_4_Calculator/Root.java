package home.dbarannik.homeworks.HomeWork_4_Calculator;

public class Root implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0/right);
    }
}
