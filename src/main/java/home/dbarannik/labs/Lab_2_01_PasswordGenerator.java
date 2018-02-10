package home.dbarannik.labs;

import java.util.Random;
import java.util.Scanner;

public class Lab_2_01_PasswordGenerator {
    // Length constants
    static final int PASS_LENGTH_MIN = 8;
    static final int PASS_LENGTH_MAX = 20;
    static final int NUM_OF_DIGITS_MIN = 1;
    static final int NUM_OF_DIGITS_MAX = 3;
    //static final int NUM_OF_SPEC_CHARS = 1;

    // Characters sets constants
    static final String CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    static final String NUMBERS = "0123456789";
    static final String SPECIAL_CHARACTERS = "!@#$%^&*";
    static final int AVAILABLE_SETS_NUM = 3;

    public static void main(String[] args) {
        int passLength;

        System.out.printf("Enter password length between %d and %d:%n", PASS_LENGTH_MIN, PASS_LENGTH_MAX);
        passLength = getValidPassLength();
        System.out.println("Your password is: " + generatePass(passLength));
    }

    public static int getValidPassLength() {
        int result;
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

    public static String generatePass(int passLength) {
        String result = "";
        boolean isSpecialCharacterUsed = false;
        int numOfDigits = 0;
        int numOfDigitsUsed = 0;
        int charSetToUse = 0;
        char charPrevious = ' ';
        char charCurrent = ' ';

        Random rnd = new Random();
        numOfDigits = rnd.nextInt((NUM_OF_DIGITS_MAX - NUM_OF_DIGITS_MIN) + 1) + NUM_OF_DIGITS_MIN;
        //System.out.println("numOfDigits " + numOfDigits);

        while (result.length() < passLength) {
            charSetToUse = rnd.nextInt(AVAILABLE_SETS_NUM);

            switch (charSetToUse) {
                case 0:
                    // CHARACTERS
                    charCurrent = CHARACTERS.charAt(rnd.nextInt(CHARACTERS.length()));
                    if (charCurrent == charPrevious) {
                        break;
                    } else {
                        charPrevious = charCurrent;
                        result = result + charCurrent;
                        break;
                    }
                case 1:
                    // NUMBERS
                    if (numOfDigitsUsed < numOfDigits) {
                        charCurrent = NUMBERS.charAt(rnd.nextInt(NUMBERS.length()));

                        if (charCurrent == charPrevious) {
                            break;
                        } else {
                            numOfDigitsUsed++;
                            charPrevious = charCurrent;
                            result = result + charCurrent;
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    // SPECIAL_CHARACTERS
                    if (isSpecialCharacterUsed) {
                        break;
                    } else {
                        charCurrent = SPECIAL_CHARACTERS.charAt(rnd.nextInt(SPECIAL_CHARACTERS.length()));
                        isSpecialCharacterUsed = true;
                        result = result + charCurrent;
                        break;
                    }
            }
        }
        return result;
    }
}
