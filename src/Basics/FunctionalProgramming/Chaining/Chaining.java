package Basics.FunctionalProgramming.Chaining;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Consumer<String> c1 = s-> System.out.println(s);
        Consumer<String> c2 = s-> System.out.println(s);

        c1.accept("Hey1");
        c2.accept("Hey2");

        Consumer<String> c3 = s->{
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("hey3");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("Hey4");

        Function<Integer, Integer> f1 = f->f+2;
        Function<Integer, Integer> f2 = f->f*2;

        Function<Integer, Integer> f3 = f1.andThen(f2);

        System.out.println(f3.apply(20));

    }
}
