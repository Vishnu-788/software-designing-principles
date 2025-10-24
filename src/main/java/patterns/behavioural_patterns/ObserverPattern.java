package patterns.behavioural_patterns;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyUpdate(Message e);
}

class Publisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer o){
        observers.add(o);
    }

    @Override
    public void remove(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m){
        for(Observer o: observers){
            o.update(m);
        }
    }
}

interface Observer {
    public void update(Message m);
}

class Subscriber1 implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Subscriber1: " + m.getContent());
    }
}

class Subscriber2 implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Subscriber1: " + m.getContent());
    }
}

class Message {
    private String content;
    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        Publisher p = new Publisher();
        p.add(s1);
        p.add(s2);
        p.notifyUpdate(new Message("Hello world"));
        p.remove(s2);
        p.notifyUpdate(new Message("Hello vishnu"));
    }
}
