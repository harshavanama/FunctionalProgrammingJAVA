package Basics;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();
        BiFunction<String, String, String> biFunction1 = (a, b) -> a +b;

        System.out.println(biFunction1.apply("Power","Ball"));
        System.out.println(biFunction.apply("to","four"));
    }
}
