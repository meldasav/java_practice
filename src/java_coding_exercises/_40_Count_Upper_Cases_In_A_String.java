package java_coding_exercises;

public class _40_Count_Upper_Cases_In_A_String {
    public static void main(String[] args) {
        System.out.println(countUpperCase("MELdaSAV"));
    }

    public static int countUpperCase(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isUpperCase(c))count++;
        }
        return count;
    }
}
