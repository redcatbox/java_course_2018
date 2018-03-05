package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ShowCurrentPathOperation implements CmdOperation {
    CmdPathManager cmdPathManager;
    public ShowCurrentPathOperation(CmdPathManager cmdPathManager) {
        this.cmdPathManager = cmdPathManager;
    }

    @Override
    public void makeOperation(String params) {
        System.out.println("Current path is:");
        System.out.println(cmdPathManager.getCurrentPath().toString());
    }
}
