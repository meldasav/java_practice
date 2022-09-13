package java_coding_exercises;

public class _41_Count_Lower_Cases_In_A_String {
    public static void main(String[] args) {
        System.out.println(countLower("meldasaV"));
    }

    public static int countLower(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) count++;
        }
        return count;
    }
}
