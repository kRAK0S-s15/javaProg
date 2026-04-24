import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab10_4 {

    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("studentsEN.txt");
            writer = new FileWriter("studentsWithGrade5.txt");

            StringBuilder line = new StringBuilder();
            int character;

            while ((character = reader.read()) != -1) {

                if (character != '\n') {
                    line.append((char) character);
                } else {
                    processLine(line.toString(), writer);
                    line.setLength(0);
                }
            }

            if (line.length() > 0) {
                processLine(line.toString(), writer);
            }

            System.out.println("File processing completed.");

        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files.");
            }
        }
    }

    private static void processLine(String line, FileWriter writer) throws IOException {
        if (line.trim().endsWith("5")) {
            writer.write(line + System.lineSeparator());
        }
    }
}