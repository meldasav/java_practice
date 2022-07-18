import java.util.Scanner;

public class Practice05 {
    /**
     * Write a program that generates a random number between 0 and 50 (both 0 and 50 are included)
     * Print true if number is in between 10 and 25 (10 and 25 included)
     */
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 51) + 1;
        System.out.println(randomNumber >= 10 && randomNumber <= 25);

        System.out.println("TASK 2");
        /**
         * Write a program that generates a random number between 1 and 100 (both 1 and 100 are included)
         * Find which quarter and half is number in
         * 1st quarter is 1-25
         * 2nd quarter is 26-50
         * 3rd quarter is 51-75
         * 4th quarter is 76-100
         * 1st half is 1-50
         * 2nd half is 51-100
         */
        int randomNumber2 = (int) (Math.random() * 101) + 1;
        System.out.println(randomNumber2);
        if (randomNumber2 <= 50) {
            System.out.println(randomNumber2 + " is in the 1st half");
            if (randomNumber2 <= 26) System.out.println(randomNumber2 + " is in the first quarter");
            else System.out.println(randomNumber2 + " is in the second quarter");
        } else {
            System.out.println(randomNumber2 + " is in the 2nd half");
            if (randomNumber2 <= 75) System.out.println(randomNumber2 + " is in the 3rd quarter");
            else System.out.println(randomNumber2 + " is in the 4th quarter");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt(), num5 = scan.nextInt();
        int point = 0;
        if (num1 <= 10) {
            point += num1 * 5;
        }
        if (num2 <= 10) {
            point += num2 * 4;
        }
        if (num3 <= 10) {
            point += num3 * 3;
        }
        if (num4 <= 10) {
            point += num4 * 2;
        }
        if (num5 <= 10) {
            point += num5;
        } else {
            System.out.println("your number is not in the range");
        }
        System.out.println(point);

        System.out.println("Task 4");
        /**
         * Write a program that asks user to enter their names
         * Print out the length of name
         * Find the first character in the name and print out that
         * Find the last character in the name and print out that
         * Find the first 3 characters in the name and print out those
         * Find the last 3 characters in the name and print out those
         * Check if name starts with character A (or a) or not and print messages below
         * 	If name starts with A or a, print “You are in the club!”
         * 	If name does not start with A or a, print “Sorry, you are not in the club”
         */
        System.out.println("Please enter your name");
        String name = scan.next();
        if (!name.isEmpty()) System.out.println(name.length());
        if (name.length() > 0) {
            System.out.println(name.charAt(0));
            System.out.println(name.charAt(name.length() - 1));
        }
        if (name.length() >= 3) {
            System.out.println(name.substring(0, 2));
            System.out.println(name.substring(name.length() - 3));
        }
        if (name.toUpperCase().startsWith("A")) System.out.println("You are in the club");
        else System.out.println("Sorry, you are not in the club");

        System.out.println("please enter your address");
        String address = scan.nextLine();
        scan.nextLine();

        if (!address.isEmpty()) {
            if (address.toLowerCase().contains("chicago")) {
                System.out.println("You are in the club");
            } else if (address.toUpperCase().contains("DES PLAINES")) {
                System.out.println("You are welcome to join the club");
            }
        } else {
            System.out.println("Sorry, you will never be in the club");
        }
    }
}


