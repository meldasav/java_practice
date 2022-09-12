package java_coding_exercises;

public class _09_Remove_Vowels_From_String {
    public static void main(String[] args) {
        System.out.println(removeVowels("  mElda"));
    }

    public static String removeVowels(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i'
               || c == 'o' || c == 'u')) {
                sb.append(c);
            }
        }

        return sb.toString().trim();
    }
}
