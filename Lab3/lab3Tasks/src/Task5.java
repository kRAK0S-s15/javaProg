import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random randNum = new Random();
        int count = 0;
        int min = 101;
        int max = 0;

        while (count < 10) {
            int n = randNum.nextInt(100) + 1;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            System.out.print(n + " ");
            count++;
        }

        System.out.println("\nSmallest: " + min);
        System.out.println("Largest: " + max);
    }
}