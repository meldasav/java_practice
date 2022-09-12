package java_coding_exercises;

public class _14_Print_Even_Numbers_From_1_To_Given {
    public static void main(String[] args) {
     evenNumber(10);
    }
    public static void evenNumber(int n){
        for (int i = 1; i <=n; i++) {
            if(i%2==0) System.out.println(i);
        }
    }
}
