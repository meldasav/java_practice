package java_coding_exercises;

public class _05_Remove_Digits_From_String {
    public static void main(String[] args) {
        System.out.println(removeDigits3("   Melda1983   "));
    }

    public static String removeDigits(String str) {
        //TODO you can replace [0-9] with \\d
        //TODO return str.trim().replaceAll("\\d"," ");
        return str.trim().replaceAll("[0-9]", " ");
    }

    //TODO 2nd way
    public static String removeDigits1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeDigits2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeDigits3(String str) {
        //TODO UPPER CASE LETTER ASCII VALUE BETWEEN 65 AND 90
        //TODO LOWER CASE LETTER ASCII VALUE BETWEEN 97 AND 122
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 65 && c <= 90 || c >= 97 && c <= 122)) sb.append(c);
        }
        return sb.toString().trim();
    }
}