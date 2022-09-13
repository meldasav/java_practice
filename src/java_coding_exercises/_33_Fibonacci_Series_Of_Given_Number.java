package java_coding_exercises;

public class _33_Fibonacci_Series_Of_Given_Number {
    public static void main(String[] args) {
    fibonacci(10);
    }

    public static void fibonacci(int n) {
        StringBuilder sb = new StringBuilder();
        int n1 = 0, n2 = 1, n3 = 1;
        for (int i = 0; i <= n; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
