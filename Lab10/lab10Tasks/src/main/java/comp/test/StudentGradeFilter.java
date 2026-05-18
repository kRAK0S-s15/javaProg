package comp.test;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;

public class StudentGradeFilter {

    public static void filterStudentsWithGradeFive(File inputFile, File outputFile) throws IOException {
        Pattern pattern = Pattern.compile(".*\\b5\\b.*");

        List<String> lines = Files.readAllLines(inputFile.toPath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                if (pattern.matcher(line).matches()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}