package java_coding_exercises;

public class _34_Count_Spaces_In_A_String {
    public static void main(String[] args) {
        System.out.println(countSpace1("Java is fun"));
    }
    public static int countSpace(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isSpaceChar(str.charAt(i)))count++;
        }
        return count;
    }
    public static int countSpace1(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ')count++;
        }
        return count;
    }

}
