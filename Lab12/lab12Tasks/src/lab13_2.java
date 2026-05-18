import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab13_2 {
    public static void main(String[] args) {

        Set<String> employees = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of unique employees: " + employees.size());

        System.out.println("\nStandard for loop:");
        Object[] array = employees.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
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

        String testEmployee1 = "Hot-dog Żabkowski";
        System.out.println("\nContains 'Hot-dog Żabkowski'? " + employees.contains(testEmployee1));

        String testEmployee2 = "Emma Brown";
        System.out.println("\nContains 'Emma Brown'? " + employees.contains(testEmployee2));
    }
}