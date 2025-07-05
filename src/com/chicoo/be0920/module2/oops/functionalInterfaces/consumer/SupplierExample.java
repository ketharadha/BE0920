package com.chicoo.be0920.module2.oops.functionalInterfaces.consumer;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String value = "Suppier";
            System.out.println("Supplier Example : " + value);
            return value + " FI";
        };

        System.out.println(supplier.get());
    }
}
