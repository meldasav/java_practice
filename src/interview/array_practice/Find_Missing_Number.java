package interview.array_practice;

public class Find_Missing_Number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,3,4,5,6},6));
    }

    public static int missingNumber(int[] array,int n){
        int excSum= n *(n+1)/2;
        int actSum=0;
        for (int i : array) {
           actSum+=i;
        }
        return excSum-actSum;
    }
}
