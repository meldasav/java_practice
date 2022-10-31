package Arrays;

public class _10_RandomNumbers {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * (26));
        int random2 = (int) (Math.random() * (26));
        String str = "";
        for (int i = Math.min(random1, random2); i < Math.max(random1, random2); i++) {
            if (i % 5 != 0) str += i + "-";
        }
        System.out.println(str.substring(0, str.length() - 1));
    }
}
