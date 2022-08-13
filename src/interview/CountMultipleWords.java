package interview;

public class CountMultipleWords {
    public static void main(String[] args) {
        System.out.println(countMultipleWords(new String[]{"FOO"," FOO BAR","JAVA IS FUN"}));
    }
    public static int countMultipleWords(String[] words){
        int count=0;
        for (String word : words) {
            if(word.trim().contains(" "))count++;
        }
            return count;
        }
    }

