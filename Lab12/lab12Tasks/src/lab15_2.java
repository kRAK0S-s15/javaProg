import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class lab15_2 {

    static class Student {

        private String surname;
        private String name;
        private int score;

        public Student(String surname, String name, int score) {
            this.surname = surname;
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return surname + " " + name + " (" + score + ")";
        }
    }

    public static ArrayList<Student> loadStudents(String fileName) {

        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(fileName),
                                     StandardCharsets.UTF_16))) {

            String line;
            boolean skipHeader = true;

            while ((line = reader.readLine()) != null) {

                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");

                int score = Integer.parseInt(parts[parts.length - 1]);

                String surname = parts[0];
                String name = parts[1];

                students.add(new Student(surname, name, score));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return students;
    }

    public static void main(String[] args) {

        ArrayList<Student> students = loadStudents("studentsEN.txt");

        System.out.println("Students with grade 5:");
        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);

        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);

        System.out.println("\nAverage score: " + average);

        long count = students.stream()
                .filter(s -> s.getScore() == 5)
                .count();

        System.out.println("\nNumber of students with grade 5: " + count);
    }
}
