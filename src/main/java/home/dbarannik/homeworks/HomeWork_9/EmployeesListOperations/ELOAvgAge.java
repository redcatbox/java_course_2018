package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.util.List;

public class ELOAvgAge implements EmployeesListOperation {

    @Override
    public void makeOperation(List<Employee> list) {
        double avg = list
                .stream()
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();

        System.out.printf("Average age of employees = %.0f%n", avg);
        System.out.println();
    }
}
