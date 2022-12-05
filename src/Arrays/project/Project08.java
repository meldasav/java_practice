package Arrays.project;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 10, 15}));
        System.out.println(findClosestDistance(new int[]{-5, 10, 20, 50, 100}));
        System.out.println(noSpace1("Melda Sav"));
        System.out.println(replaceFirstLast("SavMelda"));
        System.out.println(vowel("SavMelda"));
        System.out.println(vowel("SvMld"));

    }

    public static int findClosestDistance(int[] array) {
        Arrays.sort(array);
        int closestDistance = Integer.MAX_VALUE;
        if (array.length < 2) return -1;
        else {
            for (int i = 0; i + 1 < array.length; i++) {
                int dist = array[i + 1] - array[i];
                closestDistance = Math.min(dist, closestDistance);
            }
            return closestDistance;
        }
    }

    public static String noSpace(String str) {
        return str.replace(" ", "");
    }

    public static String noSpace1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().trim();
    }

    public static String replaceFirstLast(String str) {
        if (str.length() < 2) return "";
        else str = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        return str;
    }

    public static boolean vowel(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i'
                || c == 'u' || c == 'o') {
                return true;
            }
        }
        return false;
    }
}
