package OS5.Topic2_usingLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;
    public Adder(Count c, Lock l){
        this.count = c;
        this.lock = l;
    }
    @Override
    public void run(){
        for(int i=1; i<=1000; i++){
            lock.lock();
            count.addValue(i);
            lock.unlock();
        }
    }
}
