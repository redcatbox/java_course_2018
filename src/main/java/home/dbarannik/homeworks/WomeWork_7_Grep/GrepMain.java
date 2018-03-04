package home.dbarannik.homeworks.WomeWork_7_Grep;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class GrepMain {
    public static void main(String[] args) {
        Path filePath = null;
        String grepExpression = "";

        // Get file path
        // src\main\java\home\dbarannik\homeworks\WomeWork_7_Grep\GrepTest.txt
        ConsoleReader consoleReader = new ConsoleReader();
        GrepReader grepReader = new GrepReader(consoleReader);

        while (true) {
            System.out.println("Specify file path:");
            try {
                filePath = grepReader.getFilePath();
                System.out.flush();
                break;
            } catch (InvalidPathException e) {
                System.err.println("Invalid path! Try again...");
                System.err.flush();
            } catch (FileNotFoundException e) {
                System.err.println("File not found! Try again...");
                System.err.flush();
            }
        }

        // Get grep expression
        // don’t, You’ve
        // regex = [a-zA-Z]+'[a-zA-Z]+
        while (true) {
            System.out.println("Specify text or regular expression to grep:");
            try {
                grepExpression = grepReader.getGrepExpression();
                break;
            } catch (Exception e) {
                System.err.println("Invalid expression! Try again...");
            }
        }

        // Read file and grep
        GrepFileVisitor grepFileVisitor = new GrepFileVisitor(System.out);
        try {
            grepFileVisitor.visitFile(filePath, grepExpression);
        } catch (IOException e) {
            System.err.println("Error reading file!");
        }
    }
}
