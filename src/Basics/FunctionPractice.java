package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {

        List<String> list = List.of("Kit","kat","phat");

        //Function<String,Integer> function = s->s.length();
        Function<String,Integer> function = String :: length;

        List<Integer> newList = map(list,function);
        System.out.println(newList);
    }

    private static <T,R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for(T l:list)
            newList.add(function.apply(l));
        return newList;
    }
}
