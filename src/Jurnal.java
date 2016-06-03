
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;


public class Jurnal extends Observable{

    Jurnal(Subscriber... s){

        for (Subscriber elem: s){
        addObserver(elem);
        }
        setChanged();
        notifyObservers();
    }
}
