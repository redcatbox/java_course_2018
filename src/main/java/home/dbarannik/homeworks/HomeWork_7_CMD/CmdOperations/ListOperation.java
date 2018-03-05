package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.File;

public class ListOperation implements CmdOperation {
    CmdPathManager cmdPathManager;
    public ListOperation(CmdPathManager cmdPathManager) {
        this.cmdPathManager = cmdPathManager;
    }

    @Override
    public void makeOperation(String params) {
        File dir = new File(cmdPathManager.getCurrentPath().toString());
        File[] filesList = dir.listFiles();

        for (int i = 0; i < filesList.length; i++) {
            if (filesList[i].isFile()) {
                System.out.println("File\t\t" + filesList[i].getName());
            } else if (filesList[i].isDirectory()) {
                System.out.println("Directory\t" + filesList[i].getName());
            }
        }
    }
}
