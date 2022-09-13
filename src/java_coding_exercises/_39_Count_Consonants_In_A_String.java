package java_coding_exercises;

public class _39_Count_Consonants_In_A_String {
    public static void main(String[] args) {
        System.out.println(countConsonants("Melda19 832Sav"));
    }


    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I'
                    || Character.isDigit(c) || Character.isSpaceChar(c))) {
                count++;

            }
        }
        return count;
    }
}
