package com.chicoo.be0920.module2.oops.functionalInterfaces;

@FunctionalInterface
public interface Bird {
    void canFly(String wingSize);
    //void canMakeNoise();
    default void canBreed() {
        System.out.println("default method");
    }
}