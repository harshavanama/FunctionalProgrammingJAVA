package Basics;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(43,234,65,345,635,35,5);
        Consumer<Integer> consumer = e-> System.out.println(e);

        Consumer<Integer> consumer1 = System.out :: println;

        consumer.accept(1);
        printElements(list,consumer);
        printElements(list,consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for(T l : list)
            consumer.accept(l);
        System.out.println("-----");
    }
}
