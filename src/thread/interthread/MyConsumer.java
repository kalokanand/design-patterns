package thread.interthread;

public class MyConsumer implements Runnable {

    private MyQueue queue;

    public MyConsumer(MyQueue queue){
        this.queue = queue;

    }

    public void run(){
        while (true){
            queue.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
