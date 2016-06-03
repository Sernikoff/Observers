import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class GazetyonkaLauncher{
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();

        Jurnal murzilka = new Jurnal(s1, s2);

        Newspaper pravda = new Newspaper(s1, s2, s3);
    }
}
