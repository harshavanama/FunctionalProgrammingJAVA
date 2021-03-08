package Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/harshavanama/Documents/codebase/FunctionalProgramming/src/Collectors/EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)){

            Stream<String> words = lines.flatMap(word -> Arrays.stream(word.split(",")));

            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);

            List<Employee> employeeList = employeeStream.collect(Collectors.toList());

            List<String> employeeNames = employeeList.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.toList());
            System.out.println("-------------LIST-----------------");
            employeeNames.forEach(System.out::println);

            Set<String> employeeDesignation = employeeList.stream()
                    .map(employee -> employee.getDesignation())
                    .collect(Collectors.toSet());
            System.out.println("-------------SET-----------------");
            employeeDesignation.forEach(System.out::println);

            TreeSet<Employee> employeeSorted = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet::new));
            System.out.println("-------------TREE-----------------");
            employeeSorted.forEach(System.out::println);

            Map<Integer, String> getNameById = employeeList.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
            System.out.println("-------------MAP-----------------");
            System.out.println(getNameById);

            Map<Boolean, List<Employee>> sortByGender = employeeList.stream()
                    .collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));
            System.out.println("-------------GENDERMAP-----------------");
            System.out.println(sortByGender);

            System.out.println("-------------FEMALES-----------------");
            sortByGender.get(false).forEach(System.out::println);
            System.out.println("-------------MALES-----------------");
            sortByGender.get(true).forEach(System.out::println);

            Map<String, List<Employee>> getByDesignation = employeeList.stream()
                    .collect(Collectors.groupingBy(e -> e.getDesignation()));
            System.out.println("-------------DESIGNATIONMAP-----------------");
            System.out.println(getByDesignation);

            System.out.println("-------------MALEDEVELOPERS-----------------");
            Stream<Employee> developer = getByDesignation.get("Developer").stream().filter(e -> (e.getGender()=='M'));
            developer.forEach(System.out::println);
            int i =1;
            String employeesNames = employeeList.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.joining(", ")).concat(".");
            System.out.println("All name of the employees - " + employeesNames);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
