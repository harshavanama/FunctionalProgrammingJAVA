package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperation {
    public static void main(String[] args) {

        Stream<String> a = Stream.of("Hello" , "there");
        Stream<String> b = Stream.of("How","you?");

        Stream<Stream<String>> c = Stream.of(a,b);

        Stream<String> flatMap = Stream.of(a,b)
                .flatMap(e->e);

        Path p = Paths.get("/Users/harshavanama/Downloads/ImperativeVsDeclarative.java.txt");
        try (Stream<String> notebook = Files.lines(p);){
            List<String> collectionWords = notebook
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .collect(Collectors.toList());

            collectionWords.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
