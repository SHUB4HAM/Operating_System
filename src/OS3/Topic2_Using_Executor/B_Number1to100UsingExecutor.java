package OS3.Topic2_Using_Executor;

public class B_Number1to100UsingExecutor implements Runnable {
    private int num;

    public B_Number1to100UsingExecutor(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num + " " + Thread.currentThread().getName());
    }
}
