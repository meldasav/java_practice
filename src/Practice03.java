import java.util.*;

public class Practice03 {
    public static void main(String[] args) {
        System.out.println(removeExtraSpace(" "));
        System.out.println(doesContain("Pom is page object model.It stores Web elements."));
        numbersLessThan10(2, 19);
        System.out.println(longest(new String[]{"red", "blue", "purple"}));
        System.out.println((startWithA("selenium is Automation tool")));
        System.out.println(secondMax(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 3, 3, 4, 5, 5))));
        System.out.println(has2Or3(new ArrayList<>(Arrays.asList(1, 2, 1, 4))));

        int[] arr = {1, 2, 1, 3, 2, 4, 3, 5, 1, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        String sentence = "Chicago is nice city";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (Character c : sentence.toCharArray()) {
            if (map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else map1.put(c, 1);
        }
        System.out.println(map1);
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.println(entry);
        }
        //most counted word
        String[] words = {"pen", "eraser", "pencil", "pen", "123"};
        String mostCounted = "";
        int mostCountedTimes = 0;
        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            int countOfWord = 0;
            for (String s : words) {
                if (word.equals(s)) countOfWord++;
            }
            if (countOfWord > mostCountedTimes) {
                mostCounted = word;
                mostCountedTimes = countOfWord;
            }
        }
        System.out.println(mostCounted + " counted " + mostCountedTimes + " times in the array");

        //find first even and first odd
        int[] numbers = {1, 2, 3, 4, 6, 7};
        boolean isOdd = false;
        boolean isEven = false;
        for (int number : numbers) {
            if (number % 2 == 0 && !isEven) {
                isEven = true;
                System.out.println(number);
            } else if (number % 2 == 1 && !isOdd) {
                isOdd = true;
                System.out.println(number);
            }
            if (isEven && isOdd) break;
        }
        if (!isEven) System.out.println("there is no even");
        if (!isOdd) System.out.println("there is no odd number");

    }

    public static int secondMax(ArrayList<Integer> numbers) {
        TreeSet<Integer> set = new TreeSet<>(numbers);
        return new ArrayList<>(set).get(set.size() - 2);
    }

    public static boolean has2Or3(ArrayList<Integer> number) {
        //   return number.contains(2) && number.contains(3);
        int[] array = new int[number.size()];
        for (int i = 0; i < number.size(); i++) {
            array[i] = number.get(i);
        }
        Arrays.sort(array);
        return Arrays.binarySearch(array, 2) >= 0 || Arrays.binarySearch(array, 3) >= 0;
    }

    public static int startWithA(String str) {
        int count = 0;
        for (String s : str.split(" ")) {
            if (s.toLowerCase().startsWith("a")) count++;
        }
        return count;
    }

    public static String longest(String[] str) {
        String longest = "";
        for (String s : str) {
            if (s.length() > longest.length()) longest = s;
        }
        return longest;
    }

    public static void numbersLessThan10(int n1, int n2) {
        if (Math.max(n1, n2) >= 10) {
            for (int i = Math.max(n1, n2); i >= Math.min(n1, n2); i--) {
                System.out.println(i);
                if (i == 11) break;
            }
        }
    }

    public static boolean doesContain(String str) {
        return str.split("\\.")[1].contains("selenium");
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
