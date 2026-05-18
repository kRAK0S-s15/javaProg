import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class lab15_1 {
    public static void main(String[] args) {

        int[] array = new Random()
                .ints(10, 1, 101)
                .toArray();

        Arrays.stream(array)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}