package com.java.bootcamp;


interface parent {
    default void display() {
        System.out.println("Parent");
    }
}

interface child1 extends parent {
    default void display() {
        System.out.println("Child 1");
    }
}

interface child2 extends parent {
    default void display() {
        System.out.println("Child 2");
    }
}


public class MultipleInheritanceDemo implements child1, child2 {
    public void display() {
        child1.super.display();
        child2.super.display();
//        System.out.println("MultipleInheritanceDemo");
    }

    public static void main(String[] args) {
        new MultipleInheritanceDemo().display();

    }

}
