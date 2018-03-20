package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;
import home.dbarannik.homeworks.HomeWork_9.Sex;

import java.util.List;

public class ELOCountBySex implements EmployeesListOperation {
    private Sex sex;

    public ELOCountBySex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        long count = list
                .stream()
                .filter(e->e.getSex() == sex)
                .count();

        System.out.printf("%s count = %d%n", sex, count);
        System.out.println();
    }
}
