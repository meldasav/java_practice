package exceptions;

import java.util.Scanner;

public class try_catch_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter 2 numbers");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            while (number1 == 0) {
                System.out.println("Zero is not allowed.Enter another number");
                number1 = scanner.nextInt();
            }
            System.out.println(number1 / number2);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("End of program");
        }

        int[] array = {1, 2, 3, 4};

        try {
            int result = array[6] * 5;
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("End of program");
        }
    }
}
