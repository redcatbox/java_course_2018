package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdMain;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ChangeDirOperation implements CmdOperation {
    StringBuilder sb;

    @Override
    public void makeOperation(String ... params) throws UnsupportedCmdOperation {
        String paramsCorrected = "";
        paramsCorrected = params[1].toLowerCase();
        sb = new StringBuilder(params[1]);

        CmdMain.getCurrentPath().
        // Remove first unnecessary '\'
        if (sb.charAt(0) == '\\') {
            sb.deleteCharAt(0);
            paramsCorrected = sb.toString();
        }
        // Remove last unnecessary '\'
        if ((sb.charAt(sb.length() - 1)) == '\\') {
            sb.deleteCharAt(sb.length() - 1);
            paramsCorrected = sb.toString();
        }

        if (paramsCorrected.equals("..")) {
            CmdMain.setCurrentPath(CmdMain.getCurrentPath().getParent());
        } else {

            File path = new File(paramsCorrected);
            if (path.isFile()) {
                throw new UnsupportedCmdOperation(params + " is file! Specify directory instead.");
            } else {
                // Check if current dir contains given parameter
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
//                    cmdPathManager.setCurrentPath(Paths.get(paramsCorrected));
                } catch (InvalidPathException e) {
                    System.out.println("Invalid path!");
                } catch (UnsupportedCmdOperation e) {
                    System.err.println("Unsupported operation: " + e.getOperation());
                }
            }
        }
    }
}
