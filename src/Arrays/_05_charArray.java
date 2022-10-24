package Arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        char[] c = {'#', '$', '5', 'A', 'b', 'H'};
        for (char character : c) System.out.println(character);
        System.out.println(Arrays.toString(c));
        System.out.println("Size of the array is " + c.length);

        //Print each element if it is letter
        for (char c1 : c) {
            if (Character.isLetter(c1)) System.out.println(c1);
        }
        int countUpper = 0;
        for (char c1 : c) {
            if (Character.isUpperCase(c1)) countUpper++;
        }
        System.out.println(countUpper);

        //count even
        int[] array = {0, -5, 2, 10, 5, 2, -1, 0};
        int countEven = 0;
        for (int c1 : array) {
            if (c1 % 2 == 0) countEven++;
        }
        System.out.println(countEven);
    }

}
