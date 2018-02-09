package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_3_01 {
    public static void main(String[] args) {
        String userString;

        // Get user string
        System.out.println("Enter your string:"); //All those moments will be lost in time, like tears in rain.
        userString = getInputString();

        // Show menu
        showChoiceMenu();

        // Get and process user choice
        while(true)
        {
            getAndValidateUserChoice(userString);
        }
    }

    public static String getInputString() {
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static void showChoiceMenu() {
        // Show choice menu
        System.out.println("Lets convert your string into something amazing!");
        System.out.println("Please, make your choice:");
        System.out.println("A. EXAMPLE OF YOUR STRING");
        System.out.println("B. example of your string");
        System.out.println("C. Example Of Your String");
        System.out.println("D. eXAMPLE oF yOUR sTRING");
        System.out.println("E. Example of your string");
        System.out.println("F. Exit application");
    }

    public static void getAndValidateUserChoice(String userString) {
        String choiceString;
        char inputChar;
        final String errorMessage = "Error! Invalid choice. Please try again...";
        choiceString = getInputString();

        if(choiceString.length() == 1)
        {
            // Get input char
            inputChar = choiceString.charAt(0);

            // Analyze user choice
            switch (inputChar) {
                case 'a':
                case 'A':
                    System.out.println(toUppercase(userString));
                    break;
                case 'b':
                case 'B':
                    System.out.println(toLowercase(userString));
                    break;
                case 'c':
                case 'C':
                    System.out.println(toCamelcase(userString));
                    break;
                case 'd':
                case 'D':
                    System.out.println(toInverseCamelcase(userString));
                    break;
                case 'e':
                case 'E':
                    System.out.println(toSentencecase(userString));
                    break;
                case 'f':
                case 'F':
                    System.exit(0);
                    break;
                default:
                    System.out.println(errorMessage);
                    break;
            }
        }
        else
        {
            System.out.println(errorMessage);
        }
    }

    public static String toUppercase(String inputString)
    {
        return inputString.toUpperCase();
    }

    public static String toLowercase(String inputString)
    {
        return inputString.toLowerCase();
    }

    public static String toCamelcase(String inputString)
    {
        String[] tmpStr;
/*        for(inputString : )
        {

        }*/
        return "Camelcase";
    }

    public static String toInverseCamelcase(String inputString)
    {
        return "InverseCamelcase";
    }

    public static String toSentencecase(String inputString)
    {
        char newFirstChar = inputString.charAt(0);
        newFirstChar = Character.toUpperCase(newFirstChar);
        StringBuilder newString = new StringBuilder(inputString);
        newString.setCharAt(0, newFirstChar);
        return newString.toString();
    }
}
