package home.dbarannik.ConsoleReader;

import java.util.Scanner;

/**
Все хорошо, единственное Scanner можно создать еще в 
main и просто передать в конструктор во все классы где он используется.
**/
public class ConsoleReader {
    public int getValidInputInt(int lowerLimit, int upperLimit) {
        int inputInt;
        Scanner console = new Scanner(System.in);

        while (true) {
            if (console.hasNextInt()) {
                inputInt = console.nextInt();
                if (inputInt >= lowerLimit && inputInt <= upperLimit) {
                    return inputInt;
                } else {
                    System.out.println("Invalid input! Try again...");
                }
            } else {
                System.out.println("Invalid input! Try again...");
                console.next();
            }
        }
    }

    public float getValidInputFloat(float lowerLimit, float upperLimit) {
        float inputFloat;
        Scanner console = new Scanner(System.in);

        while (true) {
            if (console.hasNextFloat()) {
                inputFloat = console.nextFloat();
                if (inputFloat >= lowerLimit && inputFloat <= upperLimit) {
                    return inputFloat;
                } else {
                    System.out.println("Invalid input! Try again...");
                }
            } else {
                System.out.println("Invalid input! Try again...");
                console.next();
            }
        }
    }
}
