package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.FileNotFoundException;
import java.nio.file.InvalidPathException;
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
        while (true) {
            // to Parent Dir
            if (params.equals("..")) {
                    cmdPathManager.toParentDir();
                    break;
            }

            String paramsCorrected = "";
            StringBuilder sb = new StringBuilder(params);
            // Remove unnecessary '\'
            if (sb.charAt(0) == '\\') {
                sb.deleteCharAt(0);
                paramsCorrected = sb.toString();
            } else if ((sb.length() - 1) == '\\') {
                sb.deleteCharAt(sb.length() - 1);
                paramsCorrected = sb.toString();
            }

            try {
                cmdPathManager.setCurrentPath(Paths.get(params));
                break;
            } catch (InvalidPathException e) {
                System.out.println("Invalid path!");
            } catch (UnsupportedCmdOperation e) {
                System.err.println("Unsupported operation: " + e.getOperation());
            }

            try {
                cmdPathManager.setCurrentPath(Paths.get((cmdPathManager.getCurrentPath().toString() + '\\' + paramsCorrected)));
                break;
            } catch (InvalidPathException e) {
                System.out.println("Invalid path!");
            } catch (UnsupportedCmdOperation e) {
                System.err.println("Unsupported operation: " + e.getOperation());
            }
        }
    }
}
