package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdPathManager;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ChangeDirOperation implements CmdOperation {
    CmdPathManager cmdPathManager;

    public ChangeDirOperation(CmdPathManager cmdPathManager) {
        this.cmdPathManager = cmdPathManager;
    }

    @Override
    public void makeOperation(String... params) throws UnsupportedCmdOperation {
        String paramsCorrected = "";
        paramsCorrected = params[1].toLowerCase();
        StringBuilder sb;
        sb = new StringBuilder(params[1]);

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
            cmdPathManager.setCurrentPath(cmdPathManager.getCurrentPath().resolve(paramsCorrected).normalize());
        } else {
            Path p = cmdPathManager.getCurrentPath();
            try {

                p = p.resolve(paramsCorrected);
//                p = p.resolve(paramsCorrected).normalize();
            } catch (InvalidPathException e) {
                System.out.println("Invalid path!");
            }

            if (Files.exists(p) & Files.isDirectory(p)) {
                cmdPathManager.setCurrentPath(p);
            } else {
                throw new UnsupportedCmdOperation(p.toString() + " is file! Specify directory instead.");
            }
        }
    }
}
