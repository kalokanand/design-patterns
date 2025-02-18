package thread.interthread;

public class MyQueue {

    int num;
    boolean valueSet;

    public synchronized void put(int num){
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("put "+num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get(){
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("get "+num);
        valueSet = false;
        notify();
    }
}
