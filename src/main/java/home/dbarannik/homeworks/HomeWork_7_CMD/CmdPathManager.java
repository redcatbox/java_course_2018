package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CmdPathManager {
    private Path currentPath;

    public CmdPathManager() {
        currentPath = Paths.get(System.getProperty("user.dir")); // Initial path
    }

    public boolean setCurrentPath(Path newCurrentPath) throws InvalidPathException, UnsupportedCmdOperation {
        File file = new File(newCurrentPath.toString());
        if (Files.notExists(newCurrentPath)) {
            throw new InvalidPathException("", "");
        } else if (file.isFile()) {
            throw new UnsupportedCmdOperation(newCurrentPath.toString());
        }
        currentPath = newCurrentPath;
        return true;
    }

    public void toParentDir() {
        currentPath = currentPath.getParent();
    }

    public Path getCurrentPath() {
        return currentPath;
    }

}
