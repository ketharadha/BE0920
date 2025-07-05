package com.chicoo.be0920.module2.threads.basics;

import com.chicoo.be0920.module2.util.log;

public class MainExtendsThread extends Thread {

    @Override
    public void run() {
        log.info("Thread Execution for business functionality");
    }

    public static void main(String[] args) {
        MainExtendsThread t1 = new MainExtendsThread();
        t1.start();
    }
}
