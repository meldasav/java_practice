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
        findSmallestLargest1(new int[]{10, 7, 7, 10, -3, 10, -3});
        findSmallestLargest1(new int[]{});
    }

    public static void findSmallestLargest1(int[] numbers) {
        if (numbers.length == 0) System.out.println("Array is empty");
        else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number < min) min = number;
                if (number > max) max = number;
            }
            System.out.println("Smallest number is : " + min);
            System.out.println("Largest number is : " + max);
        }
    }
}