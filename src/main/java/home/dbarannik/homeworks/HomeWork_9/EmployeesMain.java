package home.dbarannik.homeworks.HomeWork_9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EmployeesMain {
    public static void main(String[] args) {
        generateEmployeesFile(100);

    }

    static void generateEmployeesFile(int num) {
        final String[] surnames = {"Zayac", "Volk", "Barsuk", "Orel", "Belka", "Mysh", "Homyak", "Zmey", "Ryba", "Voron", "Soroka", "Koshka", "Gus", "Sinica", "Medved", "Suslik"};
        final String[] namesM = {"Nikolay", "Andrey", "Viktor", "Evgeniy", "Maksim", "Yuriy", "Dmitriy", "Igor", "Aleksandr", "Aleksey", "Lev", "Vladislav", "Vladimir", "Oleg", "Mikhail"};
        final String[] namesF = {"Elizabeth", "Anna", "Maria", "Julia", "Svetlana", "Elena", "Tamara", "Yana", "Nina", "Natali", "Daria", "Viktoria", "Ekaterina", "Veronika", "Anastasia"};
        final String middleNameM = "Batkovich";
        final String middleNameF = "Batkovna";

        // Create file
        Path filePath = Paths.get("").toAbsolutePath();
        filePath = filePath.resolve("EmployeesFile");
        if (filePath.toFile().exists()) {
            filePath.toFile().delete();
        }

        try {
            Files.createFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Generate random employees
        for (int i = 0; i < num; i++) {
            Random random = new Random();

            // sex
            Sex rndSex = null;
            switch (random.nextInt(2)) {
                case 0:
                    rndSex = Sex.MALE;
                    break;
                case 1:
                    rndSex = Sex.FEMALE;
                    break;
            }

            //lastName, firstName, middleName
            String rndLastName = surnames[random.nextInt(surnames.length)];
            String rndFirstName;
            String rndMiddleName;
            if (rndSex == Sex.MALE) {
                rndFirstName = namesM[random.nextInt(namesM.length)];
                rndMiddleName = middleNameM;
            } else {
                rndFirstName = namesF[random.nextInt(namesF.length)];
                rndMiddleName = middleNameF;
            }

            // birthDate, startDate, endDate
//            GregorianCalendar gc = new GregorianCalendar();
//            int year = random.nextInt(50) + 1940;
//            gc.set(gc.YEAR, year);
//            int day = random.nextInt(gc.getActualMaximum(gc.DAY_OF_YEAR) + 1);
//            gc.set(gc.DAY_OF_YEAR, day);


            long  = -631152000000L + (Math.abs(random.nextLong()) % (40L * 31536000000L)); // 1950 - 1990
            LocalDate rndBirthDate = new LocalDate(rndBirthDateMs);
            LocalDateTime rndBirthDate = LocalDateTime.now();
            Date  = new Date(rndBirthDateMs);

            long rndStartDateMs = 946684800000L + (Math.abs(random.nextLong()) % (17L * 31536000000L)); // 2000 - 2017
            Date rndStartDate = new Date(rndStartDateMs);

            long rndEndDateMs = rndStartDateMs +;

            Date rndEndDate = new Date(rndEndDateMs);
            if (rndEndDate.after(LocalDateTime.now()))

            // INN
            int rndINN = random.nextInt(2000000000 - 1000000000) + 1000000000;

            // Salary
            int rndSalary = random.nextInt(25000 - 5000) + 5000;

            // Write to file
            String str = rndLastName + "," + rndFirstName + "," + rndMiddleName + "," + rndBirthDate + "," + rndINN + "," + rndSex + "," + rndStartDate + "," + rndEndDate + "," + rndSalary + "\n";
            try {
                Files.write(filePath, str.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

