package Arrays;

import java.util.Scanner;

public class _06_CountHowManyA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while (count < 4) {

            System.out.println("Please enter a sentence");
            String sentence = scan.nextLine();


            if (!sentence.isEmpty()) {
                if (sentence.toLowerCase().contains("a")) {
                    int countA = 0;
                    for (int i = 0; i < sentence.length(); i++) {
                        if (sentence.toLowerCase().charAt(i) == 'a') countA++;
                    }
                    System.out.println("There are " + countA + " a in the sentence");
                } else {
                    System.out.println("Sentence does not have any a");
                }
            } else {
                System.out.println("The sentence does not have any character");
            }
            count++;
        }
    }
}