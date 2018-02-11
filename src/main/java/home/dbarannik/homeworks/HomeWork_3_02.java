package home.dbarannik.homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3_02 {
    public static void main(String[] args) {
        String userString = getValidInputString(); //Mama papA totos kiwi
        calculateCharacters(userString);
    }

    public static String getValidInputString() {
        String result = "";
        System.out.println("Enter string that contains only latin alphabet symbols:");
        Scanner console = new Scanner(System.in);
        Pattern pat = Pattern.compile("[a-zA-Z\\s']+");

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
        int charCounter = 0;
        String result;
        char[] chars = inputString.toCharArray();

        // Get and sort user string
        Arrays.sort(chars);
        result = new String(chars);
        //result = result.trim(); // Remove spaces
        System.out.println("String = " + inputString);
        System.out.println("Sorted = " + result);

        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                charCounter++;
            } else {
                if (chars[i] == chars[i - 1]) {
                    charCounter++;
                } else {
                    System.out.printf("Character '%s' appears %d times.%n", chars[i - 1], charCounter);
                    charCounter = 0;
                }
            }
        }
    }
}
