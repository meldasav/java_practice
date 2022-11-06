package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _22_FindFirstPositiveAndNegative {
    public static void main(String[] args) {
        firstPositiveNegative(new ArrayList<>(Arrays.asList(2, 2, 3, -3, 7)));
        System.out.println(contain2Or3());
    }

    public static void firstPositiveNegative(ArrayList<Integer> numbers) {
        boolean firstPositive = false;
        boolean firstNegative = false;
        for (Integer number : numbers) {
            if (number > 0 && !firstPositive) {
                firstPositive = true;
                System.out.println(number);
            } else if (number < 0 && !firstNegative) {
                firstNegative = true;
                System.out.println(number);
            }
            if (firstPositive && firstNegative) break;
        }
    }

    public static boolean contain2Or3() {
        int number1 = (int) (Math.random() * 10) + 1;
        int number2 = (int) (Math.random() * 10) + 1;
        int number3 = (int) (Math.random() * 10) + 1;
        int number4 = (int) (Math.random() * 10) + 1;
        int number5 = (int) (Math.random() * 10) + 1;
        ArrayList<Integer> numS = new ArrayList<>(Arrays.asList(number1, number2, number3, number4, number5));
        return numS.contains(2) || numS.contains(3);
    }
}