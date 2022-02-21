package com.java.bootcamp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefinedFunctionalInterface {
    public static void main(String[] args) {

        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(1);

        Predicate<Integer> isOdd = a -> a % 2 == 1;
        System.out.println(isOdd.test(3));

        Function<Integer, Integer> multiplyBy2 = a -> a * 2;
        System.out.println(multiplyBy2.apply(4));

        Supplier<Integer> supplier = () -> 5;
        System.out.println(supplier.get());

    }
}
