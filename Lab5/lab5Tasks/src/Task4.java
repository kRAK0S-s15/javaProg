import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String a = s1.concat(s2);
        String b = s2.concat(s1);
        System.out.println(a.equals(b));
    }
}