package com.chicoo.be0920.module2.oops.functionalInterfaces.consumer;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = (String value) -> {
            return "Functional : " + value;
        };

        function.apply("Interface");
    }
}
