package home.dbarannik.homeworks.HomeWork_9;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeesFileReader {
    private Path filePath;
    private String separator;

    public EmployeesFileReader(Path filePath, String... params) {
        this.filePath = filePath;
        separator = params[0];
    }

    public List<Employee> readEmployeesFile() {
        List<Employee> list = new ArrayList<>();
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] params = line.split(separator);
                LocalDate endDate = null;

                if (!params[7].equals("null")) {
                    endDate = LocalDate.parse(params[7]);
                }

                list.add(new Employee(
                        params[0],
                        params[1],
                        params[2],
                        LocalDate.parse(params[3]),
                        Integer.parseInt(params[4]),
                        Sex.valueOf(params[5]),
                        LocalDate.parse(params[6]),
                        endDate,
                        Double.parseDouble(params[8])
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
