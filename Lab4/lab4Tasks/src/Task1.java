import java.util.Scanner;

public static class RectangleArea {
    private float sideA;
    private float sideB;
    private float area;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A: ");
        sideA = sc.nextFloat();
        System.out.print("Enter side B: ");
        sideB = sc.nextFloat();
    }

    public void computeField() {
        area = sideA * sideB;
    }

    public void fieldDisplay() {
        System.out.printf("Side A: %.2f%n", sideA);
        System.out.printf("Side B: %.2f%n", sideB);
        System.out.printf("Rectangle area: %.2f%n", area);
    }
}

void main() {
    RectangleArea rectangle = new RectangleArea();

    rectangle.getData();
    rectangle.computeField();
    rectangle.fieldDisplay();
}
