package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CmdPathManager {
    private Path currentPath;
    private Path currentRoot;

    public CmdPathManager() {
        currentPath = Paths.get(System.getProperty("user.dir")); // Initial path
        currentRoot = currentPath.getRoot();
    }

    public void setCurrentPath(Path newCurrentPath) throws InvalidPathException, UnsupportedCmdOperation {
        File file = new File(newCurrentPath.toString());
        if (Files.notExists(newCurrentPath)) {
            throw new InvalidPathException("", "");
        } else if (file.isFile()) {
            throw new UnsupportedCmdOperation(newCurrentPath.toString());
        }
        currentPath = newCurrentPath;
        currentRoot = currentPath.getRoot();
    }

    public void toParentDir() {
        currentPath = currentPath.getParent();
        if (currentPath == null) {
            currentPath = currentRoot;
        }
    }

    public Path getCurrentPath() {
        return currentPath;
    }

    public Path getCurrentRoot() {
        return currentRoot;
    }
}
