package java_coding_exercises;

public class _04_Reverse_String {
    public static void main(String[] args) {
        System.out.println(reverse1("Melda Sav"));
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
