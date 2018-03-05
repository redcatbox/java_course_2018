package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;

public class CmdMain {
    static final ConsoleReader consoleReader = new ConsoleReader();
    static String inputString;

    public static void main(String[] args) {
        showHelpInfo(); // Show help info
        showInitialPath(); // Show initial path

        while (true) {
            inputString = ""; //reset
            try {
                inputString = consoleReader.getInputString();
                processInputString(inputString);
            } catch (UnsupportedOperationException e) {
                System.err.println("Unsupported operation!");
            }
        }
    }

    static void processInputString(String inputString) throws Exception {
        parseInputString(inputString);
    }

    static CmdOperation parseInputString(String inputString) throws InvalidPathException, UnsupportedOperationException, InvalidParameterException {
        String operator = "";
//        String[] arguments = inputString.split("\\");
        if (inputString == "") {
            throw new InvalidParameterException();
        }

        if (false) {
            throw new UnsupportedOperationException();
        }

        if ("/?".equals(operator)) {
            return new ShowHelpInfoOperation();
        } else if ("chdir".equals(operator)) {
            return new ChangeDirOperation();
        } else if ("ls".equals(operator)) {
            return new ListOperation();
        } else if ("exit".equals(operator)) {
            return new ExitOperation();
        }
        return null;
    }

    static void showInitialPath() {
        Path initialPath = Paths.get(System.getProperty("user.dir"));
        System.out.println("You here:");
        System.out.println(initialPath);
        System.out.println();
    }

    static void showHelpInfo() {
        System.out.println("Help info:");
        System.out.println("/?\t\t\t\t\tshow this help info");
        System.out.println("chdir path\\to\\go\tchange dir");
        System.out.println("chdir ..\t\t\tgo one level up");
        System.out.println("ls\t\t\t\t\tlist files in dir");
        System.out.println("exit\t\t\t\texit app");
        System.out.println();
    }
}
/*
Разработать программу, аналог командной строки.
Программа должна поддерживать две команды:
chdir путь\куда\хотим\перейти - изменение текущего каталога
chdir .. - выходим из текущего каталога
ls - отображение файлов и директорий в текущем каталоге
Если пользователь пытается перейти “в файл“, программа должна выдать
соответствующую ошибку.
Если каталог не найден, программа также должна сообщить об ошибке.
*/