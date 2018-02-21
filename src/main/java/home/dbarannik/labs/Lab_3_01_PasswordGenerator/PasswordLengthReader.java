package home.dbarannik.labs.Lab_3_01_PasswordGenerator;

import java.util.Scanner;

public class PasswordLengthReader {
    public PasswordLengthReader(PasswordGenerator passGen) {
    }

    public int getValidPassLength() {
        int result;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter password length between 8 and 20");

        while (true) {
            if (console.hasNextInt()) {
                result = console.nextInt();
                if (result >= PasswordGenerator.PASS_LENGTH_MIN && result <= PasswordGenerator.PASS_LENGTH_MAX) {
                    break;
                } else {
                    System.out.println("Invalid input! Try again...");
                }
            } else {
                System.out.println("Invalid input! Try again...");
                console.next();
            }
        }
        return result;
    }
}
