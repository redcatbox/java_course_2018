package home.dbarannik.homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3_02 {
    public static void main(String[] args) {
        String userString = getValidInputString();
        calculateCharacters(userString);
    }

    public static String getValidInputString() {
        String result = "";
        System.out.println("Enter string that contains only latin alphabet symbols:");
        Scanner console = new Scanner(System.in);
        Pattern pat = Pattern.compile("[*a-zA-Z]+");

        while (true) {
            result = console.nextLine();
            Matcher m = pat.matcher(result);
            if (m.matches()) {
                break;
            } else {
                System.out.println("Invalid string, try again...");
            }
        }
        return result;
    }

    public static void calculateCharacters(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        char charCurrent;

        while (inputString.length() > 0) {
            charCurrent = inputString.charAt(0);
        }


    }
}
