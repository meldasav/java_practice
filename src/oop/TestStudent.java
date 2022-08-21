package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Melda", 1, 90, 39);
        Student s2 = new Student("Gulizar", 1, 80, 40);
        Student s3 = new Student("Nataliia", 2, 70, 28);
        Student s4 = new Student("data", 2, 85, 28);
        Student s5 = new Student("Vita", 4, 95, 27);

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        System.out.println(students.size());
        for (Student s : students) {
            System.out.println(s);
        }
        students.forEach(System.out::println);
        //name where marks >80
        students.stream().filter(x -> x.getMarks() > 80).forEach(x -> System.out.println(x.getName() + ":" + x.getMarks()));

        //name highest mark
        int highestMark = students.stream().map(Student::getMarks).max(Integer::compare).get();
        System.out.println(highestMark);

        //who got the highest mark

        students.stream().filter(e -> e.getMarks() == highestMark).forEach(System.out::println);
    }

}
