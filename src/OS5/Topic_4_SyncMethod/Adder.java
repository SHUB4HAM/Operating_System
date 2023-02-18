package OS5.Topic_4_SyncMethod;

public class Adder implements Runnable{
    private Count count;
    public Adder(Count c){
        count = c;
    }
    @Override
    public void run(){
        for(int i=1; i<=1000; i++){
            count.addValue(i);
        }
    }
}
