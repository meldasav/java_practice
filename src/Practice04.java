import java.util.*;

public class Practice04 {
    public static void main(String[] args) {
        System.out.println(greatestNumber(-1, -2, -4));
        System.out.println(smallestNumber(1, -10, 8));
        System.out.println(middleNumber(5, 10, 6));
        System.out.println(reversed("melda"));
        System.out.println(removeDigit1("melda1983"));
        System.out.println(removeSpace("java   is     fun   "));
        System.out.println(removeLetter1("java 4  is1222333     fun   "));
        System.out.println(removeSpecials("The price = 100.50$"));
        System.out.println(noVowels("   The price = 100.50$"));
        System.out.println(noConsonants("Hello World!"));
        System.out.println(countPrimes(new int[]{7, 14, 11, 23, 17, -1, -4}));
        System.out.println(Arrays.toString(removeDuplicateNumbers(new int[]{0, 5, 4, 0, 0})));
        System.out.println(Arrays.toString(removeDuplicateStrings1(new String[]{"foo", "bar", "foo", "123", "bar"})));
        System.out.println(isPalindrome1("Madam"));
        System.out.println(isAnagram("cinema", "iceman"));
        System.out.println(removeDuplicateNumbers(new ArrayList<>(Arrays.asList(0, 5, 4, 0, 0))));
        System.out.println(removeDuplicateStrings(new ArrayList<>(Arrays.asList("foo", "bar", "foo", "123", "bar"))));
        getFibonacciSeries(10);
        System.out.println(countSpaces("    java is fun to learn"));
        System.out.println(countLetters("melda1983"));
        System.out.println(countSpecials("melda  #@&1983"));
        System.out.println(countWords("    melda sav 1983   "));
        System.out.println(removeExtraSpaces("    melda     sav     1983   "));
        System.out.println(reverseEachWord("java is fun"));
        System.out.println(maxValue(new int[]{-5, 4, 1, 10, 2}));
        System.out.println(secondMaxValue(new int[]{-5, 4, 1, 10, 2}));
        System.out.println(secondMinValue(new int[]{-5, 4, 1, 10, 2}));
        System.out.println(factorial(5));
        System.out.println(Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2})));
    }

    public static int greatestNumber(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        return set.last();
    }

    public static int smallestNumber(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        return c;
    }

    public static int middleNumber(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(1);
    }

    public static String reversed(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String removeDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String removeDigit1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String removeSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String removeLetter(String str) {
        return str.replaceAll("[A-Za-z]", "").trim();
    }

    public static String removeLetter1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String removeSpecials(String str) {
        return str.replaceAll("[^A-Za-z0-9 ]", "").trim();
    }

    public static String noVowels(String str) {
        return str.toLowerCase().replaceAll("[aeoui]", "").trim();
    }

    public static String noConsonants(String str) {
        return str.toLowerCase().replaceAll("[a-z&&[^aeoui]]", "").trim();
    }

    public static int countPrimes(int[] arr) {
        int prime = 0;
        for (int i : arr) {
            if (i < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) prime++;
        }
        return prime;
    }

    public static int[] removeDuplicateNumbers(int[] numbers) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i : numbers) {
            if (!set.contains(i)) set.add(i);
        }
        int[] array = new int[set.size()];
        for (int j = 0; j < set.size(); j++) {
            array[j] = set.get(j);

        }
        Arrays.sort(array);
        return array;
    }

    public static String[] removeDuplicateStrings(String[] strings) {
        HashSet<String> set = new HashSet<>(Arrays.asList(strings));
        ArrayList<String> list = new ArrayList<>(set);
        String[] strings1 = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings1[i] = list.get(i);
        }
        return strings1;
    }

    public static String[] removeDuplicateStrings1(String[] string) {
        ArrayList<String> set = new ArrayList<>();
        for (String i : string) {
            if (!set.contains(i)) set.add(i);
        }
        String[] array = new String[set.size()];
        for (int j = 0; j < set.size(); j++) {
            array[j] = set.get(j);
        }
        return array;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
            if (str.equals(sb.toString())) return true;
        }
        return false;
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        return new ArrayList<>(new TreeSet<>(numbers));
    }

    public static ArrayList<String> removeDuplicateStrings(ArrayList<String> strings) {
        return new ArrayList<>(new HashSet<>(strings));
    }

    public static void getFibonacciSeries(int number) {
        int n1 = 0, n2 = 1, n3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    public static int countSpaces(String str) {
        str = str.trim();
        if (!str.isEmpty()) {
            int countSpace = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isSpaceChar(str.charAt(i))) countSpace++;
            }
            return countSpace;
        }
        return 0;
    }

    public static int countLetters(String str) {
        str = str.trim();
        if (!str.isEmpty()) {
            int countLetters = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) countLetters++;
            }
            return countLetters;
        }
        return 0;
    }

    public static int countSpecials(String str) {
        int countSpecial = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) countSpecial++;
        }
        return countSpecial;
    }

    public static int countWords(String str) {
        return str.trim().split(" ").length;
    }

    public static String removeExtraSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static int maxValue(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : numbers) set.add(i);
        return set.last();
    }

    public static int secondMaxValue(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : numbers) set.add(i);
        return new ArrayList<>(set).get(set.size() - 2);
    }

    public static int secondMinValue(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : numbers) set.add(i);
        return new ArrayList<>(set).get(1);
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int[] factorial(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else {
                int factorial = numbers[i];
                for (int j = 2; j < factorial; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }
}