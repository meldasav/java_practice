package java_coding_exercises;

public class _10_Remove_Consonants_From_String {
    public static void main(String[] args) {
        System.out.println(removeConsonants1("MeldAsav"));

    }

    public static String removeConsonants(String str) {
        return str.replaceAll("[^AEUIOaeuio]", "").trim();
    }

    public static String removeConsonants1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                 c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I')) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

}
