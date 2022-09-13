package java_coding_exercises;

public class _38_Count_Vowels_In_A_String {
    public static void main(String[] args) {
        System.out.println(countVowel("Melda1983"));
    }

    public static int countVowel(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u')) {
                count++;
            }
        }

        return count;
    }
}
