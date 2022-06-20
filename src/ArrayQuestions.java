import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayQuestions {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington DC");
        map.put("Turkey", "Ankara");
        map.put("UK", "London");
        map.forEach((k, v) -> System.out.println("key = " + k + " value= " + v));
        countCharacter("test");
        countCharacter1("tester");
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}, 10));
        System.out.println(Arrays.toString(shiftZeroToRight(new int[]{1, 0, 2, 0, 3, 0, 0})));
        System.out.println(Arrays.toString(shiftArrayToLeft(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(rightRotateArrayBy3(new int[]{1, 2, 3, 4, 5})));
    }

    public static void countCharacter(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    public static void countCharacter1(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> enter : map.entrySet()) {
            System.out.println(enter);
        }
    }

    //Find the missing number in array
    public static int findMissingNumber(int[] num, int totalCount) {
        /**
         * 1+2+3+5=11
         * 1+2+3+4+5=15
         * formula=totalNumberOfElements(totalNumberOfElements+1)/2
         * 5(5+1)/2=15;
         * 15-11=4;
         */
        int expSum = totalCount * (totalCount + 1) / 2;//formula
        int actualSum = 0;
        for (int i : num) {
            actualSum += i;
        }
        return expSum - actualSum;
    }

    public static int[] shiftZeroToRight(int[] a) {
        if (a.length == 1) return a;
        else {
            int[] array = new int[a.length];
            int count = 0;
            for (int number : a) {
                if (number != 0) array[count++] = number;
            }
            return array;
        }
    }

    public static int[] shiftArrayToLeft(int[] array) {
        int lastNumber = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastNumber;
        return array;

    }

    public static int[] rightRotateArrayBy3(int[] array) {
        int n = 3;
        for (int j = 1; j <= n; j++) {
            int last = array[array.length-1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last;
        }
        return array;
    }
}