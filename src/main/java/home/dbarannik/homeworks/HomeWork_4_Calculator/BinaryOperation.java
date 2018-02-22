package home.dbarannik.homeworks.HomeWork_4_Calculator;

public interface BinaryOperation {
    /**
     * Расчитывает результат для двух операндов
     * @param left левый операнд
     * @param right правый операнд
     * @return результат операции
     */
    double resultFor(double left, double right);
}
