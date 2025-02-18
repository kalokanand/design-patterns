package thread.interthread;

public class InterThreadCom {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        MyProducer producer = new MyProducer(queue);
        MyConsumer consumer = new MyConsumer(queue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();


    }

}
