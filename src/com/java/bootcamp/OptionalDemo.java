package com.java.bootcamp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {

    public static void main(String[] args) {
//        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> arrayList = Arrays.asList();

        Optional<Integer> integerOptional = arrayList.stream()
                .filter(e -> e % 2 != 0)
                .filter(e -> e > 5)
                .map(e -> e * 2)
                .findFirst();

        //Handle 1
        System.out.println(integerOptional.orElse(-999));

        //Handle 2
        String env = "stage";
        System.out.println(integerOptional.orElseGet(() -> {
            if (env.equals("prod")) {
                return -999;
            } else {
                return -888;
            }
        }));

        //Handle 3
        if (integerOptional.isPresent()) {
            System.out.println(integerOptional.get());
        } else {
            System.out.println("No Value Found");
        }

    }
}
