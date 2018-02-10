package home.dbarannik.labs;

import java.util.Random;
import java.util.Scanner;

public class Lab_2_01_PasswordGenerator {
    static final int PASS_LENGTH_MIN = 8;
    static final int PASS_LENGTH_MAX = 20;
    static final String NUMBERS = "0123456789";
    static final String CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    static final String SPECIAL_CHARACTERS = "!@#$%^&*";

    public static void main(String[] args) {
        int passLength = getValidPassLength();
        System.out.println("Your password is: " + generatePass(passLength));
    }

    public static int getValidPassLength() {
        int result;

        System.out.printf("Enter password length between %d and %d:%n", PASS_LENGTH_MIN, PASS_LENGTH_MAX);

        Scanner console = new Scanner(System.in);
        while (true) {
            if (console.hasNextInt()) {
                result = console.nextInt();
                if (result >= PASS_LENGTH_MIN && result <= PASS_LENGTH_MAX) {
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

    public static String generatePass(int length) {
        String result = "";
        boolean isHaveSpecialCharacter = false;
        int numOfDigits = 0;

        Random rnd = new Random();
        numOfDigits = rnd.nextInt(3);

        while (true) {
            if (result.length() < length) {








            } else {
                break;
            }

        }
        return result;
    }
}
