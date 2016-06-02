

public interface Subject {

    public void addObserver(Subscriber o);
    public void removeObserver(Subscriber o);
    public void notifyObserver();
}
