package com.java.bootcamp;

interface MyInterface5 {

    void display();
    default void display2(){

    }
}

class A implements MyInterface5{

    @Override
    public void display() {
        System.out.println("A");
    }

    @Override
    public void display2() {
        System.out.println("A invoked display 2");
    }


}

class B implements MyInterface5{

    @Override
    public void display() {
        System.out.println("B");
    }


}

class C implements MyInterface5{

    @Override
    public void display() {
        System.out.println("C");
    }

}


public class DefaultMethodDemo {
    public static void main(String[] args) {

        A a = new A();
        a.display2();
        B b = new B();
        b.display2();
        C c = new C();
        c.display2();

    }
}
