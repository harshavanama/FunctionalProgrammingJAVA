package Basics;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("");
        list.add("Hey");
        list.add("");
        list.add("HelloHey");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList1 = filterList(list, predicate);

        Predicate<String> predicate1 = s -> s.contains("Hello");
        List<String> newList = filterList(list, predicate1);

        List<Integer> integers = List.of(1,2,3,4,5,6);
        Predicate<Integer> predicate2 = s-> s%2 ==0;
        List<Integer> filteredIntegers = filterList(integers,predicate2);

        System.out.println(newList);
        System.out.println(newList1);
        System.out.println(list );
        System.out.println(filteredIntegers);



    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for(T string:list){
            if(predicate.test(string)){
                newList.add(string);
            }
        }
        return newList;
    }
}
