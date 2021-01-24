package DesignPatterns.Iterator;

import Basics.FunctionalProgramming.Chaining.Consumer;

public class MyArrayList {
    Object [] elements = new Object[5];

    public MyArrayList(Object [] elements){
        this.elements = elements;
    }

    public void forEach(Consumer<Object> action){
        for(int i =0; i < elements.length; i++){
            action.accept(elements[i]);
        }
    }
}