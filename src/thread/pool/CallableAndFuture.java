package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futures = new ArrayList<>();
        for(int i=0; i<100; i++){
            futures.add(service.submit(()->new Random().nextInt(100)));
        }
        futures.stream().forEach(future -> {
            try {
                System.out.println(future.get(1, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
