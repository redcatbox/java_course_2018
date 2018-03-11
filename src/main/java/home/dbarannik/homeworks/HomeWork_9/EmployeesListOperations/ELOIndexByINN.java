package home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations;

import home.dbarannik.homeworks.HomeWork_9.Employee;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ELOIndexByINN implements EmployeesListOperation {

    public Map getIndexedMap(List<Employee> list) {
        Map<Long, Employee> indexedMap = list.stream().collect(Collectors.toMap(Employee::getINN, e -> e));
        return indexedMap;
    }

    @Override
    public void makeOperation(List<Employee> list) {
        System.out.println("Employees indexed by INN:");
        System.out.println(getIndexedMap(list).toString());
        System.out.println();
    }
}
