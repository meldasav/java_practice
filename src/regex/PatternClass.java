package regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("[a-zA-Z\\d ]{5,20}");
        System.out.println(Pattern.matches(pattern.toString(),"apple"));
        System.out.println(Pattern.matches(pattern.toString(),"JAVA IS FUN"));

        String sentence="Java is fun to learn";
        String[] split=sentence.split("[a-zA-Z0-9]{5,20}");
        System.out.println(Arrays.toString(split));

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a username");
        String username=scan.nextLine();
        Pattern pattern1=Pattern.compile("[a-zA-Z\\d]{5,10}");
        if(Pattern.matches(pattern1.toString(),username)) System.out.println("Valid username");
        else System.out.println("Error!Username must be 5 to 10 characters long and can only contains letters and numbers");

    }
}
