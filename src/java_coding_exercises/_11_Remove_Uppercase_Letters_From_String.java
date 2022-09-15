package java_coding_exercises;

public class _11_Remove_Uppercase_Letters_From_String {
    public static void main(String[] args) {
        System.out.println(removeUpperCase3("  MeldaSav "));
    }

    public static String removeUpperCase(String str) {
        return str.trim().replaceAll("[A-Z]", "");
    }

    public static String removeUpperCase1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isUpperCase(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeUpperCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //lower case ASCII value 97 and 122
            if (c >= 97 && c <= 122) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeUpperCase3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 60 && c <= 90)) sb.append(c);
        }
        return sb.toString().trim();
    }
}
