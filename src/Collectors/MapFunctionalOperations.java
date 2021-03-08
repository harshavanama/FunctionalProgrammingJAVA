package Collectors;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapFunctionalOperations {
    public static void main(String[] args) {
        Map<String,String> contacts = new HashMap<>();
        contacts.put("1237589020", "John");
        contacts.put("1237009020", "John");
        contacts.put("7890291111", "Neal");
        contacts.put("2647210290", "Raju");
        contacts.put("9999999999", "Peter");
        contacts.put("9081234567", "Neha");

        //TraversalImperative
        for(Map.Entry<String,String> entry : contacts.entrySet())
            System.out.println(entry.getKey() + "-" + entry.getValue());
        System.out.println("--------------------");
        //Traversal
        contacts.forEach((k,v)-> System.out.println(k + "-" + v));
        System.out.println("--------------------");
        //Filter
        contacts.entrySet().stream()
                .filter(contact->"John".equals(contact.getValue()))
                .forEach(System.out::println);
        contacts.entrySet().stream()
                .filter(contact->"John".equals(contact.getValue()))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println("--------------------");
        //Map
        String names = contacts.entrySet().stream()
                .map(e -> e.getValue())
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(names);
        System.out.println("--------------------");
        //Sorting
        LinkedHashMap<String, String> linkedHashMapSort = contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1, LinkedHashMap::new));
        linkedHashMapSort.forEach((k,v)-> System.out.println(k+"-"+v));
        System.out.println("--------------------");
        //Reduce
        Map<String,Double> marks = new HashMap<>();
        marks.put("Science",30.0);
        marks.put("Maths",99.0);
        marks.put("Social",69.0);

        OptionalDouble average = marks.values().stream()
                .mapToDouble(mark -> mark)
                .average();
        System.out.println("Average - " + average.getAsDouble());

    }
}
