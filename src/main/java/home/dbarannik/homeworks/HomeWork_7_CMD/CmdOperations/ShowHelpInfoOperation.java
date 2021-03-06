package home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations;

public class ShowHelpInfoOperation implements CmdOperation {

    @Override
    public void makeOperation(String... params) {
        System.out.println("Help info:");
        System.out.println("help\t\t\t\tshow this help info");
        System.out.println("cd path\\to\\go\t\tchange dir");
        System.out.println("cd ..\t\t\t\tgo one level up");
        System.out.println("ls\t\t\t\t\tlist files in dir");
        System.out.println("exit\t\t\t\texit app");
        System.out.println();
    }
}
