package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        UnaryOperator<Integer> unaryOperator = i -> i*10;

        List<Integer> newList = mapper(list,unaryOperator);
        System.out.println(newList);
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> unaryOperator) {
        List<T> newList = new ArrayList<T>();

        for(T l : list)
            newList.add(unaryOperator.apply(l));
        return newList;
    }
}
