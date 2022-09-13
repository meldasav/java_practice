package java_coding_exercises;

public class _44_Reverse_Each_Word_In_A_String {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Melda Sav"));
    }
    public static String reverseEachWord(String str){
        StringBuilder sb =new StringBuilder();

         for(String s : str.split(" ")){
             for (int i = s.length()-1; i >=0 ; i--) {
                 sb.append(s.charAt(i));
             }
             sb.append(" ");
        }
         return sb.toString();
    }
}
