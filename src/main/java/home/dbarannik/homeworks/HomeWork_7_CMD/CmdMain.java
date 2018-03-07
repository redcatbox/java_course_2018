package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.ConsoleReader.ConsoleReader;
import home.dbarannik.Exceptions.UnsupportedCmdOperation;
import home.dbarannik.homeworks.HomeWork_7_CMD.CmdOperations.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CmdMain {
    static private Path currentPath = Paths.get("").toAbsolutePath();
    static private Path currentRoot = currentPath.getRoot();

    public static Path getCurrentPath() {
        return currentPath;
    }

    public static void setCurrentPath(Path currentPath) {
        CmdMain.currentPath = currentPath;
        setCurrentRoot(currentPath.getRoot());
    }

    public static Path getCurrentRoot() {
        return currentRoot;
    }

    private static void setCurrentRoot(Path currentRoot) {
        CmdMain.currentRoot = currentRoot;
    }

    static void processInputString(String inputString) throws UnsupportedCmdOperation {
        String inputStringTrimmed = inputString.trim();

        if (!inputStringTrimmed.isEmpty()) {
            String[] arguments = inputStringTrimmed.split(" ");

            if (arguments.length > 2) {
                throw new UnsupportedCmdOperation(inputString);
            } else if (arguments.length == 2) {
                processCmdOperationFor(arguments[0], arguments[1]);
            } else if (arguments.length == 1) {
                processCmdOperationFor(arguments[0]);
            }
        }
    }

    static void processCmdOperationFor(String ... params) throws UnsupportedCmdOperation {
        CmdOperation cmdOperation = getCmdOperationFor(params);

        if (cmdOperation != null) {
            try {
                cmdOperation.makeOperation(params);
            } catch (UnsupportedCmdOperation e) {
                System.err.println(e.getOperation());
            }
        } else {
            throw new UnsupportedCmdOperation(params[0]);
        }
    }

    static CmdOperation getCmdOperationFor(String ... params) {
        if ("help".equals(params[0])) {
            return new ShowHelpInfoOperation();
        } else if ("chdir".equals(params[0])) {
            return new ChangeDirOperation();
        } else if ("ls".equals(params[0])) {
            return new ListOperation();
        } else if ("exit".equals(params[0])) {
            return new ExitAppOperation();
        }
        return null;
    }

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        String inputString;

        try {
            // Show help info
            processCmdOperationFor("help");
        } catch (UnsupportedCmdOperation e) {
            System.out.println();
            System.out.println(getCurrentPath());
        }
        // Show current dir
        System.out.println();
        System.out.println(getCurrentPath());

        while (true) {
            try {
                inputString = consoleReader.getInputString();
                processInputString(inputString);
                System.out.println();
                System.out.println(getCurrentPath());
            } catch (UnsupportedCmdOperation e) {
                System.err.println("Unsupported operation: " + e.getOperation());
                System.out.println();
                System.out.println(getCurrentPath());
            }
        }
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