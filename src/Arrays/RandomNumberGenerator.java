package Arrays;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println(randomNumber(1,10));
    }
    public static int randomNumber(int start, int end) {
        return (int) (Math.random() * (Math.abs(start - end)) + Math.min(start, end));
    }
}
