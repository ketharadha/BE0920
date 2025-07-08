package com.chicoo.be0920.module2.oops.inheritance;

public interface Interface1 {
    default void diamondSolution1() {
        System.out.println("Interface1 Default Method - Diamond Problem Solution 1");
    }
    default void diamondSolution2() {
        System.out.println("Interface1 Default Method - Diamond Problem Solution 2");
    }
    private static void test() {
        System.out.println(" Public static method");
    }
}
