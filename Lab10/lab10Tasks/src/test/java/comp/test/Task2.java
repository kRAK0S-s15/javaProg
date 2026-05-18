package comp.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2 {

    private File inputFile;
    private File outputFile;

    @BeforeEach
    void setUp() throws Exception {
        inputFile = Files.createTempFile("students", ".txt").toFile();
        outputFile = Files.createTempFile("result", ".txt").toFile();

        List<String> data = List.of(
                "Anna Kowalska 5",
                "Jan Nowak 4",
                "Maria Zielinska 5",
                "Piotr Adamski 3"
        );

        Files.write(inputFile.toPath(), data);
    }

    @Test
    void testFilterStudentsWithGradeFive() throws Exception {
        StudentGradeFilter.filterStudentsWithGradeFive(inputFile, outputFile);

        List<String> result = Files.readAllLines(outputFile.toPath());
        List<String> expected = List.of(
                "Anna Kowalska 5",
                "Maria Zielinska 5"
        );

        assertEquals(expected, result);
    }
}
