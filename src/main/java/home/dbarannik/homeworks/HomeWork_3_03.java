package home.dbarannik.homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3_03 {
    final static String REGEX_FULL_NAME = "[a-zA-Z\\s']+";
    final static String REGEX_PHONE_NUMBER = "[a-zA-Z\\s']+";
    final static String REGEX_EMAIL_ADDRESS = "[a-zA-Z\\s']+";
    final static String ERROR_MESSAGE_FULL_NAME = "Invalid full name. Please try again...";
    final static String ERROR_MESSAGE_PHONE_NUMBER = "Invalid phone number. Please try again...";
    final static String ERROR_MESSAGE_EMAIL_ADDRESS = "Invalid email address. Please try again...";

    public static void main(String[] args) {
        String fullName;
        String phoneNumber;
        String emailAddress;

        System.out.println("Enter your full name.");
        System.out.println("It can contain latin letters, hyphen and space.");
        System.out.println("Your full name is:");
        fullName = getAndValidateInputString(REGEX_FULL_NAME, ERROR_MESSAGE_FULL_NAME);
        System.out.println("");

        System.out.println("Enter your phone number.");
        System.out.println("+380(XX)XXXXXXX");
        System.out.println("Your phone number is:");
        phoneNumber = getAndValidateInputString(REGEX_PHONE_NUMBER, ERROR_MESSAGE_PHONE_NUMBER);
        System.out.println("");

        System.out.println("Enter your email address.");
        System.out.println("account@domain.com");
        System.out.println("It can contain latin letters, numbers, hyphen and underscore)");
        System.out.println("Your email address is:");
        emailAddress = getAndValidateInputString(REGEX_EMAIL_ADDRESS, ERROR_MESSAGE_EMAIL_ADDRESS);
        System.out.println("");

        System.out.printf("Name:  %s", fullName);
        System.out.printf("Phone: %s", phoneNumber);
        System.out.printf("Email: %s", emailAddress);
    }

    public static String getAndValidateInputString(String regex, String errorMessage) {
        String result = "";
        Scanner scan = new Scanner(System.in);
        Pattern pat = Pattern.compile(regex);

        while (true) {
            result = scan.nextLine();
            Matcher mat = pat.matcher(result);

            if (mat.matches()) {
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return result;
    }
}
