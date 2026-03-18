import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter height in meters: ");
    float heightKhraneka = sc.nextFloat();

    System.out.print("Enter weight in kilograms: ");
    float weightKhraneka = sc.nextFloat();

    float bmi = (float) (weightKhraneka / Math.pow(heightKhraneka, 2));
    System.out.printf("BMI: %.2f%n", bmi);

    String category;
    if (bmi < 16.00f) {
      category = "starvation";
    } else if (bmi <= 16.99f) {
      category = "emaciation";
    } else if (bmi <= 18.49f) {
      category = "underweight";
    } else if (bmi <= 22.99f) {
      category = "normal, low range";
    } else if (bmi <= 24.99f) {
      category = "normal, high range";
    } else if (bmi <= 27.49f) {
      category = "overweight, low range";
    } else if (bmi <= 29.99f) {
      category = "overweight, high range";
    } else if (bmi <= 34.90f) {
      category = "1st degree obesity";
    } else if (bmi <= 39.90f) {
      category = "2nd degree obesity";
    } else {
      category = "3rd degree obesity";
    }

    System.out.println("Category: " + category);

    sc.close();
  }
}