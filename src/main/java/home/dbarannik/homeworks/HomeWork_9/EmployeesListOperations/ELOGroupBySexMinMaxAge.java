package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;
import home.dbarannik.homeworks.HomeWork_9.Sex;

import java.util.Comparator;
import java.util.List;

public class ELOGroupBySexMinMaxAge implements EmployeesListOperation {
    private Sex sex;
    private int minAge;
    private int maxAge;

    public ELOGroupBySexMinMaxAge(Sex sex, int minAge, int maxAge) {
        this.sex = sex;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        System.out.printf("%s between %d and %d years is:%n", sex, minAge, maxAge);

        list.stream()
            .filter(e -> e.getSex() == sex)
            .filter(e -> e.getAge() >= minAge && e.getAge() < maxAge)
            .sorted((e1, e2) -> e1.getBirthDate().getMonth().compareTo(e2.getBirthDate().getMonth()))
            .forEach(e -> System.out.printf("\t" + e.getBirthDate().getMonth() + "\t\t" + e.getFullName() + "%n"));

        System.out.println();
    }
}
