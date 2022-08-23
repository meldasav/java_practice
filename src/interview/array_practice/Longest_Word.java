package interview.array_practice;

import java.util.Arrays;
import java.util.Comparator;

public class Longest_Word {
    public static void main(String[] args) {

        String[] sentence = {"I", "am", "a ", "software", "development", "engineer", "in", "test"};

        String longest = "";
        for (String s : sentence) {
            if (longest.length() < s.length())
                longest = s;

        }
        System.out.println(longest);

        String sentences = "Today is Monday";
        String word = Arrays.stream(sentences.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(word);

    }
}
