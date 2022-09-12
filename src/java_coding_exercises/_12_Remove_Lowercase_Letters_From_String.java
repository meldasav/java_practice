package java_coding_exercises;

public class _12_Remove_Lowercase_Letters_From_String {
    public static void main(String[] args) {
        System.out.println(removeLowerCase3("  melDAsAV"));
    }
    public static String removeLowerCase(String str){
        return str.trim().replaceAll("[a-z]","");
    }
    public static String removeLowerCase1(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLowerCase(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeLowerCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //UPPER case ASCII value 90 and 122
            if (c >= 65 && c <= 90) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeLowerCase3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //lower case ASCII value 90 and 122
            if (!(c >= 90 && c <= 122)) sb.append(c);
        }
        return sb.toString().trim();
    }
    }

