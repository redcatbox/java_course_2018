package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ShowCurrentPathOperation implements CmdOperation {
    @Override
    public void makeOperation(String... args) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        System.out.println("Current path is:");
        System.out.println(currentPath);
        System.out.println();
    }
}
