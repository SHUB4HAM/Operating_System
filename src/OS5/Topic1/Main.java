package OS5.Topic1;

public class Main {
    public static void main(String args){
        Count c = new Count();
        Thread t1 = new Thread(new Adder(c));
        Thread t2 = new Thread(new Substractor(c));

        System.out.println(c.getValue());
    }
}
