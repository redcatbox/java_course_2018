package home.dbarannik.homeworks.HomeWork_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Random;

public class EmployeesFileGenerator {
    private Path filePath;

    public Path getFilePath() {
        return filePath;
    }

    final String[] surnames = {"Zayac", "Volk", "Barsuk", "Orel", "Belka", "Mysh", "Homyak", "Zmey", "Ryba", "Voron", "Soroka", "Koshka", "Gus", "Sinica", "Medved", "Suslik"};
    final String[] namesM = {"Nikolay", "Andrey", "Viktor", "Evgeniy", "Maksim", "Yuriy", "Dmitriy", "Igor", "Aleksandr", "Aleksey", "Lev", "Vladislav", "Vladimir", "Oleg", "Mikhail"};
    final String[] namesF = {"Elizabeth", "Anna", "Maria", "Julia", "Svetlana", "Elena", "Tamara", "Yana", "Nina", "Natali", "Daria", "Viktoria", "Ekaterina", "Veronika", "Anastasia"};
    final String middleNameM = "Batkovich";
    final String middleNameF = "Batkovna";
    final String separator = ";";

    public void generateEmployeesFile(int num) {
        // Create file
        filePath = Paths.get("").toAbsolutePath();
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

            //names
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

            // dates
            LocalDate rndBirthDate = LocalDate.parse("01.01.1950", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN)); // 1950-1990
            rndBirthDate = rndBirthDate.plusDays(random.nextInt(40 * 365));

            LocalDate rndStartDate = LocalDate.parse("01.01.2000", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN)); // 2000-2015
            rndStartDate = rndStartDate.plusDays(random.nextInt(15 * 365));

            LocalDate rndEndDate = rndStartDate.plusDays(random.nextInt(30 * 365));
            if (rndEndDate.isAfter(LocalDate.now())) {
                rndEndDate = null;
            }

            // INN
            int rndINN = random.nextInt(2000000000 - 1000000000) + 1000000000;

            // Salary
            int rndSalary = (random.nextInt(30000) + 5000);

            // to file
            String str = rndLastName + separator +
                    rndFirstName + separator +
                    rndMiddleName + separator +
                    rndBirthDate + separator +
                    rndINN + separator +
                    rndSex + separator +
                    rndStartDate + separator +
                    rndEndDate + separator +
                    rndSalary;

            if (i != num - 1) {
                str = str + "\n";
            }

            try {
                Files.write(filePath, str.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}