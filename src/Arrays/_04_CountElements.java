package Arrays;

public class _04_CountElements {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;
        for (int number : numbers) {
            if (number < 0) countNegative++;
            else if (number > 0) countPositive++;
            else countZero++;
        }
        System.out.println(countNegative);
        System.out.println(countPositive);
        System.out.println(countZero);
    }
}
