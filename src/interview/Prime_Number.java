package interview;

public class Prime_Number {
    public static void main(String[] args) {
        primeNumber(10);
    }
//3 1 3

    public static void primeNumber(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }
            if (count == 2) System.out.println("prime number");
            else System.out.println("it is not a prime");


        } else {
            System.out.println("is not a prime number");
        }
    }
}