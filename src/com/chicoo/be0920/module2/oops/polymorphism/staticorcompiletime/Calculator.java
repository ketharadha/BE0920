package com.chicoo.be0920.module2.oops.polymorphism.staticorcompiletime;


/**
 * Also called method overloading.
 * Decision is made at compile time.
 * Same method name but different parameters.
 */
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
