import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        float a = sc.nextFloat();

        System.out.print("Enter b: ");
        float b = sc.nextFloat();

        System.out.print("Enter c: ");
        float c = sc.nextFloat();

        float x1 = Float.NaN;
        float x2 = Float.NaN;

        if (a == 0f) {
            if (b == 0f) {
                if (c == 0f) {
                    System.out.println("Infinitely many solutions.");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                x1 = -c / b;
                System.out.printf("a: %.2f, b: %.2f, c: %.2f%n", a, b, c);
                System.out.printf("x1: %.2f%n", x1);
            }
            sc.close();
            return;
        }

        float delta = b * b - 4f * a * c;
        int rootsCount;
        if (delta < 0f) {
            rootsCount = 0;
        } else if (delta == 0f) {
            rootsCount = 1;
        } else {
            rootsCount = 2;
        }

        switch (rootsCount) {
            case 0:
                System.out.printf("a: %.2f, b: %.2f, c: %.2f%n", a, b, c);
                System.out.println("No real roots.");
                break;
            case 1:
                x1 = -b / (2f * a);
                System.out.printf("a: %.2f, b: %.2f, c: %.2f%n", a, b, c);
                System.out.printf("x1: %.2f%n", x1);
                break;
            case 2:
                float sqrtDelta = (float) Math.sqrt(delta);
                x1 = (-b - sqrtDelta) / (2f * a);
                x2 = (-b + sqrtDelta) / (2f * a);
                System.out.printf("a: %.2f, b: %.2f, c: %.2f%n", a, b, c);
                System.out.printf("x1: %.2f, x2: %.2f%n", x1, x2);
                break;
        }

        sc.close();
    }
}