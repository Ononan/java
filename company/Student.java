package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Student {
    private String name;
    private List<Integer> marks = new ArrayList<>();
    Predicate<Integer> cheker;

    public Student(String name, Predicate<Integer> cheker){
        this.name = name;
        this.cheker = cheker;
    }
    public boolean addMark(int value){
        if(cheker.test(value)){
            marks.add(value);
            return true;
        }
        return false;
    }

    public void appgradeMarks(UnaryOperator<Integer> operate){
        for (int i : marks){
            operate.apply(i);
        }
    }

    public void printMarks(){

        marks.forEach(value -> {
            System.out.print(value + " ");
        });
    }
    public void sortMarks(Comparator<Integer> operate){
        marks.sort(operate);
    }



}
//    public static int[] copyMarks(int[] marks){
//        int[] res = new int[marks.length];
//        for(int i = 0;i < marks.length; i++){
//            res[i] = marks[i];
//        }
//        return res;
//    }
//
//    public double averageMark(){
//        double res = 0;
//        int i = 0;
//        for(; marks.length > i; i++) res += marks[i];
//        if(i != 0) res /= i;
//        return res;
//    }
//
//    public  String checkMarks(){
//        for(int i : marks)
//            if(i < 5) {
//                return "Не отличник";
//            }
//        if(marks.length != 0) return "Отличник";
//        return "Не отличник";
//    }
//
//    public int[] getMarks() {
//        int[] res = new int[marks.length];
//        for(int i = 0; i < marks.length;i++) res[i] = marks[i];
//        return res;
//    }