package com.chicoo.be0920.module2.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 * This class jas methods to practice Streams using List.
 */
public class StreamExampleWIthList {

    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);

        int count = 0;
        for (Integer s : salaryList) {
            if (s > 3000)
                count++;
        }

        var salaryCount = salaryList.stream() //Stream Creation
                .filter((Integer s) -> s>3000) //Intermediate Operation
                .count(); // Terminal Operations
        System.out.println(salaryCount);

        /* Create Stream From
          Collection --> list.stream()
          Arrays  --> Arrays.stream(arrayVariable)
          Static method Stream.of() --> Stream.of(3000, 4100, 9000, 1000, 3500)
          Stream builder
          Stream Iterator
         */

        Integer[] salaryArray = {3000, 4100, 9000, 1000, 3500};
        salaryCount = Arrays.stream(salaryArray)
                .filter((Integer i) -> i > 1000)
                .count();
        System.out.println(salaryCount);

        Stream.Builder<Integer> salaryStreamBuilder = Stream.builder(); // First Stream.Builder should be of a specific dataytype
        salaryCount = salaryStreamBuilder.add(3000)
                .add(4100)
                .add(9000)
                .add(1000)
                .add(3500)
                .build().filter((Integer i) -> i > 1000)
                .count();;
                System.out.println(salaryCount);

        Stream<Integer> streamFromIterator = Stream.iterate(5000, (Integer n) -> n + 1000).limit(5);
        streamFromIterator.peek((Integer i) -> System.out.println(i)).count();

        //Frequently used intermediate functions
        //filter(Predicate) boolean test(T t)
        //map(Function) R apply(T t) // used for transformation
        //flatMap(Function<T, Stream<R>> mapper)
    }
}
