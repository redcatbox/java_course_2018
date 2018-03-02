package home.dbarannik.labs.Lab_5_FindInFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinderMain {
    public static void main(String[] args) {
        new FinderFileVisitor("hello world", System.out);
        try {
            Files.walkFileTree(Paths.get("src\\main\\java\\home\\dbarannik\\labs\\Lab_5_FindInFile\\Dir0"), new FinderFileVisitor("hello world", System.out));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
