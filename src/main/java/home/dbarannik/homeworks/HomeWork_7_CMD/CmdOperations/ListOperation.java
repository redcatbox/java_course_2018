package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.homeworks.HomeWork_7_CMD.CmdMain;

import java.io.IOException;
import java.nio.file.*;

public class ListOperation implements CmdOperation {

    @Override
    public void makeOperation(String ... params) {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(CmdMain.getCurrentPath().toString()))) {
            for (Path file : ds) {
                if (file.toFile().isDirectory()) {
                    System.out.println("Directory\t" + file.getFileName());
                }
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.err.println(e);
        }

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(CmdMain.getCurrentPath().toString()))) {
            for (Path file : ds) {
                if (file.toFile().isFile()) {
                    System.out.println("File\t\t" + file.getFileName());
                }
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.err.println(e);
        }
    }
}
