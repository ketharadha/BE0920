package com.chicoo.be0920.module2.oops.functionalInterfaces.consumer;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer value) -> {
            if (value == 10) {
                System.out.println("Predicate returns : " + value);
            }
            return (value == 10);
        };

        System.out.println("Return Predicate : " + predicate.test(10));
    }
}
