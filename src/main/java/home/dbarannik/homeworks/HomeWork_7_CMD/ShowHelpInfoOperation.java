package home.dbarannik.homeworks.HomeWork_7_CMD;

public class ShowHelpInfoOperation implements CmdOperation {

    @Override
    public void makeOperationFor(String operator, String... args) {
        System.out.println();
        System.out.println("Help info:");
        System.out.println("/? - to show this help");
        System.out.println("chdir path\\to\\go - to change dir");
        System.out.println("chdir .. - go to one level up");
        System.out.println("ls - list files in dir");
        System.out.println("exit - to exit app");
        System.out.println();
    }
}
