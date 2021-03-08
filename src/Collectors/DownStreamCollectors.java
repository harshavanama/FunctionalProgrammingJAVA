package Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownStreamCollectors {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/harshavanama/Documents/codebase/FunctionalProgramming/src/Collectors/EmployeeData.txt");
        Stream<String> lines = Files.lines(path);

        Spliterator<String> wordSpliterator = lines.flatMap(line -> Arrays.stream(line.split(",")))
                                                    .spliterator();

        Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

        List<Employee> employeeList = StreamSupport.stream(employeeSpliterator, false)
                                                    .collect(Collectors.toList());

        Map<String, Long> countByDesignation = employeeList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDesignation(),Collectors.counting())
                );
        System.out.println(countByDesignation);

        Map<String, Double> fundDistribution = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e.getDesignation(),
                                Collectors.summingDouble(e -> e.getSalary())));
        System.out.println(fundDistribution);

        Map<String, Optional<Employee>> employeeMaxSalary = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e.getDesignation(),
                                Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))
                        ));
        System.out.println(employeeMaxSalary);

        Map<String, Optional<Double>> designationMaxSalary = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e.getDesignation(),
                                Collectors.mapping(e -> e.getSalary(), Collectors.maxBy(Comparator.comparing(s -> s)
                                ))));

        IntStream.iterate(5,i->i+1).forEach(System.out::println);

        System.out.println(designationMaxSalary);
    }
}
