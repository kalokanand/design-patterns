package thread;

public class MyThread extends Thread {

    public void run(){
        System.out.println("Thread started");
    }

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

    }
}
