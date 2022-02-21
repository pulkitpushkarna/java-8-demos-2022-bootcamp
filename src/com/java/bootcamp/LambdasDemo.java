package com.java.bootcamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

interface MyInterface {
    int display(int a, String str);
}

public class LambdasDemo {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        for (int i : integerList) {
            System.out.println(i);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        integerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        integerList.forEach((Integer i) -> {
            System.out.println(i);
        });

        integerList.forEach((i) -> System.out.println(i));

        integerList.forEach(i -> System.out.println(i));

        integerList.forEach(System.out::println);
    }
}
