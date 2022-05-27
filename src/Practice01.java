import java.text.SimpleDateFormat;
import java.util.*;

public class Practice01 {
    public static void main(String[] args) {
        String word = "Chicago is nice city";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : word.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else {
                int count = map.get(c);
                map.put(c, count + 1);
            }
        }
        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            System.out.println(c);
        }


        //Find your current age
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int DOB = 1983;
        System.out.println("You are " + (currentYear - DOB));

        firstPositiveNegative(new int[]{0, -4, -7, 0, 5, 10, 45, -7, 0});
        String[] words1 = {"abc", "foo", "bar"};
        List<String> reversed = new ArrayList<>();
        for (int i = words1.length - 1; i >= 0; i--) {
            reversed.add(words1[i]);
        }
        System.out.println(Arrays.toString(reversed.toArray()));//[bar, foo, abc]


        System.out.println(contains2Or3(new int[]{1, 9, 3, 5, 6}));
        //check if search results more than 0
        String googleSearch = "About 182,000,000 results (0.52 seconds) ";
        String split = googleSearch.split(" ")[1].replaceAll(",", "");
        System.out.println((Long.parseLong(split) > 0) ? "Results more than 0" : "Results less than 0");

        //find duplicates int[]
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !sb.toString().contains(numbers[i] + "")) {
                    sb.append(numbers[i]).append(",");
                }
            }
        }
        System.out.println((sb.length() == 0) ? "There is no dup" : sb.substring(0, sb.length() - 1));
    }

    //create method if array contains 2 or 3
    public static boolean contains2Or3(int[] numbers) {
        Arrays.sort(numbers);
        return Arrays.binarySearch(numbers, 2) >= 0 || Arrays.binarySearch(numbers, 3) >= 0;
    }

    //find the first positive and first negative number
    public static void firstPositiveNegative(int[] numbers) {
        boolean firstPos = false;
        boolean firstNeg = false;
        for (int number : numbers) {
            if (number > 0 && !firstPos) {
                System.out.println("First positive number is = " + number);
                firstPos = true;

            } else if (number < 0 && !firstNeg) {
                System.out.println("First negative number is = " + number);
                firstNeg = true;
            }
        }
        if (!firstNeg) System.out.println("There is no negative number");
        if (!firstPos) System.out.println("There is no positive number");
    }


}

