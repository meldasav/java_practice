package Arrays;

public class UnderstandingArray {
    public static void main(String[] args) {

        String[] names = {"Kerem", "Melda", "Tarik", "Osman", "Elif"};//holding a collection of names
        System.out.println(names[2]);//Tarik
        System.out.println(names[4]);//Elif
        //   System.out.println(names[5]);//ArrayOutOfBoundException

        int[] ages={21,23,25};
        System.out.println(ages[2]);
    }
}
