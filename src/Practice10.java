import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice10 {
    public static void main(String[] args) {
        String[] items = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};
        int count = 0;
        for (String s : items) {
            if (s.toLowerCase().startsWith("m")) count++;
        }
        System.out.println(count);
        System.out.println(removeExtraSpace("   java      is        fun  "));
        System.out.println(Arrays.toString(remove(new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60)))));
        System.out.println(removeDup1(new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println(Arrays.toString(array(new int[]{6, 8, 3, 0, 0, 7, 5, 10, 34}, new int[]{10, 3, 6, 3, 2})));
    }

    public static int countWords(String str) {
        str = str.trim();
        return str.split(" ").length;
    }

    public static int countWords1(String str) {
        int count = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') count++;
        }
        return count + 1;
    }

    public static int countA(String str) {
        int count1 = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') count1++;
        }
        return count1;
    }

    public static int[] remove(ArrayList<Integer> numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>(new HashSet<>(numbers));
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    public static ArrayList<String> removeDup(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static ArrayList<String> removeDup1(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (list1.contains(s)) {
                continue;
            }
            list1.add(s);
        }
        return list1;
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1).trim();
    }

    public static int[] array(int[] num1, int[] num2) {
        for (int i = 0; i < Math.min(num1.length, num2.length); i++) {
            if (num1.length > num2.length) num1[i] += num2[i];
            else num2[i] += num1[i];
        }
        return (num1.length > num2.length) ? num1 : num2;
    }
}

