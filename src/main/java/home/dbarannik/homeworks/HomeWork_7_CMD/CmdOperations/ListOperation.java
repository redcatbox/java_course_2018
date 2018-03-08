package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.IOException;
import java.nio.file.*;

public class ListOperation implements CmdOperation {
    private CmdPathManager cmdPathManager;

    public ListOperation(CmdPathManager cmdPathManager) {
        this.cmdPathManager = cmdPathManager;
    }

    @Override
    public void makeOperation(String... params) {
        try {
            Files.list(cmdPathManager.getCurrentPath())
//                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (Path file : ds) {
//            if (file.toFile().isDirectory()) {
//                System.out.println("Directory\t" + file.getFileName());
//            }
//        }
//        if (file.toFile().isFile()) {
//            System.out.println("File\t\t" + file.getFileName());
//        }

    }
}
