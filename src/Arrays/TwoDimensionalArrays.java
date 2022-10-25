package Arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"ALI", "Alex", "Regina"},
                {"Beyza", "Filiz", "Melda"},
                {"Newer", "joe"}
        };
        System.out.println(students[0][1]);
        System.out.println(students[1][2]);
        System.out.println(students.length);//3
        System.out.println(Arrays.toString(students[0]));
        System.out.println(Arrays.toString(students[1]));
        System.out.println(Arrays.toString(students[2]));

        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }

        for (String[] group : students) {
            System.out.println(Arrays.toString(group));
        }
        //Printing the multi-dimensional array
        System.out.println(Arrays.deepToString(students));

        for(String[] group:students){
            for(String student : group){
                System.out.println(student);
            }
        }
        //Printing each student with fori loop
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }
    }
}
