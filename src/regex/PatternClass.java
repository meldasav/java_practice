package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("[a-zA-Z0-9 ]{5,20}");
        System.out.println(Pattern.matches(pattern.toString(),"apple"));
        System.out.println(Pattern.matches(pattern.toString(),"JAVA IS FUN"));

        String sentence="Java is fun to learn";
        String[] split=sentence.split(" [a-zA-Z0-9]{5,20}");
        System.out.println(Arrays.toString(split));
    }
}
