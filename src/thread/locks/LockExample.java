package thread.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {
        lockBasics();
    }

    public static void lockBasics() {
        Lock lock = new ReentrantLock(true);

        Runnable runnable = () -> lockSleepUnlock(lock, 1000);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void lockSleepUnlock(Lock lock, int sleep){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "hold the lock");
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }


}
