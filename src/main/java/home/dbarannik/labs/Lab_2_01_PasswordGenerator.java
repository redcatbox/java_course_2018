package home.dbarannik.labs;

import java.util.Scanner;

public class Lab_2_01_PasswordGenerator {
    static final int PASS_LENGTH_MIN = 8;
    static final int PASS_LENGTH_MAX = 20;
    static final String NUMBERS = "0123456789";
    static final String Characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    static final String SpecialCharacters = "!@#$%^&*";

    public static void main(String[] args) {
        int passLength = getValidPassLength();
        generatePassword(passLength);
    }

    public static int getValidPassLength() {
        System.out.println("Enter password length:");
        Scanner console = new Scanner(System.in);
        while(true) {

        }
        return console.nextInt();
    }

    public static String generatePassword(int length) {
        String result;
        while(true) {
            break;
        }
        for(int i = 0; i < length; i++)

        return result;
    }
}
