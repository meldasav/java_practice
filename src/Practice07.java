import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        System.out.println("task1");
        /**
         * Assume that you are given a String of any length. First check if it has at least length of 1. If the length is zero, then print “Length is zero”
         *  If it has length more than zero, then find:
         * -The length of the String
         * -First char in the String
         * -Last char in the String
         * -Check if the String contains any vowel letters
         * 	-if it has any vowel, then print “This String has vowel”
         * 	-Else, print “This String does not have vowel”
         * 	Vowels = a, e, i, u, o
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase().trim();


        if (sentence.length() == 0) {
            System.out.println("Length is zero");
        } else {
            System.out.println(sentence.length());
            System.out.println(sentence.charAt(0));
            System.out.println(sentence.charAt(sentence.length() - 1));
            boolean hasVowel = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.contains("a") || sentence.contains("e") || sentence.contains("u") || sentence.contains("o") || sentence.contains("i")) {
                    hasVowel = true;
                    break;
                }
            }
            System.out.println(hasVowel ? "This string has vowel" : "This string has no vowel");
        }
        /**
         * Assume that you are given a String of any length. First check if it has at least length of 3. If the length is less than 3, then print “Length is less than 3”
         * If it has length more than or equal to 3, then find the middle character for the odd length, middle 2 characters for the even length.
         */
        if (sentence.length() < 3) System.out.println("Length is less than 3");
        else {
            if (sentence.length() % 2 == 0) {
                System.out.println("" + sentence.charAt(sentence.length() / 2 - 1) + sentence.length() / 2);
            } else {
                System.out.println(sentence.charAt(sentence.length() / 2));
            }
        }
        System.out.println("Task 3");
        String substring = sentence.substring(sentence.length() - 2);
        if (sentence.length() < 4) System.out.println("INVALID INPUT");
        else {
            System.out.println(sentence.substring(0, 2));
            System.out.println(substring);
            System.out.println(sentence.substring(2, sentence.length() - 2));
        }

        System.out.println("task 4");
        if (sentence.length() < 2) System.out.println("Length is less then 2");
        else System.out.println(sentence.substring(0, 2).equals(substring));

        System.out.println("Task 5");
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.length() < 2 || word2.length() < 2) System.out.println("INVALID INPUT");
        else {
            System.out.println("" + word1.substring(1, word1.length() - 1) + word2.substring(1, word2.length() - 1));
        }
        System.out.println("task 6");
        if(word1.length() < 4) System.out.println("INVALID INPUT");
        else {
            System.out.println(word1.startsWith("xx") && word1.endsWith("xx"));
        }
    }
}