package com.java.bootcamp;

@FunctionalInterface
interface ArithmeticOperation {
    int perform(int a, int b);
}

public class Main {

    static void doSomeOperation(int a, int b, ArithmeticOperation arithmeticOperation) {
        System.out.println(arithmeticOperation.perform(a, b));
    }

    public static void main(String[] args) {
        ArithmeticOperation add = (a, b) -> a + b;
        doSomeOperation(1, 2, add);

        doSomeOperation(1, 2, (a, b) -> a - b);

        doSomeOperation(1, 2, (a, b) -> a * b);

        Runnable runnable = () -> System.out.println("Running Thread");

        new Thread(runnable).start();

    }
}
