package com.chicoo.be0920.module2.oops.abstraction.abstractclass;

/**
 * Why use an abstract class with no abstract methods?
 * Sometimes we make a class abstract just to prevent direct instantiation, while still providing shared code or behavior for subclasses.
 */
public abstract class Car {
    //Note : Only instance methods can be marked abstract with in a class
    public abstract void engine();
    public abstract void interiorDeco();
    public abstract void diskBreaks();
    public abstract void classicMusicSystem();

    //Note : Static methods cannot be abstract
    //Similar is the case with Variable, Constructors

    /* public abstract static String print();
    abstract int balance = 100;

    public abstract AbstractClass(int balance) {
        this.balance = balance;
    } */

    public void horn() {
        System.out.println("Alarm...");
    }

    //You can add as many non-abstract instance methods as you want in here.
}
