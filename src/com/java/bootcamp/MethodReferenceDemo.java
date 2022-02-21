package com.java.bootcamp;

interface MyInterface2 {
    int performOperation(int a, int b);
}

public class MethodReferenceDemo {

    public static int add(int a, int b) {
        System.out.println("Performing addition");
        return a + b;
    }

    int multiply(int a, int b) {
        System.out.println("Performing multiplication");
        return a * b;
    }

    public static void main(String[] args) {

        MyInterface2 myInterface2 = MethodReferenceDemo::add;
        System.out.println(myInterface2.performOperation(1, 2));

        MyInterface2 myInterface4 = new MethodReferenceDemo()::multiply;
        System.out.println(myInterface4.performOperation(1, 2));

        MyInterface2 myInterface3 = (a, b) -> a + b;
        System.out.println(myInterface3.performOperation(1, 3));

    }
}
