package java_coding_exercises;

public class _36_Count_Digits_In_A_String {
    public static void main(String[] args) {
        System.out.println(countLetter("Melda$sa v34"));
    }
    public static int countLetter(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))count++;
        }
        return count;
    }
    }

