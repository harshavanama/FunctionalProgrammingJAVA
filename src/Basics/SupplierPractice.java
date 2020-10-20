package Basics;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("Hello");
        System.out.println(supplier.get());

        Supplier<Double> supplier1 = () -> Math.random()*10;
        System.out.println(supplier1.get());

        Supplier<Double> supplier2 = Math :: random;
        System.out.println(supplier2.get());
    }
}
