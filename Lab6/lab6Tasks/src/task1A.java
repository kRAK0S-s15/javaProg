public class task1A {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                int greater = array[i];
                array[i] = array[i+1];
                array[i+1] = greater;
            }
            System.out.print(array[i] + " ");
        }
    }
}