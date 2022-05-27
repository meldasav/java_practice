import java.util.*;

public class Practice02 {
    public static void main(String[] args) {
        System.out.println(countWords("hello world"));
        fibonacci(9);
        System.out.println(countVowels("SELENIUM is automate web browser"));
        System.out.println(countVowels(""));
        System.out.println(removeDup(new ArrayList<>(Arrays.asList("apple", "banana", "apple", "banana"))));
        System.out.println(isPalindrome1("madaM"));
        System.out.println(Arrays.toString(removeDupNumber1(new int[]{1, 1, 2, 1, 2, 3, 5, 4})));
        System.out.println(validPassword("Abcd123!"));
        System.out.println(removeName(new ArrayList<>(Arrays.asList("Melda", "kerem", "volkan"))));
        System.out.println(Arrays.toString(sumOf2Array(new int[]{1, 2, 3}, new int[]{1, 2, 4, 8})));
        System.out.println(isAnagram("LISTEN","SILENT"));
        System.out.println(reverseEachWord("java is fun"));
    }

    public static int countWords(String sentence) {
        if (sentence.isEmpty()) return 0;
        else {
            int count = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == (' ') && sentence.charAt(i + 1) != (' ')) count++;
            }
            return count;
        }
    }

    public static void fibonacci(int number) {
        StringBuilder sb = new StringBuilder();
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 0; i < number; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    public static int countVowels(String sentence) {
        if (sentence.isEmpty()) return 0;
        else {
            int count = 0;
            for (char c : sentence.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i'
                        || c == 'o' || c == 'u') count++;
            }
            return count;
        }
    }

    public static ArrayList<String> removeDup(ArrayList<String> strings) {
        // HashSet<String> set = new HashSet<>(strings);
        //   return new ArrayList<>(strings);
        return new ArrayList<>(new HashSet<>(strings));
    }

    public static ArrayList<String> removeDup1(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (list.contains(s)) {
                continue;
            }
            list.add(s);
        }
        return list;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return str.equals(sb.toString());
    }

    public static String[] removeDup(String[] str) {
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        return set.toArray(new String[0]);
    }

    public static int[] removeDupNumber(int[] numbers) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : numbers) set.add(i);
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int i : set) newArray[index++] = i;
        return newArray;
    }

    public static int[] removeDupNumber1(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            if (!list.contains(i)) list.add(i);
        }
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }

    public static int countPrime(int[] prime) {
        int count = 0;
        for (int number : prime) {
            if (number == 2 || number == 3) count++;
            else if (number > 3) {
                boolean isPrime = true;
                for (int i = 2; i < number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
        return count;
    }

    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    public static boolean validPassword(String str) {
        if (str.length() > 16 || str.contains(" ") || str.length() < 8) return false;
        else {
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean digit = false;
            boolean specials = false;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) upperCase = true;
                else if (Character.isLowerCase(c)) lowerCase = true;
                else if (Character.isDigit(c)) digit = true;
                else specials = true;
            }
            return upperCase && lowerCase && digit && specials;
        }
    }

    public static ArrayList<String> removeName(ArrayList<String> names) {
//        names.removeIf(name -> name.toLowerCase().startsWith("m"));
//        return new ArrayList<>(names);
        LinkedList<String> linkedList = new LinkedList<>(names);
        linkedList.removeIf(name -> name.toLowerCase().startsWith("m"));
        return new ArrayList<>(linkedList);
    }

    public static int[] sumOf2Array(int[] n1, int[] n2) {
        for (int i = 0; i < Math.min(n1.length, n2.length); i++) {
            if (n1.length > n2.length) n1[i] += n2[i];
            else n2[i] += n1[i];
        }
        return (n1.length > n2.length) ? n1 : n2;
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        else {
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
    public static String reverseEachWord(String str){
        StringBuilder sb=new StringBuilder();
       for(String s : str.split(" ")){
           for (int i =s.length()-1 ; i >=0 ; i--) {
               sb.append(s.charAt(i));
           }
           sb.append(" ");
        }
       return sb.substring(0,sb.length()-1);
     }

}