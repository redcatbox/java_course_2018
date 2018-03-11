package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.util.Comparator;
import java.util.List;

public class ELONameMaxSalary implements EmployeesListOperation {
    private String name;

    public ELONameMaxSalary(String name) {
        this.name = name;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        Employee max = list
                .stream()
                .filter(e -> e.getFirstName().equals(name))
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.printf("Max %s salary = %.2f%n", name, max.getSalary());
        System.out.println();
    }
}
