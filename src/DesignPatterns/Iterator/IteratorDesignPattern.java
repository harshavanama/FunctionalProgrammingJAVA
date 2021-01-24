package DesignPatterns.Iterator;

public class IteratorDesignPattern {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(new Object[] {1,4,6,7,4});

        list.forEach(System.out::println);

    }
}
