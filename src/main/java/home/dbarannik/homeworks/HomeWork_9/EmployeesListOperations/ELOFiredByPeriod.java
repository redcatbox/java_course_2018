package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class ELOFiredByPeriod implements EmployeesListOperation {
    private LocalDate start;
    private LocalDate end;

    public ELOFiredByPeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        long count = list
                .stream()
                .filter(e -> e.getEndDate() != null)
                .filter(e -> e.getEndDate().isAfter(start) && e.getEndDate().isBefore(end))
                .count();

        System.out.printf("Number of fired from %s to %s = %d%n", start, end, count);
        System.out.println();
    }
}
