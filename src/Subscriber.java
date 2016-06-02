
public class Subscriber implements Observer{

    public void update(Pressa press) {
        System.out.println(this.toString()+" notify from "+ press.toString());
    }
}
