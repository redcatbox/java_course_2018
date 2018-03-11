package home.dbarannik.homeworks.HomeWork_9;

import home.dbarannik.homeworks.HomeWork_9.EmployeesListOperations.*;

import java.util.List;

public class EmployeesMain {
    public static void main(String[] args) {
        // Generate file
        EmployeesFileGenerator efg = new EmployeesFileGenerator();
        efg.generateEmployeesFile(1000);

        // Read file
        EmployeesFileReader efr = new EmployeesFileReader(efg.getFilePath(), efg.separator);
        List<Employee> employeesList = efr.readEmployeesFile();

        // Filter employees list
        EmployeesListOperation operation;
        // 1
        operation = new ELOCountBySex(Sex.FEMALE);
        operation.makeOperation(employeesList);
        // 2
        operation = new ELOCountBySexSalary(Sex.MALE, 10000);
        operation.makeOperation(employeesList);
        // 3
        operation = new ELONameMaxSalary("Nikolay");
        operation.makeOperation(employeesList);
        // 4
        operation = new ELONameMinSalary("Svetlana");
        operation.makeOperation(employeesList);
//        // 5
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 6
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 7
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 8
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 9
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 10
//        operation = new ELO();
//        operation.makeOperation(employeesList);
//        // 11
//        operation = new ELO();
//        operation.makeOperation(employeesList);
    }
}

/*
Спроектировать класс Сотрудник (Employee) с обязательными полями:
a. Фамилия
b. Имя
c. Отчество
d. Дата рождения
e. ИНН
f. Пол (перечисление MALE, FEMALE)
g. Дата принятия
h. Дата увольнения (содержит null если сотрудник еще работает)
i. Сумма оклада
Создать файл, в котором будет данная информация о каждом из сотрудников в новой
строке. Поля разделены точкой с запятой (;).
Реализовать программу, которая загрузить все эти данные в коллекцию List<Employee> и
с помощью Java Stream API выведет следующее:
1. Количество женщин
2. Количество мужчин с зарплатой больше 10 000
3. Максимальную зарплату у сотрудников с именем Николай
4. Минимальную зарплату у сотрудниц с именем Светлана
5. ФИО всех сотрудников со стажем работы более 10 лет в данной компании
6. Число уволенных за прошлый год
7. Проиндексирует сотрудников по ИНН (то есть вернет Map<Long, Employee>)
8. Средний возраст сотрудников
9. Среднюю зарплату мужчин
10. Среднюю зарплату женщин старше 40-ка лет.
11. Сгруппировать по месяцам рождения всех женщин в возрасте от 30 до 40 лет.
*/