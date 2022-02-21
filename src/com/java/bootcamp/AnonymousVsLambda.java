package com.java.bootcamp;

interface MyInterface4 {
    void display();
}

public class AnonymousVsLambda {
    int myVar = 2;

    void instanceMethod() {
        MyInterface4 myInterface4 = new MyInterface4() {
            int myVar = 1;

            @Override
            public void display() {
                System.out.println(this.myVar);
            }
        };

        myInterface4.display();

        MyInterface4 myInterface41 = () -> System.out.println(this.myVar);
        myInterface41.display();
    }

    public static void main(String[] args) {

        new AnonymousVsLambda().instanceMethod();


    }
}
