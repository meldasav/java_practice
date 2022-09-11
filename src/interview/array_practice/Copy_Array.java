package interview.array_practice;

import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        String[] array1 = {"Monday", "Tuesday", "Wednesday"};
        String[] array2 = Arrays.copyOfRange(array1, 0, array1.length);

        System.out.println("Array1 = " + Arrays.toString(array1));
        System.out.println("Array2 = " + Arrays.toString(array2));
    }
}
