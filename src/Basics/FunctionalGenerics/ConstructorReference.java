package Basics.FunctionalGenerics;

import java.io.Serializable;
import java.util.function.Function;

public class ConstructorReference implements Serializable {
    public static void main(String[] args) {
       // Function<Runnable,Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable,Thread> threadGenerator = Thread :: new;

        Runnable task1 = () -> System.out.println("Task 1 is executed");
        Runnable task2 = () -> System.out.println("Task 2 is executed");

        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread1.start();
        thread2.start();

        threadGenerator
                .apply(()-> System.out.println("Task 3 is executed"))
                .start();
    }
}
