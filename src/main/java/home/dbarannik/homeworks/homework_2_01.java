package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_2_01 {

    public static void main(String[] args) {
        String studentFullName = getStudentFullName();
        printStudentInfo(studentFullName);
    }

    public static String getStudentFullName() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter student full name:");
        return console.nextLine();
    }

    public static void printStudentInfo(String fullName) {
        char frameSymbol = '*';
        char spaceSymbol = ' ';

        String firstString = "";
        String secondString = "";
        String thirdString = "";
        String fourthString = "";

        int fieldWidth = fullName.length() + 4;

        for(int i = 0; i < fieldWidth; i++)
        {
            firstString = firstString + frameSymbol;
        }
        // Print final result to sonsole
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
        System.out.println(fourthString);
        System.out.println(firstString);
    }
}
