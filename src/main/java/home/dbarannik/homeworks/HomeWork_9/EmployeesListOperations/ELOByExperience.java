package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.time.LocalDate;
import java.util.List;

public class ELOByExperience implements EmployeesListOperation {
    private int years;

    public ELOByExperience(int years) {
        this.years = years;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        System.out.printf("Employees who working > %d years:%n", years);

        list.stream()
            .filter(e -> e.getEndDate() == null)
            .filter(e -> LocalDate.now().isAfter(e.getStartDate().plusYears(years)))
            .forEach(System.out::println);

        System.out.println();
    }
}
