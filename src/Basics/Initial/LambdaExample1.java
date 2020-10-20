package Basics.Initial;

public class LambdaExample1 {
    public static void  main(String args[]){
 //       MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(() -> System.out.println("Thread Executed!"));
        t1.start();
    }
}
