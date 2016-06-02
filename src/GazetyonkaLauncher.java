import java.util.Observable;

public class GazetyonkaLauncher extends Observable {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();

        Jurnal murzilka = new Jurnal();

        murzilka.addObserver(s1);
        murzilka.addObserver(s3);

        Newspaper pravda = new Newspaper();

        pravda.addObserver(s1);
        pravda.addObserver(s2);
        pravda.addObserver(s3);


        if(murzilka.isNewNumber()){
            murzilka.notifyObserver();
         }
        if(pravda.isNewNumber()){
            pravda.notifyObserver();
        }
    }
}
