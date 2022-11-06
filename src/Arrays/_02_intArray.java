package Arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {
        System.out.println(sumOfLast5(new int[]{1, 2, 3, 4, 5, 1, 2}));
        shortestLongest(new String[]{"RED", "BLUE", "YELLOW"});


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

    public static int sumOfLast5(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i > array.length - 6; i--) {
            sum += array[i];
        }
        return sum;
    }

    public static void shortestLongest(String[] array) {
        String shortest = array[0];
        String longest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (longest.length() < array[i].length()) {
                longest = array[i];
            }
            if (shortest.length() > array[i].length()) {
                shortest = array[i];
            }
        }
        System.out.println("Longest : " + longest);
        System.out.println("Shortest : " + shortest);
    }
}
