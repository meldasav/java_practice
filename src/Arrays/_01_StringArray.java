package Arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        String[] countries = new String[3];
        countries[1] = "Spain";
        countries[2] = "Belgium";
        System.out.println(countries[1]);//Spain
        //Printing an array
        System.out.println(Arrays.toString(countries));

        //update existing data

        countries[1] = "France";
        System.out.println(Arrays.toString(countries));//[null, France, Belgium]

        //Getting the length of the array
        System.out.println(countries.length);//3

        //Print each element

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
