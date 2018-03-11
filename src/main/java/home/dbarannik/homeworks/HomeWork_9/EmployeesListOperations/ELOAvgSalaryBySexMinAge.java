package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;
import home.dbarannik.homeworks.HomeWork_9.Sex;

import java.util.List;

public class ELOAvgSalaryBySexMinAge implements EmployeesListOperation {
    private Sex sex;
    private int minAge;

    public ELOAvgSalaryBySexMinAge(Sex sex, int minAge) {
        this.sex = sex;
        this.minAge = minAge;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        double avg = list
                .stream()
                .filter(e -> e.getSex() == sex)
                .filter(e -> e.getAge() >= minAge)
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.printf("Average salary for %s with min age %d = %.2f%n", sex, minAge, avg);
        System.out.println();
    }
}
