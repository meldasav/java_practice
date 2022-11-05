package Arrays;

import java.util.Arrays;

public class _11_FindSmallestLargestIntArray {
    public static void findSmallestLargest(int[] numbers) {
        if (numbers.length == 0) System.out.println("Array is Empty");
        else {
            Arrays.sort(numbers);
            System.out.println("Smallest in the array " + numbers[0]);
            System.out.println("Largest in the array " + numbers[numbers.length - 1]);
        }
    }

    public static void main(String[] args) {
        findSmallestLargest(new int[]{10, 7, 7, 10, -3, 10, -3});
        findSmallestLargest(new int[]{});
    }
}
