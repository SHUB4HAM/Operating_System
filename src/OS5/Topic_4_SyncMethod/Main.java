package OS5.Topic_4_SyncMethod;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Thread t1 = new Thread(new Adder(c));
        Thread t2 = new Thread(new Substractor(c));

        t1.start();
        t2.start();

        t1.join(); // waits for the thread to complete -> code will go to the next line when t1 completed
        t2.join();
        System.out.println(c.value);
    }
}
