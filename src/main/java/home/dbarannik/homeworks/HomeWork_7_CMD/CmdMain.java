package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.ConsoleReader.ConsoleReader;
import home.dbarannik.Exceptions.UnsupportedCmdOperation;

public class CmdMain {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        String inputString;
        CmdOperationManager cmdOperationManager = new CmdOperationManager();

        try {
            // Show help info
            cmdOperationManager.processCmdOperationFor("help", "");
        } catch (UnsupportedCmdOperation e) {
            System.err.println("Unsupported operation: " + e.getOperation());
        }
        // Show current dir
        System.out.println(cmdOperationManager.cmdPathManager.getCurrentPath());

        while (true) {
            try {
                inputString = consoleReader.getInputString();
                cmdOperationManager.processInputString(inputString);
            } catch (UnsupportedCmdOperation e) {
                System.err.println("Unsupported operation: " + e.getOperation());
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