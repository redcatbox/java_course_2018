package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.util.Comparator;
import java.util.List;

public class ELONameMinSalary implements EmployeesListOperation {
    private String name;

    public ELONameMinSalary(String name) {
        this.name = name;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        Employee min = list
                .stream()
                .filter(e -> e.getFirstName().equals(name))
                .min(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.printf("Min %s salary = %f%n", name, min.getSalary());
    }
}
