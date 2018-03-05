package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

public class ExitAppOperation implements CmdOperation {
    @Override
    public void makeOperation(String... args) {
        System.exit(0);
    }
}
