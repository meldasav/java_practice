import java.util.*;
import java.util.stream.IntStream;

public class Homework22 {
    public static void main(String[] args) {
        System.out.println(">>>>>>>TASK 1<<<<<<<<");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(">>>>>>>TASK 2<<<<<<<<");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));
        System.out.println(">>>>>>>TASK 3<<<<<<<<");
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(">>>>>>>TASK 4<<<<<<<<");
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf_3(3));
        System.out.println(isPowerOf_3(81));
        System.out.println(">>>>>>>TASK 5<<<<<<<<");
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{}));


    }

    //TASK 1
    public static int[] fibonacciSeries1(int n) {
        int[] array = new int[n];
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < array.length; i++) {
            array[i] = num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return array;
    }

    // TASK1 SALIH SOLUTION
    public static int[] fibonacciSeries(int n) {
        /*
          int[] fib;
            if (n >= 0)fib = new int[n];
            else fib = new int[0];
         */
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

//        fib[2] = fib[1] + fib[0];
//        fib[3] = fib[2] + fib[1];
//        fib[4] = fib[3] + fib[2];
        // n = 4 ==> [0, 1, 1, 2]
        for (int i = 0; i < n - 2; i++) {
            // n = 4
            // i = 0 => 3rd number is found
            // i = 1 => 4th number is found
            fib[i + 2] = fib[i + 1] + fib[i];
        }
        return fib;
    }

    //TASK 2
    public static int fibonacciSeries2(int n) {
        int[] array = new int[n];
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < array.length; i++) {
            array[i] = num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return array[array.length - 1];
    }

    //TASK2 SALIH SOLUTION
    public static int fibonacciSeries3(int n) {
        return fibonacciSeries1(n)[n - 1];
    }
    //TASK 3

    public static int[] findUniques1(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) list.add(array1[i]);
            else contains = false;

        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    // TASK 3 Jonathan Solution
    public static int[] findUniques(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray();
    }

    //TASK 4
    public static boolean isPowerOf3(int number) {
        return number == Math.pow(3, Math.round(Math.log(number) / Math.log(3)));
    }

    //TASK 4
    public static boolean isPowerOf_3(int number) {
        if (number < 1) return false;
        double number1 = number;
        while (number1 % 3 == 0) {
            number1 /= 3;
        }
        return number1 == 1.0;
    }

    //TASK 5
    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) list.add(num);
            ArrayList<Integer> newListWithDuplicate = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) newListWithDuplicate.add(list.get(i));
                }
                Collections.sort(newListWithDuplicate);
            }
            return newListWithDuplicate.get(newListWithDuplicate.size() - 1);
        }
    }

}