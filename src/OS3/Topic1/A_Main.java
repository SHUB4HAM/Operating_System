package OS3.Topic1;

public class A_Main {
    public static void main(String[] args){
        System.out.println("STARTINGGGG");
        for(int i=1; i<=100; i++){
            A_Number1To100 obj = new A_Number1To100(i);
            Thread t = new Thread(obj);
            t.start();
        }
    }
}
