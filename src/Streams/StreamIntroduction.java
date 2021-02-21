package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {
    public static void main(String[] args) {

        List<Book> books= new ArrayList<>();
//        List<Book> popularHorrorBooks = new ArrayList<>();
//
//        //before java 8
//        for(Book book : books){
//            if(book.getGenre().equals("Horror") && book.getRating() > 3)
//                popularHorrorBooks.add(book);
//        }

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));


        //Java 8
        //Stream Pipeline
        List<Book> popularHorrorBooks =  books.stream()
              .filter((book)-> book.getGenre().equals("Horror"))
              .filter((book)-> book.getRating() >3)
              .collect(Collectors.toList());

        popularHorrorBooks.forEach(System.out::println);

        //Filter operations example it takes a predicate so checks for condition
        System.out.println("----filter----");
        Stream.of(23,455,234,654,34,21,43,35)
                .filter(e->e%2==0)
                .forEach(System.out::println);

        //Map operations example it returns a function so operations can be performed
        System.out.println("----map----");
        Stream.of(1,2,3,4,5)
                .map(e->e*5)
                .forEach(System.out::println);

        //Reduce
        int sum = Stream.of(1,2,3,4,5)
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum - " + sum);

    }
}
