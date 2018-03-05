package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations.*;

public class CmdOperationManager {
    private CmdPathManager cmdPathManager = new CmdPathManager(this);

    public void processInputString(String inputString) throws UnsupportedCmdOperation {
        String inputStringTrimmed = inputString.trim();
        if (inputStringTrimmed.isEmpty()) {
            throw new UnsupportedCmdOperation(inputString);
        }

        String[] arguments = inputStringTrimmed.split(" ");
        if (arguments.length > 2) {
            throw new UnsupportedCmdOperation(inputString);
        } else if (arguments.length == 2) {
            processCmdOperationFor(arguments[0], arguments[1]);
        } else {
            processCmdOperationFor(arguments[0], "");
        }
    }

    public void processCmdOperationFor(String operation, String params) throws UnsupportedCmdOperation{
        CmdOperation cmdOperation = getCmdOperationFor(operation, params);
        if (cmdOperation != null) {
            cmdOperation.makeOperation(params);
        } else {
            throw new UnsupportedCmdOperation(operation);
        }
    }

    private CmdOperation getCmdOperationFor(String operation, String params) {
        if ("help".equals(operation)) {
            return new ShowHelpInfoOperation();
        } else if ("chdir".equals(operation)) {
            return new ChangeDirOperation(cmdPathManager, params);
        } else if ("cp".equals(operation)) {
            return new ShowCurrentPathOperation(cmdPathManager);
        } else if ("ls".equals(operation)) {
            return new ListOperation(cmdPathManager);
        } else if ("exit".equals(operation)) {
            return new ExitAppOperation();
        }
        return null;
    }
}
