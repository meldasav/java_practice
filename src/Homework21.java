import java.util.*;


public class Homework21 {
    public static void main(String[] args) {
        System.out.println("^^^^^^^TASK1^^^^^^^");
        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);
        System.out.println("^^^^^^^TASK2^^^^^^^");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));
        System.out.println("^^^^^^^TASK3^^^^^^^");
        System.out.println(findSumNumbers("abc$”"));
        System.out.println(findSumNumbers("a1b4c  6#”"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525”"));
        System.out.println("^^^^^^^TASK4^^^^^^^");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));
        System.out.println("^^^^^^^TASK5^^^^^^^");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));


    }

    // TASK1
    public static void fizzBuzz1(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }

    //TASK2
    public static String fizzBuzz2(int number) {
        for (int i = 0; i <= number; i++) {
            if (number % 15 == 0) return "FizzBuzz";
            else if (number % 3 == 0) return "Fizz";
            else if (number % 5 == 0) return "Buzz";
        }
        return number + "";
    }

    //TASK3
    public static int findSumNumbers(String str) {
        int sum = 0;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if (!string.isEmpty()) sum += Integer.parseInt(string);
        }
        return sum;
    }

    //TASK4
    public static int findBiggestNumber(String str) {
        int max = Integer.MIN_VALUE;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if (!string.isEmpty()) {
                if (Integer.parseInt(string) > max) max = Integer.parseInt(string);
                return max;
            }
        }
        return 0;
    }

    //TASK5
    public static String countSequenceOfCharacters1(String str) {
        StringBuilder str1 = new StringBuilder();
        for (char c : noDup(str.toCharArray())) {
            str1.append(c).append(countDup(str, c));
        }
        return str1.toString();
    }

    public static int countDup(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) count++;
        }
        return count;
    }

    public static char[] noDup(char[] array) {
        StringBuilder arr = new StringBuilder();
        for (char c : array) {
            if (arr.toString().indexOf(c) < 0) {
                arr.append(c);
            }
        }
        return arr.toString().toCharArray();
    }
    public static String countSequenceOfCharacters(String string){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i < string.length()-1 && string.charAt(i) == string.charAt(i+1)){
                count ++;
            }
            else {
                count ++;
                result.append(count).append(string.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }

}





