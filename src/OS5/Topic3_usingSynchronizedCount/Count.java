package OS5.Topic3_usingSynchronizedCount;

public class Count {
    int value = 0;
    public void addValue(int val){
        this.value += val;
    }
    public int getValue(){
        return value;
    }
}
