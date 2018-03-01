package home.dbarannik.homeworks.HomeWork_4_Calculator;

import home.dbarannik.Exceptions.UnsupportedMathOperation;

public interface BinaryOperation {
    /**
     * Расчитывает результат для двух операндов
     * @param left левый операнд
     * @param right правый операнд
     * @return результат операции
     */
    double resultFor(double left, double right) throws UnsupportedMathOperation;
}
