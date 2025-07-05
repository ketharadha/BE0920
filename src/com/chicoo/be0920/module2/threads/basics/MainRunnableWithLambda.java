package com.chicoo.be0920.module2.threads.basics;

import com.chicoo.be0920.module2.util.log;

public class MainRunnableWithLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            log.info("Thread Execution for business functionality using Runnable Lambda");
        });
        t1.start();
    }
}
