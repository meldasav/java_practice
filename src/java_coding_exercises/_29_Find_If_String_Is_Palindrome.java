package java_coding_exercises;

public class _29_Find_If_String_Is_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("civic"));
    }
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }
    public static boolean isPalindrome1(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
