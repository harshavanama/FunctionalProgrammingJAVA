package DesignPatterns.FactoryMethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Flooring flooring = FlooringFactory.getFlooring(-1,28);
        flooring.installation();
    }
}
