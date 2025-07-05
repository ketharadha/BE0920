package com.chicoo.be0920.module2.threads.basics;

import com.chicoo.be0920.module2.util.log;

public class MainImplementsRunnable implements Runnable {

    @Override
    public void run() {
        log.info("Thread Execution for business functionality using Runnable");
    }

    public static void main(String[] args) {
        MainImplementsRunnable mainImplementsRunnable = new MainImplementsRunnable();
        Thread t1 = new Thread(mainImplementsRunnable);
        t1.start();
    }
}
