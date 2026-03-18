import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumberKhraneka = input.nextFloat();
        System.out.print("Enter second number: ");
        float secondNumberKhraneka = input.nextFloat();

        float sum = firstNumberKhraneka + secondNumberKhraneka;
        float difference =  firstNumberKhraneka - secondNumberKhraneka;
        float product = firstNumberKhraneka*secondNumberKhraneka;

        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        if (secondNumberKhraneka != 0f) {
            float quotient = firstNumberKhraneka / secondNumberKhraneka;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Quotient: undefined (division by zero)");

            input.close();
        }
    }
}