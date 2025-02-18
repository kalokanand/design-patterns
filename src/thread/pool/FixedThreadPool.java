package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        //Use Blocking queue
        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i=0; i<100; i++){
            System.out.println(service.submit(()-> System.out.println(Thread.currentThread().getName())));
        }

        System.out.println(Thread.currentThread().getName());
    }
}
