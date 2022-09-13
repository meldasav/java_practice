package java_coding_exercises;

public class _42_Count_Words_In_A_String {
    public static void main(String[] args) {
        System.out.println(countWord("Java is fun to learn"));
    }
    public static int countWord(String str){
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')count++;
        }
        return count;
    }
}
