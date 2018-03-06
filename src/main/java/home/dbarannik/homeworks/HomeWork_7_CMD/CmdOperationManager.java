package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations.*;

public class CmdOperationManager {
    protected CmdPathManager cmdPathManager = new CmdPathManager();

    public void processInputString(String inputString) throws UnsupportedCmdOperation {
        String inputStringTrimmed = inputString.trim();

        if (!inputStringTrimmed.isEmpty()) {
            String[] arguments = inputStringTrimmed.split(" ");

            if (arguments.length > 2) {
                throw new UnsupportedCmdOperation(inputString);
            } else if (arguments.length == 2) {
                processCmdOperationFor(arguments[0], arguments[1]);
            } else {
                processCmdOperationFor(arguments[0], "");
            }
        }

        System.out.println(cmdPathManager.getCurrentPath().toString());
    }

    public void processCmdOperationFor(String operation, String params) throws UnsupportedCmdOperation {
        CmdOperation cmdOperation = getCmdOperationFor(operation, params);

        if (cmdOperation != null) {
            try {
                cmdOperation.makeOperation(params);
            } catch (UnsupportedCmdOperation e) {
                System.err.println(e.getOperation());
            }
        } else {
            throw new UnsupportedCmdOperation(operation);
        }
    }

    private CmdOperation getCmdOperationFor(String operation, String params) {
        if ("help".equals(operation)) {
            return new ShowHelpInfoOperation();
        } else if ("chdir".equals(operation)) {
            return new ChangeDirOperation(cmdPathManager, params);
        } else if ("ls".equals(operation)) {
            return new ListOperation(cmdPathManager);
        } else if ("exit".equals(operation)) {
            return new ExitAppOperation();
        }
        return null;
    }
}
