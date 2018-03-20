package home.dbarannik.homeworks.HomeWork_9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private long INN;
    private Sex sex;
    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;

    public Employee(
            String lastName,
            String firstName,
            String middleName,
            LocalDate birthDate,
            long INN,
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

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getINN() {
        return INN;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        String s;
        s = "\t" + getFullName();
        return s;
    }
}
