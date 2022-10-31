package Arrays;

import java.util.Scanner;

public class _07_isPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 4) {
            System.out.println("Please enter a word");
            String word = scan.next();
            StringBuilder reverse = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse.append(word.charAt(j));
            }
            count++;
            System.out.println(reverse.toString().equals(word) ? "Word is palindrome" : "Word is not palindrome");
        }

        // 2.way
        System.out.println("Please enter a word");
        String word1 = scan.next();

        boolean isPalindrome = true;
        if (word1.length() < 1) {
            System.out.println("This word does not have enough 1 or more characters");
        } else {
            for (int i = 0, j = word1.length() - 1; i <= word1.length() / 2; i++, j--) {
                if (word1.charAt(i) != word1.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println("This word is a palindrome");
            else System.out.println("This word is not a palindrome");
        }
    }
}






