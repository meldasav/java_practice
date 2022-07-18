import java.util.Scanner;

public class Java08 {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sb.append(i).append("-");
            }
        }
        System.out.print(sb.substring(0, sb.length() - 1));

        System.out.println("TASK 2");
        StringBuilder sb1 = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) {
                sb1.append(i).append("-");
            }
        }
        System.out.println(sb1.substring(0, sb1.length() - 1));
        System.out.println("TASK 3");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) {
                sb2.append(i).append("-");
            }
        }
        System.out.println(sb2.substring(0, sb2.length() - 1));

        System.out.println("Task4");
        int square;
        for (int i = 0; i <= 7; i++) {
            square = i * i;
            System.out.println("The square of " + i + " is " + square);
        }
        System.out.println("task 5");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("task6");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        System.out.println("Please enter your full name");
        String name = scan.nextLine();

        name = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i') count++;
        }
        System.out.println(count);
    }
}
