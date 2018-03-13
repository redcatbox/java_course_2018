package home.dbarannik.homeworks.HomeWork_8;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CountWordsMain {
    public static void main(String[] args) {
        Map<String, Integer> words = new TreeMap();

        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(Paths.get("src\\main\\java\\home\\dbarannik\\homeworks\\HomeWork_8\\CountWordsTest")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();

                for (String str : line.split("\\s")) {
                    words.computeIfPresent(str, (k, v) -> v+1);
                    words.putIfAbsent(str, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(words);
    }
}
/*
Разработать программу, читающую переданный ей текстовый файл в параметрах.
Программа должна разбить данные текстового файла на слова, посчитать кол-во каждого
слова, и вывести слово и кол-во его вхождений в алфавитном порядке (без учета
регистра!).
java ….SomeClass c:\file.txt
*/