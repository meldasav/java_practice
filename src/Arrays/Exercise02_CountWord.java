package Arrays;

public class Exercise02_CountWord {
    public static void main(String[] args) {
        String sentence = "I love arrays";
        //count words

        int count = 1;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') count++;
        }
        System.out.println(count);

        System.out.println(sentence.split(" ").length);

        //solution 2
        int countWord = 0;
        for (char c : sentence.toCharArray()) {
            if (c == ' ') countWord++;
        }
        System.out.println(countWord + 1);
    }
}

