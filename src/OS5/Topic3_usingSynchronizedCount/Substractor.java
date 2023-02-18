package OS5.Topic3_usingSynchronizedCount;

public class Substractor implements Runnable {
    private Count count;
    public Substractor(Count c){
        this.count = c;
    }
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            synchronized (count) {
                count.addValue(-i);
            }
        }
    }
}
