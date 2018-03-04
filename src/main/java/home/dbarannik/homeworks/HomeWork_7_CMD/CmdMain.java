package home.dbarannik.homeworks.HomeWork_7_CMD;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.nio.file.InvalidPathException;

public class CmdMain {
    static final ConsoleReader consoleReader = new ConsoleReader();


    public static void main(String[] args) {
        // Show info
        System.out.println("/? - to show help");
        System.out.println("chdir path\\to\\go - to change dir");
        System.out.println("chdir .. - go to one level up");
        System.out.println("ls - list files in dir");
        System.out.println("exit - to exit app");

        while (true) {
            parseInputString(consoleReader.getInputString());
        }
    }

    static void parseInputString(String inputString) throws InvalidPathException, UnsupportedOperationException {
        if (false) {
            throw new UnsupportedOperationException();
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