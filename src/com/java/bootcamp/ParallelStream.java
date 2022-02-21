package com.java.bootcamp;

import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
//        19137469447
//         2090997294

        long startTime = System.nanoTime();
        System.out.println(IntStream.range(1,20)
                .parallel()
                .filter(e->{
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    return e>10;})
                .map(e->e+7).average());
        long endTime = System.nanoTime();

        System.out.println(endTime-startTime);


    }
}
