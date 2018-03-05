package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CmdPathManager {
    private Path currentPath;
    private CmdOperationManager cmdOperationManager;

    public CmdPathManager(CmdOperationManager cmdOperationManager) {
        currentPath = Paths.get(System.getProperty("user.dir")); // Initial path
        this.cmdOperationManager = cmdOperationManager;
    }

    public void setCurrentPath(Path newCurrentPath) throws FileNotFoundException {
        if (Files.notExists(newCurrentPath)) {
            throw new FileNotFoundException();
        }
        currentPath = newCurrentPath;

        // Show current dir
        try {
            cmdOperationManager.processCmdOperationFor("cp", "");
        } catch (UnsupportedCmdOperation e) {
            System.err.println("Unsupported operation: " + e.getOperation());
        }
    }

    public void oneLevelUp() {

    }

    public Path getCurrentPath() {
        return currentPath;
    }

}
