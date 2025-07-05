package com.chicoo.be0920.module2.exception.runtimeexceptions;

public class IndexOutOfBounceExample {
    public static void main(String[] args) {
        int[] val = new int[2]; // [0] [1] [2]
        String name = "Hello";
        //System.out.println(val[3]);
        System.out.println(addition(val));
        //System.out.println(print(name));
    }

    public static String addition(int[] values) {
        if (values.length <= 2)
            System.out.println(values[3]);
        return "AINOUBounce";
    }

    public static Character print(String name) {
        return name.charAt(5);
    }
}
