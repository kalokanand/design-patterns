package thread.interthread;

public class MyProducer implements Runnable {

    private MyQueue queue;

    public MyProducer(MyQueue queue){
        this.queue = queue;

    }

    public void run(){
        int i = 0;
        while (true){
           queue.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
