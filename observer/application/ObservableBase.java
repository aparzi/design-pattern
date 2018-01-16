package observer.application;

import java.util.LinkedList;
import java.util.List;

public abstract class ObservableBase implements Observable {

    protected List<Observer> observers;

    public ObservableBase() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object arg) {
        observers.forEach(observer -> observer.update(this, arg));
    }
}
