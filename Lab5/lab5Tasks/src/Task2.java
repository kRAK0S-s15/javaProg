import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
    }
}