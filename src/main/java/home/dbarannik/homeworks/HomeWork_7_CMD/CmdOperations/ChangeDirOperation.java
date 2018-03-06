package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChangeDirOperation implements CmdOperation {
    CmdPathManager cmdPathManager;
    private String params;
    StringBuilder sb;

    public ChangeDirOperation(CmdPathManager cmdPathManager, String params) {
        this.cmdPathManager = cmdPathManager;
        this.params = params;
    }

    @Override
    public void makeOperation(String params) throws UnsupportedCmdOperation {
        String paramsCorrected = "";
        paramsCorrected = params.toLowerCase();
        sb = new StringBuilder(params);

        // Remove unnecessary '\'
        if (sb.charAt(0) == '\\') {
            sb.deleteCharAt(0);
            paramsCorrected = sb.toString();
        }

        if ((sb.charAt(sb.length() - 1)) == '\\') {
            sb.deleteCharAt(sb.length() - 1);
            paramsCorrected = sb.toString();
        }

        if (params.equals("..")) {
            cmdPathManager.toParentDir();
        } else {
            File path = new File(paramsCorrected);
            if (path.isFile()) {
                throw new UnsupportedCmdOperation(params + " is file! Specify directory instead.");
            } else {
                // Check if current dir contains "paramsCorrected"
                path = new File(cmdPathManager.getCurrentPath().toString());
                File[] filesList = path.listFiles();

                try {
                    for (int i = 0; i < filesList.length; i++) {
                        if (filesList[i].isDirectory() & filesList[i].getName().toLowerCase().equals(paramsCorrected)) {
                            paramsCorrected = filesList[i].getAbsolutePath();
                        }

                        if (filesList[i].isFile() & filesList[i].getName().toLowerCase().equals(paramsCorrected)) {
                            throw new UnsupportedCmdOperation(params + " is file! Specify directory instead.");
                        }
                    }
                    cmdPathManager.setCurrentPath(Paths.get(paramsCorrected));
                } catch (InvalidPathException e) {
                    System.out.println("Invalid path!");
                } catch (UnsupportedCmdOperation e) {
                    System.err.println("Unsupported operation: " + e.getOperation());
                }
            }
        }
    }
}
