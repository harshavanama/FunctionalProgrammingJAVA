package Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> streamIntegers = list.stream();

        Map<Integer,String> map = Map.of(1, "One", 2,"Two",3,"Three",4,"four");
        Stream<Map.Entry<Integer, String>> entryMap = map.entrySet().stream();
        entryMap.forEach(System.out::println);
        Stream<String> valuesMap = map.values().stream();
        valuesMap.forEach(System.out::println);


        //2. of() Stream class

        Stream<String> streamStrings = Stream.of("Hey! ","Happy", "Thanksgiving");

        //3. stream() of Arrays Class

        Integer[] integerArr = {3,5,7,89,9};
        Stream<Integer> stream = Arrays.stream(integerArr);

        int[] intArr = {3,5,7,89,9};
        IntStream stream2 = Arrays.stream(intArr);

        //4. builder() of Stream class.

        Stream.Builder<Integer> builder = Stream.builder();

        builder.add(1);

        //code

        //condition

        builder.add(4);

        Stream<Integer> build = builder.build();

        build.forEach(System.out::println);


    }
}
