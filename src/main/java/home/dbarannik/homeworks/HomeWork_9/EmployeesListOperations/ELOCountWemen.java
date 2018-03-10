package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.util.List;

public class ELOCountWemen implements EmployeesListOperation {

    @Override
    public void makeOperation(List<Employee> list) {
        list
            .stream()
            .sorted();

        System.out.println();
    }
}
