package java_coding_exercises;

public class _08_Remove_Specials_From_String {
    public static void main(String[] args) {
        System.out.println(removeSpecials("   Meld a$$$ "));
    }

    public static String removeSpecials(String str) {
        //TODO \\d represent non digits and space
        return str.replaceAll("[^\\dA-Za-z]", "");
    }

    public static String removeSpecials1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c) || Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }
}
