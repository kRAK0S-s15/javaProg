public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - i;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}