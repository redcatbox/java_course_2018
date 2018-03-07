package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

import home.dbarannik.Exceptions.UnsupportedCmdOperation;

public interface CmdOperation {
    void makeOperation(String ... params) throws UnsupportedCmdOperation;
}
