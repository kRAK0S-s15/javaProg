import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class lab13_4 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        Collections.sort(employees, Collections.reverseOrder());

        System.out.println("Number of employees: " + employees.size());

        System.out.println("\nStandard for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\nFor-each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nIterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}