package home.dbarannik.homeworks.HomeWork_9;

import java.time.LocalDate;

public class Employee{
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private int INN;
    private Sex sex;
    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public Sex getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public Employee(
            String lastName,
            String firstName,
            String middleName,
            LocalDate birthDate,
            int INN,
            Sex sex,
            LocalDate startDate,
            LocalDate endDate,
            double salary
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.INN = INN;
        this.sex = sex;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }
}
