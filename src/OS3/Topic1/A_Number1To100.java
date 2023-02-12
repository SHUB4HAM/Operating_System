// print 1 to  100 by separate threads
package OS3.Topic1;

public class A_Number1To100 implements Runnable {
    private int num;

    public A_Number1To100(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num + " " + Thread.currentThread().getName());
    }
}
