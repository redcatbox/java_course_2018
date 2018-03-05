package home.dbarannik.homeworks.HomeWork_7_CMD;

public class ExitOperation implements CmdOperation {
    @Override
    public void makeOperationFor(String operator, String... args) {
        System.exit(0);
    }
}
