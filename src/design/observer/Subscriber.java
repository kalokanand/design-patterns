package design.observer;

public class Subscriber implements Observer {

    String subcriberName;

    public Subscriber(String subcriberName) {
        this.subcriberName = subcriberName;
    }

    @Override
    public void notified(String title) {
        System.out.println(String.format(
                "Hello %s, New video %s is uploaded by your subscribe channel",
                subcriberName, title));
    }
}
