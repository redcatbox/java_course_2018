package home.dbarannik.labs.Lab_5_FindInFile;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FinderFileVisitor extends SimpleFileVisitor<Path> {
    private final String phrase;
    private final PrintStream printStream;

    public FinderFileVisitor(String phrase, PrintStream ps) {
        this.phrase = phrase;
        this.printStream = ps;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file));) {
            String line;
            boolean notPrinted = true;

            while ((line = reader.readLine()) != null) {
                if (line.contains(phrase)) {
                    if (notPrinted) {
                        printStream.println(file.toAbsolutePath());
                        notPrinted = false;
                    }
                    printStream.printf("\t%d: %s%n", reader.getLineNumber(), line);
                }
            }
        }

        return FileVisitResult.CONTINUE;
    }
}
