public class Lab9_2 {

    public static class ExceptionGenerator {

        public void generateException(int value) {
            if (value == 1) {
                int result = 10 / 0;
            } else if (value == 2) {
                int[] arr = new int[3];
                System.out.println(arr[5]);
            } else {
                // No exception
                System.out.println("No exception occurred.");
            }
        }
    }

    public static void main(String[] args) {

        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.generateException(3);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } finally {
            System.out.println("Finally block happened.");
        }
    }


}