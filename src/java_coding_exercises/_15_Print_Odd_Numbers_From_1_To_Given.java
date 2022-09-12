package java_coding_exercises;

public class _15_Print_Odd_Numbers_From_1_To_Given {
    public static void main(String[] args) {
    oddNumber(10);
    }
    public static void oddNumber(int n){
        for (int i = 1; i <=n ; i++) {
            if(i%2==1) System.out.println(i);

        }
    }

}
