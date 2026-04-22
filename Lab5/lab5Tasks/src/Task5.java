import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine().toLowerCase();
    String reversed = new StringBuilder(word).reverse().toString();
    System.out.println(word.equals(reversed));
  }
}