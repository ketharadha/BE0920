package com.chicoo.be0920.module2.threads.ReentrantLock;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantSharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock reentrantLock) {
        try {
            reentrantLock.lock();
            log.info("Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
            log.info("Lock released by : " + Thread.currentThread().getName());
        }
    }
}
