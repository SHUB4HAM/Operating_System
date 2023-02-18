package OS5.Topic2_usingLock;

public class Count {
    int value = 0;
    public void addValue(int val){
        this.value += val;
    }
    public int getValue(){
        return value;
    }
}
