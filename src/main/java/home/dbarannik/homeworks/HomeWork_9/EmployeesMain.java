package home.dbarannik.homeworks.HomeWork_9;

import java.util.Date;
import java.util.Random;

public class EmployeesMain {
    public static void main(String[] args) {
        generate();
    }

    static void generate() {
        int employeesNumber = 100;
        Random random = new Random();

        final String[] surnames = {"Zayac", "Volk", "Barsuk", "Orel", "Belka", "Mysh", "Homyak", "Zmey", "Ryba", "Voron", "Soroka", "Koshka", "Gus", "Sinica", "Medved", "Suslik"};
        final String[] namesM = {"Nikolay", "Andrey", "Viktor", "Evgeniy", "Maksim", "Yuriy", "Dmitriy", "Igor", "Aleksandr", "Aleksey", "Lev", "Vladislav", "Vladimir", "Oleg", "Mikhail"};
        final String[] namesF = {"Elizabeth", "Anna", "Maria", "Julia", "Svetlana", "Elena", "Tamara", "Yana", "Nina", "Natali", "Daria", "Viktoria", "Ekaterina", "Veronika", "Anastasia", "", "", "", "", "", "", "",};
        final String middleNameM = "Batkovich";
        final String middleNameF = "Batkovna";

        for (int i = 0; i < employeesNumber; i++) {
            // sex
            Sex rndSex = Sex.FEMALE;
            switch (random.nextInt(2)) {
                case 0:
                    rndSex = Sex.MALE;
                    break;
                case 1:
                    rndSex = Sex.FEMALE;
                    break;
            }

            //lastName
            String rndLastName = surnames[random.nextInt(surnames.length)];

            //firstName
            String rndFirstName;
            if (rndSex == Sex.MALE) {
                rndFirstName = namesM[random.nextInt(namesM.length)];
            } else {
                rndFirstName = namesF[random.nextInt(namesF.length)];
            }

            // middleName
            String rndMiddleName;
            if (rndSex == Sex.MALE) {
                rndMiddleName = middleNameM;
            } else {
                rndMiddleName = middleNameF;
            }

            // birthDate
            Date rndBirthDate;
            // INN
            int rndINN = (int) (Math.random() * 2000000000);

            // startDate
            Date rndStartDate;

            // endDate
            Date rndEndDate;

            // Salary
            int rndSalary = (int) (Math.random() * 20000) + 5000;

            System.out.println(rndLastName + "," + rndFirstName + "," + rndMiddleName + "," + rndINN + "," + rndSex + "," + rndSalary);
        }
    }


}

