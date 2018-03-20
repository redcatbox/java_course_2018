package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;
import home.dbarannik.homeworks.HomeWork_9.Sex;

import java.util.List;

public class ELOAvgSalaryBySex implements EmployeesListOperation {
    private Sex sex;

    public ELOAvgSalaryBySex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        double avg = list
                .stream()
                .filter(e -> e.getSex() == sex)
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.printf("Average %s salary = %.2f%n", sex, avg);
        System.out.println();
    }
}
