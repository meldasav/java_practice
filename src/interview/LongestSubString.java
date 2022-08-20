package interview;

import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubstring2("abcdabccdd"));
        System.out.println(remove("bcabc"));

    }

    public static int longestSubstring(String str) {
        int start = 0, end = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while (end < str.length()) {
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(start));
                start++;
            }
        }
        return max;
    }

    public static String longestSubstring1(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longestUntilnow = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                longestUntilnow = "";
                set.clear();
            }

            set.add(c);
            longestUntilnow += c;

            if (longestUntilnow.length() > longestOverall.length()) {
                longestOverall = longestUntilnow;
            }

        }
        return longestOverall;
    }

    public static String longestSubstring2(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longestUntilnow = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                longestUntilnow += c;
            } else {
                longestUntilnow = "";
                set.clear();
            }
            if (longestUntilnow.length() > longestOverall.length()) {
                longestOverall = longestUntilnow;
            }

        }
        return longestOverall;
    }

    public static String remove(String str) {
        TreeSet<Character> set=new TreeSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();
    }
}

