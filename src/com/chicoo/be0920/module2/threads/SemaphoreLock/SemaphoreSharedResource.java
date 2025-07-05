package com.chicoo.be0920.module2.threads.SemaphoreLock;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.Semaphore;

public class SemaphoreSharedResource {
    boolean isAvailable = false;

    public void producer(Semaphore semaphore) {
        try {
            semaphore.acquire();
            log.info("Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
            log.info("Lock released by : " + Thread.currentThread().getName());
        }
    }
}
