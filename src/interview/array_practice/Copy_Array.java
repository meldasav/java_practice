package interview.array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
        String[] array1 = {"Monday", "Tuesday", "Wednesday"};

        //Arrays.copyOfRange give a range start from index of 0 -> array size
        String[] array2 = Arrays.copyOfRange(array1, 0, array1.length);

        System.out.println("Array1 = " + Arrays.toString(array1));
        System.out.println("Array2 = " + Arrays.toString(array2));


        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = Arrays.copyOfRange(numbers1, 0, numbers1.length);

        System.out.println("numbers1 = " + Arrays.toString(numbers1));
        System.out.println("numbers2 = " + Arrays.toString(numbers2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and number 2 entered by user is = " + (double) (number1 + number2));
        System.out.println("The product of the given 2 number is : " + (double) (number1 * number2));
        System.out.println("The subtraction of the given number is = " + (double) (number1 - number2));
        System.out.println("The division of the given 2 numbers is = " + (float) (number1 / number2));
        System.out.println("The remainder of the given number is = " + (double) (number1 % number2));
        System.out.println("The average of the given 2 number is = " + (number1 + number2) / 2);

    }
}
