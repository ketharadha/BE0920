package com.chicoo.be0920.module2.exception.runtimeexceptions;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        //Type Conversion
        String orderCount = "three";
        System.out.println(print(orderCount));
    }

    public static int print(String orderCount) {
        return Integer.parseInt(orderCount);
    }
}
