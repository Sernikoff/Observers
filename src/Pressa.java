import java.util.ArrayList;
import java.util.List;


public abstract class Pressa implements Subject{
    private List<Subscriber> subscribers;
    boolean newNumber;

    public Pressa() {
        subscribers = new ArrayList<Subscriber>();
    }

    public boolean isNewNumber() {
        return newNumber;
    }

    public void setNewNumber(boolean newNumber) {
        this.newNumber = newNumber;
    }

    @Override
    public void addObserver(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeObserver(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifyObserver() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
    }
}

