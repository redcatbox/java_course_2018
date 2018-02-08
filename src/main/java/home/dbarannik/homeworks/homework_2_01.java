package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_2_01 {

    public static void main(String[] args) {
        String studentFullName = getStudentFullName(); //Barannik Dmitriy Nikolaevich
        printStudentInfo(studentFullName);
    }

    public static String getStudentFullName() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter student full name:");
        return console.nextLine();
    }

    public static void printStudentInfo(String fullName) {
        int fieldWidth = 0;
        char frameSymbol = '*';
        char spaceSymbol = ' ';
        String titleText = "Course: Java core";
        String positionText = "Student";
        String firstString = "";
        String secondString = "";
        String thirdString = "";
        String fourthString = "";

        // By definition name is always widest than other texts
        fieldWidth = fullName.length() + 4;

        // Make first (and last) string
        for(int i = 0; i < fieldWidth; i++)
        {
            firstString = firstString + frameSymbol;
        }

        // Make second string
        secondString = secondString + frameSymbol + textAndSpaces(fieldWidth, titleText, spaceSymbol) + frameSymbol;

        // Make third string
        thirdString = thirdString + frameSymbol + textAndSpaces(fieldWidth, positionText, spaceSymbol) + frameSymbol;

        // Make fourth string
        fourthString = fourthString + frameSymbol + spaceSymbol + fullName + spaceSymbol + frameSymbol;

        // Print final result to console
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
        System.out.println(fourthString);
        System.out.println(firstString);
    }

    public static String textAndSpaces(int fieldWidth, String textBetween, char spaceSymbol) {
        String result = "";

        // Fill left side with spaces
        for(int i = 0; i < ((fieldWidth - textBetween.length() - 2) / 2); i++)
        {
            result = result + spaceSymbol;
        }

        // Add text between
        result = result + textBetween;

        // Fill right side with spaces
        if((fieldWidth - textBetween.length()) % 2 == 0)
        {
            for(int i = 0; i < ((fieldWidth - textBetween.length() - 2) / 2); i++)
            {
                result = result + spaceSymbol;
            }
        }
        else
        {
            for(int i = 0; i < (((fieldWidth - textBetween.length() - 2) / 2) + 1); i++)
            {
                result = result + spaceSymbol;
            }
        }

        return result;
    }
}
