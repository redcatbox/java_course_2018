package home.dbarannik.labs.Lab_3_01_PasswordGenerator;

import java.util.Random;

public class PasswordGenerator {
    private final Random random;
    // Length constants
    public static final int PASS_LENGTH_MIN = 8;
    public static final int PASS_LENGTH_MAX = 20;
    public static final int NUM_OF_DIGITS_MIN = 1;
    public static final int NUM_OF_DIGITS_MAX = 3;
    public static final int AVAILABLE_SETS_NUM = 3;

    // Characters sets constants
    public static final String CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    public static final String NUMBERS = "0123456789";
    public static final String SPECIAL_CHARACTERS = "!@#$%^&*";
    public static final int CHARACTERS_ID = 0;
    public static final int NUMBERS_ID = 1;
    public static final int SPECIAL_CHARACTERS_ID = 2;

    // Construct
    public PasswordGenerator() {
        random = new Random();
    }

    public String generate(int passLength) {
        boolean isSpecialCharacterUsed = false;
        int numOfDigits = 0;
        int numOfDigitsUsed = 0;
        int charSetToUse = 0;
        char charPrevious = ' ';
        char charCurrent = ' ';
        StringBuilder strBld = new StringBuilder();

        if (passLength < PASS_LENGTH_MIN || passLength > PASS_LENGTH_MAX) {
            return null;
        }

        numOfDigits = random.nextInt((NUM_OF_DIGITS_MAX - NUM_OF_DIGITS_MIN) + 1) + NUM_OF_DIGITS_MIN;

        while (strBld.length() < passLength) {
            charSetToUse = random.nextInt(AVAILABLE_SETS_NUM);

            switch (charSetToUse) {
                case CHARACTERS_ID:
                    charCurrent = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
                    if (charCurrent == charPrevious) {
                        break;
                    } else {
                        charPrevious = charCurrent;
                        strBld = strBld.append(charCurrent);
                        break;
                    }
                case NUMBERS_ID:
                    if (numOfDigitsUsed < numOfDigits) {
                        charCurrent = NUMBERS.charAt(random.nextInt(NUMBERS.length()));

                        if (charCurrent == charPrevious) {
                            break;
                        } else {
                            numOfDigitsUsed++;
                            charPrevious = charCurrent;
                            strBld = strBld.append(charCurrent);
                            break;
                        }
                    } else {
                        break;
                    }
                case SPECIAL_CHARACTERS_ID:
                    if (isSpecialCharacterUsed) {
                        break;
                    } else {
                        charCurrent = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));
                        isSpecialCharacterUsed = true;
                        strBld = strBld.append(charCurrent);
                        break;
                    }
            }
        }
        return strBld.toString();
    }
}
