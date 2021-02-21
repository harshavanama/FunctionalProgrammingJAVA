package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CustomSpliterator {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/harshavanama/Documents/codebase/FunctionalProgramming/src/Streams/Books.txt");
        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> spliterator = new BookSpliterator(baseSpliterator);

            Stream<Book> stream = StreamSupport.stream(spliterator, false);
            stream.forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
