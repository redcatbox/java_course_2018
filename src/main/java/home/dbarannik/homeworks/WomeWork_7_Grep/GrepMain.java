package home.dbarannik.homeworks.WomeWork_7_Grep;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GrepMain {
    public static void main(String[] args) {

        while (true) {
            try {
                getInputData();
            } catch (FileNotFoundException e) {
                System.err.println("File not found! Try again...");
            }
        }

        //filePath = "GrepText.txt";
        //Path file = Paths.get("c:\\javaio\\bio\\test.txt");
        //BufferedReader bufferedReader = new BufferedReader();
    }

    static void getInputData() throws FileNotFoundException {
        ConsoleReader reader = new ConsoleReader();
        String filePath;
        String stringToGrep;

        System.out.println("Specify file path:");
        filePath = reader.getInputString();
        Path path = Paths.get(filePath);

        if (Files.notExists(path)) {
            throw new FileNotFoundException();
        }

        System.out.println("Specify text or regular expression to find:");
        stringToGrep = reader.getInputString();

        makeGrep();
    }

    static void makeGrep(File file, String stringToGrep) {

    }
}
