package java_coding_exercises;

public class _16_Print_Numbers_From_1_To_Given_Fizz_Buzz {
    public static void main(String[] args) {
        fizzBaz(15);
    }

    /**
     * Write a method that takes a positive int argument and prints all the numbers from 1 to given number
     * However, it prints “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
     * and “FizzBuzz” for the numbers divided by both 3 and 5
     */
    public static void fizzBaz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Buzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else System.out.println(i);

        }
    }
}
