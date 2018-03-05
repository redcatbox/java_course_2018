package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

public class ChangeDirOperation implements CmdOperation {
    private String arguments;

    public ChangeDirOperation(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public void makeOperation(String... args) {
        System.out.println("Dir Changed!");
    }
}
