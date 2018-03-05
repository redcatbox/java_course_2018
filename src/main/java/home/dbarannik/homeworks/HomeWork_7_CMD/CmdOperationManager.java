package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations.*;

import java.util.regex.Pattern;

public class CmdOperationManager {
    final static Pattern REGEX_CHDIR = Pattern.compile("^[a-zA-Z0-9\\-?\\_?]+(\\@)[a-zA-Z]+(\\.)[a-zA-Z]+$");
    private CmdPathManager cmdPathManager = new CmdPathManager();
    private CmdOperation cmdOperation;

    public void processInputString(String inputString) throws UnsupportedCmdOperation {
        String inputStringTrimmed;
        inputStringTrimmed = inputString.trim();
        if (inputString.isEmpty()) {
            throw new UnsupportedCmdOperation(inputString);
        }

        String[] arguments = inputString.split(" ");
        if (arguments.length > 2) {
            throw new UnsupportedCmdOperation(inputString);
        } else if (arguments.length == 2) {
            makeCmdOperationFor(arguments[0], arguments[1]);
        } else {
            makeCmdOperationFor(arguments[0], "");
        }
    }

    public void makeCmdOperationFor(String operation, String arguments) throws UnsupportedCmdOperation{
        cmdOperation = getCmdOperationFor(operation, arguments);
        if (cmdOperation != null) {
            cmdOperation.makeOperation();
        } else {
            throw new UnsupportedCmdOperation(operation);
        }
    }

    public CmdOperation getCmdOperationFor(String operation, String arguments) {
        if ("help".equals(operation)) {
            return new ShowHelpInfoOperation();
        } else if ("chdir".equals(operation)) {
            return new ChangeDirOperation(arguments);
        } else if ("cp".equals(operation)) {
            return new ShowCurrentPathOperation();
        } else if ("ls".equals(operation)) {
            return new ListOperation();
        } else if ("exit".equals(operation)) {
            return new ExitAppOperation();
        }
        return null;
    }
}
