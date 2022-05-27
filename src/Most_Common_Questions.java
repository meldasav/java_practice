import java.util.*;

public class Most_Common_Questions {
    public static void main(String[] args) {
        System.out.println(findSecondMax(new ArrayList<>(Arrays.asList(1,3,4,5,6))));
        System.out.println(minNumber(10, 8, 8));
        System.out.println(replaceFirstLastChar("java is fun"));
        /**
         * Ask user enter a number.If number less than 10 stop the program
         * if the number is more than 10 keep ask user enter a number
         */
        Scanner scan = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Please enter a number");
            value = scan.nextInt();
        }
        while (!(value < 10));
        System.out.println("End of the program!!!");

        /**
         *Ask user to enter a name if name is start with m finish the program
         * IF the name does not start with m keep asking user enter a name
         */
        String name = "";
        do {
            System.out.println("Please enter your name");
            name = scan.next();
        }
        while (!(name.toLowerCase().startsWith("m")));
        System.out.println("End of the program");
        /**
         * aSK user his favorite color use switch statement if color matches with condition
         * print proper message
         */
        System.out.println("What is your favorite color");
        String color = scan.next();

        switch (color) {
            case "red":
                System.out.println("your favorite color is red");
                break;
            case "blue":
                System.out.println("your favorite color is blue");
                break;
            case "pink":
                System.out.println("your favorite color is pink");
                break;
            default:
                throw new RuntimeException("you don't have favorite color");
        }
    }

    //Write a method takes ant int[] and return a new Array with all duplicates removed
    //Create a hashset hastSet does not allow dup.add the element with loop to hash set
    //create a new array and put the number hashSet to array with loop
    public static int[] removeDuplicates(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : numbers) set.add(i);
        int[] array = new int[set.size()];
        int index = 0;
        for (int number : set) {
            array[index++] = number;
        }
        return array;
    }

    //find prime numbers
    //takes 2 int argument return list find primes
    public static List<Integer> prime(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 1) list.add(i);
        }
        return list;
    }

    //write a method takes string and return string back first and last char replace
    public static String replaceFirstLastChar(String str) {
        str = str.trim();
        if (str.length() < 2) return "";
        else {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
    }

    public static int minNumber(int a, int b, int c) {
        if (a == b || b == c) return b;
        else if (a == c) return c;

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }

    public static int findMinNumber(ArrayList<Integer> numbers) {
        TreeSet<Integer> set = new TreeSet<>(numbers);
        return set.first();
    }

    public static int findSecondMax(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) max = number;
        }
        for (int number : numbers) {
            if (number > secondMax && number != max) secondMax = number;
        }
        return secondMax;
    }
}