package interview;

public class Print_the_Number {
    public static void main(String[] args) {
        printNumbers("0000000");
    }
    /*
    1000000
    2200000
    3330000
    4444000
    5555500
    6666660
    7777777
     */
    
    public static void printNumbers(String numbers){
        for (int i = 1; i < numbers.length(); i++) {
            String s="";
            for (int j = 1; j <=i ; j++) {
                s+=i;
                
            }
            System.out.println(s+numbers.substring(i));
            
        }
        
    }
}
