package design.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChanges(String title) {
        observers.stream().forEach(o->o.notified(title));
    }
}
