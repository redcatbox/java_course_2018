package home.dbarannik.homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3_03 {
    final static Pattern REGEX_FULL_NAME = Pattern.compile("[a-zA-Z\\s'\\-?]+");
    final static Pattern REGEX_PHONE_NUMBER = Pattern.compile("^(\\+380\\()\\d{2}\\)\\d{7}$");
    final static Pattern REGEX_EMAIL_ADDRESS = Pattern.compile("^[a-zA-Z0-9\\-?\\_?]+(\\@)[a-zA-Z]+(\\.)[a-zA-Z]+$");
    final static String ERROR_MESSAGE_FULL_NAME = "Invalid full name. Please try again...";
    final static String ERROR_MESSAGE_PHONE_NUMBER = "Invalid phone number. Please try again...";
    final static String ERROR_MESSAGE_EMAIL_ADDRESS = "Invalid email address. Please try again...";

    public static void main(String[] args) {
        String fullName;
        String phoneNumber;
        String emailAddress;

        System.out.println("Enter your full name.");
        System.out.println("Last name + First name + Second name");
        System.out.println("Can contain latin letters, hyphen and space.");
        System.out.println("Your full name is:");
        fullName = getAndValidateInputString(REGEX_FULL_NAME, ERROR_MESSAGE_FULL_NAME); // Baran-nik Dmitriy Nikolaevich
        System.out.println("");

        System.out.println("Enter your phone number.");
        System.out.println("+380(XX)XXXXXXX");
        System.out.println("Your phone number is:");
        phoneNumber = getAndValidateInputString(REGEX_PHONE_NUMBER, ERROR_MESSAGE_PHONE_NUMBER); // +380(99)0234569
        System.out.println("");

        System.out.println("Enter your email address.");
        System.out.println("account@domain.com");
        System.out.println("Can contain latin letters, numbers, hyphen and underscore)");
        System.out.println("Your email address is:");
        emailAddress = getAndValidateInputString(REGEX_EMAIL_ADDRESS, ERROR_MESSAGE_EMAIL_ADDRESS); // Some_Account-01@mail.net
        System.out.println("");

        System.out.printf("Name:  %s.%n", fullName);
        System.out.printf("Phone: %s.%n", phoneNumber);
        System.out.printf("Email: %s.%n", emailAddress);
    }

    public static String getAndValidateInputString(Pattern regex, String errorMessage) {
        String result;
        Scanner scan = new Scanner(System.in);

        while (true) {
            result = scan.nextLine();
            Matcher mat = regex.matcher(result);

            if (mat.matches()) {
                return result;
            } else {
                System.out.println(errorMessage);
            }
        }
    }
}
