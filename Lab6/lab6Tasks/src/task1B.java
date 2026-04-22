import java.util.Arrays;

public class task1B {
    public static void main(String[] args) {
        int counter = 0;
        boolean toSort = true;
        //int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i < array.length && toSort ; i++){
            toSort = false;
            counter++;
            for (int j = 0; j < array.length - i; j++){
                counter++;
                if (array[j] > array[j+1]) {
                    counter++;
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greater;
                    toSort = true;
                }
            }
        System.out.println(Arrays.toString(array));
        }
    System.out.println(counter);
    }
}