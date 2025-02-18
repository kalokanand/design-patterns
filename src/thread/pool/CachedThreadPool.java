package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {
        //Use SynchronousQueue - hold only one task - task ideal by 60, terminated by executor service
        ExecutorService service = Executors.newCachedThreadPool();

        for(int i=0; i<100; i++){
            service.submit(()-> System.out.println(Thread.currentThread().getName()));
        }
    }
}
