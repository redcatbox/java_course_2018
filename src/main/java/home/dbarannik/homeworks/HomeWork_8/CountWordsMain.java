package home.dbarannik.homeworks.HomeWork_8;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountWordsMain {
    public static void main(String[] args) {
        List<String> allWords = new ArrayList<>();
        HashSet<String> uniqueWords = new HashSet<>();

        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(Paths.get("src\\main\\java\\home\\dbarannik\\homeworks\\HomeWork_8\\CountWordsTest")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                for (String s : line.split("\\s")) {
                    allWords.add(s);
                    uniqueWords.add(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 0;
        for (String u : uniqueWords) {
            for (String a : allWords) {
                if (u.equals(a)) {
                    counter++;
                }
            }
            System.out.printf("%s = %d%n", u, counter);
            counter = 0;
        }
    }
}
/*
Разработать программу, читающую переданный ей текстовый файл в параметрах.
Программа должна разбить данные текстового файла на слова, посчитать кол-во каждого
слова, и вывести слово и кол-во его вхождений в алфавитном порядке (без учета
регистра!).
java ….SomeClass c:\file.txt
*/
// C:\Users\Nadin\IdeaProjects\java_course_2018\src\main\java\home\dbarannik\homeworks\HomeWork_8\
// set path=C:\Program Files\Java\jdk-9.0.1\bin
// javac CountWordsMain.java
// java CountWordsMain CountWordsTest