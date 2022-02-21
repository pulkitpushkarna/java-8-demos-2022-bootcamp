package com.java.bootcamp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        //Stream Creation

        //1
        Arrays.asList(1, 2, 3, 4, 5).stream();
        //2
        int[] intNums = new int[]{1, 2, 3, 4};
        Stream.of(intNums);
        //3
        Stream.of(1, 2, 3, 4);

        List<Integer> arrayList = Arrays.asList(1, 2, 3, 3, 4, 5);

//        arrayList.forEach(System.out::println);

        System.out.println("Multiple of two :::" + arrayList.stream()
                .map(e -> {
                    System.out.println("e>>>>" + e);
                    int num = e * 2;
                    System.out.println("num?>>>>" + num);
                    return num;
                })
                .collect(Collectors.toList())
        );

        System.out.println("Even Numbers :::" + arrayList.stream()
                .filter(e -> {
                    System.out.println("e>>>>" + e);
                    boolean retValue = e % 2 == 0;
                    System.out.println("returnValue>>>>" + retValue);
                    return retValue;
                })
                .collect(Collectors.toList()));

        System.out.println("Max ::" + arrayList.stream().mapToInt(e -> e).max());
        System.out.println("Min ::" + arrayList.stream().mapToInt(e -> e).min());
        System.out.println("Average ::" + arrayList.stream().mapToInt(e -> e).average());

        System.out.println("List to set::" + arrayList.stream().collect(Collectors.toSet()));

        System.out.println(arrayList);

        System.out.println("Performing Join operation::" + Arrays.asList("abc", "def").stream().collect(Collectors.joining(",")));
        ;

        System.out.println(arrayList.stream().collect(Collectors.summarizingInt(x -> x * 2)));

        System.out.println(arrayList.stream().collect(Collectors.averagingInt(x -> x)));

        System.out.println(arrayList.stream().collect(Collectors.counting()));

        System.out.println(Stream.of(1,2,3,4,5).collect(Collectors.toMap(e -> e, e -> e * 2)));

        System.out.println(Arrays.asList(1,2,3,4,5).stream().collect(Collectors.toMap(e -> e, e -> e * 2)));

    }
}
