package com.company;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<Student> createStudent = () ->{
            Scanner s = new Scanner(System.in);

            return new Student(s.nextLine() ,value -> {
                if(value > 1 && value <= 5) return true;
                return false;
            });
        };

        Student s = createStudent.get();
        System.out.println(s.addMark(20));
        System.out.println(s.addMark(2));
        System.out.println(s.addMark(3));


        s.appgradeMarks(value -> value + 1);
        s.sortMarks((value1,value2) -> value2 - value1);
        s.printMarks();
    }
}
