package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for(int i=0; i<100; i++){
            service.execute(()-> System.out.println(Thread.currentThread().getName()));
        }
    }
}
