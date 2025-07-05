package com.chicoo.be0920.module2.exception.runtimeexceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String val = null;
        System.out.println(print(val));
    }

    public static String print(String val) {
        return val.toUpperCase();
    }
}
