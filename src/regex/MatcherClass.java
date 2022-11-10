package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        Matcher matcher = pattern.matcher("hello");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        Pattern pattern1 = Pattern.compile("SDET");
        Matcher matcher1 = pattern1.matcher("Looking for SDET jobs SDET SDET");
        System.out.println(matcher1.matches());
        System.out.println(matcher1.find());
        System.out.println(matcher1.group());
        System.out.println(matcher1.start());//start index of matching words
        System.out.println(matcher1.end());//end index of matching words

        while (matcher1.find()) {
            System.out.println(matcher1.group());
            System.out.println(matcher1.group());
            System.out.println(matcher1.start());//start index of matching words
            System.out.println(matcher1.end());//end index of matching words
        }
        int counter = 0;
        while (matcher1.find()) {
            counter++;
            System.out.println(matcher1.group());
            System.out.println(matcher1.start());
            System.out.println(matcher1.end());
        }
        System.out.println(counter);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();

        Pattern pattern2 = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher2 = pattern2.matcher(sentence);

        int countWords = 0;
        while (matcher2.find()) {
            System.out.println(matcher2.group());
            countWords++;
        }
        System.out.println("This sentence has " + countWords + " words");

        System.out.println(Pattern.matches("[xyz]","xyz"));//false
        System.out.println(Pattern.matches("[a-z&&[^pqrs]]","n"));//true
        System.out.println(Pattern.matches("[^xyz]","y"));//false
        System.out.println(Pattern.matches("[A-Za-z]+","I go to school at TG"));//false

        Pattern pattern3=Pattern.compile("[A-Za-z0-9_-]{9,15}");
        System.out.println(Pattern.matches(pattern3.toString(),"MeldaSav_12"));

    }
}
