package com.java.bootcamp;

import java.util.Arrays;
import java.util.function.Consumer;

public class VariableCaptureDemo {
    public static void main(String[] args) {

        int a=2;
        Consumer<Integer> consumer=e-> System.out.println(e+a);

        Arrays.asList(1,2,3,4)
                .forEach(consumer);

//        This will not work
//         a=3

        System.out.println(">>>>>>>>>>>");

        Arrays.asList(1,2,3,4)
                .forEach(consumer);

    }
}
