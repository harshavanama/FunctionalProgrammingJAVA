package Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        list.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        list.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        list.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        list.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        OptionalDouble average = list.stream()
                .mapToDouble(book -> book.getRating())
                .average();

        System.out.println(average.getAsDouble());

        IntStream intStream = IntStream.of(2,3,45,34);

        Stream<Integer> boxedInts = intStream.boxed();

        OptionalInt max = IntStream.of()
                .max();
        System.out.println(max);

        IntSummaryStatistics intSummaryStatistics =  IntStream.of(34,254,33,23,2,-1)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
