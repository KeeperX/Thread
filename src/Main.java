/**
 * Created by Admin on 15.08.2016.
 */
public class Main {

    public static void main(String[] args)
    {
    Thread t1 = new Thread(new Hevy("Поток1"));
        Thread t2 = new Thread(new Hevy("Поток2"));
        Thread t3 = new Thread(new Hevy("Поток3"));

       t1.start();
        t2.start();
        t3.start();

    }
}
