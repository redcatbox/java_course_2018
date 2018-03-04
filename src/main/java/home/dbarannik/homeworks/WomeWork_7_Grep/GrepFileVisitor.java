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

public class GrepFileVisitor extends SimpleFileVisitor<Path> {
    private final PrintStream printStream;


    public GrepFileVisitor(PrintStream printStream) {
        this.printStream = printStream;
    }

    public FileVisitResult visitFile(Path filePath, String grepExpression) throws IOException {
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(filePath));) {
            String line;
            boolean notPrinted = true;
            boolean isRegex = isExpressionRegex(grepExpression);
            Pattern pat = Pattern.compile(grepExpression);
            Matcher mat;

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
        return FileVisitResult.TERMINATE;
    }

    private static boolean isExpressionRegex(String grepExpression) {
        // Get is it a text or regex
        return grepExpression.charAt(0) == '^' & grepExpression.charAt(grepExpression.length() - 1) == '$';
    }
}