package home.dbarannik.homeworks.WomeWork_7_Grep;

import home.dbarannik.ConsoleReader.ConsoleReader;

import java.io.FileNotFoundException;
import java.nio.file.InvalidPathException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class GrepReader {
    ConsoleReader consoleReader;

    public GrepReader(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }

    public Path getFilePath() throws FileNotFoundException, InvalidPathException {
        String specifiedPath = consoleReader.getInputString();
        Path path = Paths.get(specifiedPath);

        if (Objects.equals(specifiedPath, "") || path == null) {
            throw new InvalidPathException(specifiedPath, specifiedPath);
        }

        if (Files.notExists(path)) {
            throw new FileNotFoundException();
        }

        return path;
    }

    public String getGrepExpression() throws Exception {
        String grepExpression;
        grepExpression = consoleReader.getInputString();

        if (Objects.equals(grepExpression, "")) {
            throw new Exception();
        }

        return grepExpression;
    }
}
