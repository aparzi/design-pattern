package observer.application;

public interface Observable {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void notifyObservers(Object arg);

}
