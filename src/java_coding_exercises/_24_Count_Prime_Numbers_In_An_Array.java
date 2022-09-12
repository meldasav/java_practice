package java_coding_exercises;

public class _24_Count_Prime_Numbers_In_An_Array {
    public static void main(String[] args) {
  countPrime(7);
    }
    public static void countPrime(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }
            if (count == 2) System.out.println("It is a prime number");
            else System.out.println("It is not a prime number");

        } else {
            System.out.println("Number is not a prime number");
        }
    }
}
