package java_coding_exercises;

public class _07_Remove_Letters_From_String {
    public static void main(String[] args) {
        System.out.println(removeLetter2("Melda1983"));

    }

    public static String removeLetter(String str) {
        return str.replaceAll("[A-Za-z]", "").trim();
    }

    public static String removeLetter1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeLetter2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 65 && c <= 90 || c >= 97 && c <= 122)) sb.append(c);
        }
        return sb.toString().trim();
    }
}
