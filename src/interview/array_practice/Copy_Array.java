package interview.array_practice;

import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        String[] array1 = {"Monday", "Tuesday", "Wednesday"};

        //Arrays.copyOfRange give a range start from index of 0 -> array size
        String[] array2 = Arrays.copyOfRange(array1, 0, array1.length);

        System.out.println("Array1 = " + Arrays.toString(array1));
        System.out.println("Array2 = " + Arrays.toString(array2));


        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = Arrays.copyOfRange(numbers1, 0, numbers1.length);

        System.out.println("numbers1 = " + Arrays.toString(numbers1));
        System.out.println("numbers2 = " + Arrays.toString(numbers2));

    }
}
