package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

public class ExitAppOperation implements CmdOperation {
    @Override
    public void makeOperation(String... params) {
        System.exit(0);
    }
}
