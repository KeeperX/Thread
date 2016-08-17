import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.util.Random;

/**
 * Created by Admin on 15.08.2016.
 */
public class Hevy implements Runnable{
    int time;
    String name;
    Random rnd= new Random();
    public  Hevy(String name)
    {
      this.name=name;
        this.time = rnd.nextInt(999);
    }
    public void run() {
       System.out.printf("Запустился поток %s \n",name);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Поток %s завершился через %s milisc\n",name,time );
    }
}
