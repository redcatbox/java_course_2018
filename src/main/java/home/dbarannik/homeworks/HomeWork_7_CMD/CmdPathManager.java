package home.dbarannik.homeworks.HomeWork_7_CMD;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CmdPathManager {
    private Path currentPath;

    public CmdPathManager() {
        currentPath = Paths.get("").toAbsolutePath();
    }

    public Path getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(Path currentPath) {
        this.currentPath = currentPath;
    }
}
