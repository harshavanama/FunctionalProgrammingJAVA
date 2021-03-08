package Collectors;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {
    public static void main(String[] args) {

        Set<Integer> set = Set.of(34,23,6,234,7,33);

        //Traversal
        set.forEach(System.out::println);
        System.out.println("--------------------");
        //Filter
        set.stream()
                .filter(e->e%2==0)
                .forEach(System.out::println);
        System.out.println("--------------------");
        //Sorting
        set.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------");
        //Map
        Set<Double> hashSet = set.stream()
                .map(e -> Double.valueOf(e))
                .collect(Collectors.toSet());
        hashSet.forEach(System.out::println);
        System.out.println("---------TreeSet below-----------");
        //TreeSet
        TreeSet<Integer> treeSet = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);
        System.out.println("--------------------");
        //Reduce
        Optional<Integer> reduceSum = set.stream()
                .reduce((a, b) -> a + b);
        System.out.println(reduceSum);

    }
}
