package java_coding_exercises;

public class _06_Remove_Spaces_From_String {
    public static void main(String[] args) {
        System.out.println(removeSpace("   Melda  SAV"));
    }

    public static String removeSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isSpaceChar(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeSpace1(String str) {

        //TODO Space ASCII VALUE is 32
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 32) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeSpace2(String str) {
        return str.replaceAll(" ", "");
    }
}
