package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;
import home.dbarannik.homeworks.HomeWork_9.Sex;

import java.util.List;

public class ELOCountBySexSalary implements EmployeesListOperation {
    private Sex sex;
    private double salary;

    public ELOCountBySexSalary(Sex sex, double salary) {
        this.sex = sex;
        this.salary = salary;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        long count = list
                .stream()
                .filter(e->e.getSex() == sex)
                .filter(e->e.getSalary() > salary)
                .count();

        System.out.printf("%s count with salary > %f = %d%n", sex, salary, count);
    }
}
