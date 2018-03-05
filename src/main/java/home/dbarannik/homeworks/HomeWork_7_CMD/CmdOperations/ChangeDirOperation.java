package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChangeDirOperation implements CmdOperation {
    CmdPathManager cmdPathManager;
    private String params;

    public ChangeDirOperation(CmdPathManager cmdPathManager, String params) {
        this.cmdPathManager = cmdPathManager;
        this.params = params;
    }

    @Override
    public void makeOperation(String params) {
        if (params == "..") {
            cmdPathManager.oneLevelUp();
        } else {
            try {
                cmdPathManager.setCurrentPath(Paths.get(params));
            } catch (FileNotFoundException e) {
                System.out.println("Invalid path!");
            }
        }
    }
}
