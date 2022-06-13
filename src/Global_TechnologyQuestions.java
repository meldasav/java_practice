public class Global_TechnologyQuestions {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(new int[]{5, 2, 7, 9, 6}));
        System.out.println(reverseString("meldasav"));
        fibonacciNumber(7);
    }

    //TODO  Find Sum of Elements in Array
    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //TODO Create a method to reverse a String
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString().trim();
    }

    //TODO Create a method to find a Fibonacci number

    public static void fibonacciNumber(int number) {
        int num1 = 0, num2 = 1, num3 = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            sb.append(num1).append("-");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
