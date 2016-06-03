import java.util.Observable;

public class Newspaper extends Observable {
    Newspaper(Subscriber... s){
        for (Subscriber elem: s){
            addObserver(elem);
        }
        setChanged();
        notifyObservers();
    }
}
