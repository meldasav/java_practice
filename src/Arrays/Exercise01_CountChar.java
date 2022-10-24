package Arrays;

public class Exercise01_CountChar {
    public static void main(String[] args) {
        String word = "Java";
        //count how many a
        int countA = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == 'a') countA++;
        }
        System.out.println(countA);

        for (char c : word.toCharArray()) {
            if (c == 'a') countA++;
        }
        System.out.println(countA);
    }
}
