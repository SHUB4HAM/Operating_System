package OS5.Topic2_usingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Adder(c, lock));
        Thread t2 = new Thread(new Substractor(c, lock));

        t1.start();
        t2.start();

        t1.join(); // waits for the thread to complete -> code will go to the next line when t1 completed
        t2.join();
        System.out.println(c.value);
    }
}
