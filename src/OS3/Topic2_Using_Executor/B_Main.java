package OS3.Topic2_Using_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class B_Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++){
            if(i==50){
                System.out.println("Stop");
            }
            executorService.execute(
                    new B_Number1to100UsingExecutor(i)
            );
        }
    }
}
