package com.company;

public class A {
    public int a = 2;
    public void test(){
        System.out.println("class A");
    }
    class B extends A{
        public String toString(){
            return "";
        }
    }
}
