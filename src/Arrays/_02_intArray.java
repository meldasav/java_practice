package Arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {
        System.out.println(sumOf3(new int[]{1,2,3,4,5}));


        int[] array = {0, -5, 2, 10, 5, 2, -1, 0};
        System.out.println(Arrays.toString(array));

        for (int arr : array) System.out.println(arr);

        Object[] numbers = {5.5, 6, 10.3, 25};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        for (Object number : numbers) System.out.println(number);
    }

    public static int sumOf3(int[] array) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += array[i];
        }
        return sum;
    }
}
