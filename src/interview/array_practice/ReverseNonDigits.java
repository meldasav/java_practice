package interview.array_practice;

public class ReverseNonDigits {
    public static void main(String[] args) {
        System.out.println(reverse("melda12tarik13"));

    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                sb.append(str.charAt(i));
            }else{
                if(Character.isDigit(str.charAt(i))){
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.reverse().toString();
    }




        }




