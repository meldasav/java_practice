package java_coding_exercises;

public class _37_Count_Specials_In_A_String {
    public static void main(String[] args) {
        System.out.println(countLetter("M!elda$sa v34"));
    }

    public static int countLetter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(Character.isDigit(c) || Character.isLetter(c) || Character.isSpaceChar(c))) count++;
        }
        return count;
    }
}
