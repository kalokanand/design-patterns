package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        Runnable task = ()-> System.out.println(Thread.currentThread().getName());

        //Use Delay queue
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        service.schedule(task, 10, TimeUnit.MILLISECONDS);
        service.scheduleAtFixedRate(task, 10, 10, TimeUnit.MILLISECONDS);
        service.scheduleWithFixedDelay(task, 10, 10, TimeUnit.MILLISECONDS);

        System.out.println(Thread.currentThread().getName());
    }
}
