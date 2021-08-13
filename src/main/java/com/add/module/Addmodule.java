package com.add.module;

public class Addmodule {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Result is " + c);
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Arasaka !!");

        Addmodule obj = new Addmodule();
        obj.add(10,20);
    }
}