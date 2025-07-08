package com.chicoo.be0920.module2.classstructure;

public class ThisSuper {

    public ThisSuper() {
        // this() should be the first line of a constructor.
        // If you have to use super() to call parent class constructor you cannot call this(). You can use either one and not both.
        // super() is used to call the parent class method(), variable or constructor.
        this("In param Con");
    }
    public ThisSuper(String test) {
        this("test1", "test2"); // this() should be the first line of a constructor
        System.out.println("Constructor "+ test);
    }

    public ThisSuper(String test1, String test2) {
        System.out.println("Constructor "+ test2);
    }

    public void testThis() {
        System.out.println("Test this instance");
    }

    public void test() {
        System.out.println("This instance : " + this);
        this.testThis();
    }
    public static void main(String[] args) {
        System.out.println("Uses of this and super keyword");
        ThisSuper thisSuper = new ThisSuper();
        System.out.println("Actual Instance : " + thisSuper);
        thisSuper.test();
    }
}
