package home.dbarannik.homeworks.WomeWork_7_Grep;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class GrepFileVisitor extends SimpleFileVisitor {
    private final PrintStream printStream;


    public GrepFileVisitor(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void visitFile(Path filePath, String grepExpression) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(filePath));) {
            String line;
            boolean notPrinted = true;
            boolean isRegex;
            Pattern pat = null;
            Matcher mat;

            try {
                pat = Pattern.compile(grepExpression);
                isRegex = true;
            } catch (PatternSyntaxException e) {
                isRegex = false;
            }

            while ((line = reader.readLine()) != null) {
                if (isRegex) {
                    mat = pat.matcher(line);
                    while (mat.find()) {
                        printStream.printf("\t%d: %s%n", reader.getLineNumber(), line);
                    }
                } else {
                    if (line.contains(grepExpression)) {
                        if (notPrinted) {
                            printStream.println(filePath.toAbsolutePath());
                            notPrinted = false;
                        }
                        printStream.printf("\t%d: %s%n", reader.getLineNumber(), line);
                    }
                }
            }
        }
    }
}