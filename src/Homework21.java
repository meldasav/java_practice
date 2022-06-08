import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


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

    public static void fizzBuzz1(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }

    public static String fizzBuzz2(int number) {
        for (int i = 0; i <= number; i++) {
            if (number % 15 == 0) return "FizzBuzz";
            else if (number % 3 == 0) return "Fizz";
            else if (number % 5 == 0) return "Buzz";
        }
        return number + "";
    }

    public static int findSumNumbers(String str) {
        int sum = 0;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if (!string.isEmpty()) sum += Integer.parseInt(string);
        }
        return sum;
    }

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

    public static String countSequenceOfCharacters(String str) {
        HashSet<String> set =new HashSet<>(Arrays.asList(str));
        String str1=Arrays.toString(set.toArray());
        int count=0;
        String result="";
        for (char c : str1.toCharArray()){
            if(c==str1.charAt(0))count++;
            result+= c + (count+"");
        }
           return result;
        }



}