package com.chicoo.be0920.module2.oops.functionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> consumerObject = (Integer value) -> {
            System.out.println("This is a consumer example");
        };
        consumerObject.accept(10);
    }
}
