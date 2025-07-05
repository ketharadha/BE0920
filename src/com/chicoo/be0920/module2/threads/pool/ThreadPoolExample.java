package com.chicoo.be0920.module2.threads.pool;


import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(6),
                new CustomThreadFactory(),
                new CustomRejectedExecutionHandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        for (int i = 0; i < 10; i++) {
            poolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    log.info("Thread Name : " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        poolExecutor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        //logging
        log.info("Task Denied : " + r.toString());
    }
}
