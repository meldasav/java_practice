package Arrays;

import java.util.Scanner;

public class _09_CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        if (sentence.contains(" ")) {
            int count = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') count++;
            }
            System.out.println(count);
        } else {
            System.out.println("Does not enough word");
        }

        //2.way
        System.out.println("Please enter a sentence");
        String sentence1 = scanner.nextLine();
        if (sentence1.contains(" ")) System.out.println(sentence1.split(" ").length);
        else System.out.println("Does not enough word");
    }
}

