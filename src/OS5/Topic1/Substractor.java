package OS5.Topic1;

public class Substractor implements Runnable {
    private Count count;
    public Substractor(Count c){
        this.count = c;
    }
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            count.addValue(-i);
        }
    }
}
