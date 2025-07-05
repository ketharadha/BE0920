package com.chicoo.be0920.module2.threads.StampedLock.OptimisticLock;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.StampedLock;

public class OptimisticSharedResource {
    boolean isAvailable = false;
    int a = 10;
     public void producer(StampedLock stampedLock) {
        try {
            long stamp = stampedLock.tryOptimisticRead();
            log.info("Optimistic Read " + stamp);
            a = 11; //Writing something
            Thread.sleep(5000L); //Some time taking functionality is being executed here. Replicating with Thread/.sleep() to make the thread go into TimedWait state.
            if (stampedLock.validate(stamp)) {
                log.info("Update a value successfully");
            } else {
                log.info("Rollback the changes or Do some other functionality based on system's requirement");
                a = 10;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Consider mu code int his method is criticle and want to have a writelock .
    public void consumer(StampedLock readWriteLock) {
        long stamp = readWriteLock.writeLock();
        try {
            log.info("Write Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = false;
        } finally {
            readWriteLock.unlockWrite(stamp);
            log.info("Write Lock release by : " + Thread.currentThread().getName());
        }
    }
}
