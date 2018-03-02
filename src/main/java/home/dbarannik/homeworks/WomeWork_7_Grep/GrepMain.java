package home.dbarannik.homeworks.WomeWork_7_Grep;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GrepMain {
    public static void main(String[] args) {

        try {
            getInputData();
        } catch (FileNotFoundException fNF) {
            System.err.println("FileNotFoundException! Try again...");
        } catch (InvalidPathException iPE) {
            System.err.println("InvalidPathException! Try again...");
        }

        //filePath = "GrepText.txt";
        //Path file = Paths.get("c:\\javaio\\bio\\test.txt");
        //BufferedReader bufferedReader = new BufferedReader();
    }

    static void getInputData() throws FileNotFoundException/*, InvalidPathException*/ {
        ConsoleReader reader = new ConsoleReader();
        Path path = null;
        String filePath;
        String stringToGrep;

        // Valid paths:
        // C:\Users\dbarannik\IdeaProjects\java_course_2018\src\main\java\home\dbarannik\homeworks\WomeWork_7_Grep\GrepTest.txt
        // src\main\java\home\dbarannik\homeworks\WomeWork_7_Grep\GrepTest.txt
        System.out.println("Specify file path:");
        filePath = reader.getInputString();
        path = Paths.get(filePath);

        if (Files.notExists(path)) {
            throw new FileNotFoundException();
        }

        System.out.println("Specify text or regular expression to find:");
        stringToGrep = reader.getInputString();

        //makeGrep();
    }

    static void makeGrep(File file, String stringToGrep) {

    }
}
