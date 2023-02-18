package OS5.Topic_4_SyncMethod;

public class Count {
    int value = 0;
    public synchronized void addValue(int val){
        this.value += val;
    }
    public int getValue(){
        return value;
    }
}
