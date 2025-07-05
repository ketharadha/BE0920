package com.chicoo.be0920.module2.exception.runtimeexceptions;

public class StackTraceDemo {

    public static void main(String[] args) {
        StackTraceDemo stackTrace = new StackTraceDemo();
        stackTrace.method1();
    }

    private void method1() {
        method2();
    }

    private void method2() {
        int a = 5/0;
        method3();
    }

    private void method3() {
        //int a = 5/0;
    }

}
