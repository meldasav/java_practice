import java.util.Arrays;

public class _01ArrayPractice {
    public static void main(String[] args) {
        //Storing multiple int values - use array to store 5 int values
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 5;
        array[2] = 6;
        array[3] = 8;
        array[4] = 9;
        int[] numbers = {2, 5, 6, 8, 9};
        //Getting the array size - use length
        System.out.println(array.length);
        //Retrieving an element from the array using its index
        System.out.println(array[2]);
        //Printing the array by converting it to String - using Arrays.toString() method
        System.out.println(Arrays.toString(numbers));
        //Looping through each element in the array and printing them one by one using fori loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" Element at index of " + i + " = " + numbers[i]);
        }

        for(int i : numbers){
            System.out.println(i);
        }
        //

        //Sorting the array using Arrays.sort() method - it sorts in ascending order for primitives (lexicographically for object)
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // //Declaring and initializing an array with initial values
        String[] languages={"Java","Java Script"};
        //Declaring a new array an assigning another array to it
        String[] array1=languages;
        //Reassigning new object values to arrays
        array1[0]="C++";
        languages[1]="Ruby";
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(languages));
       //Declaring and initializing arrays with initial values
        int[]num1={1,2,3};
        int[]num2={4,5,6};
        num2=num1;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }
}
