package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class New {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,4,5,6);
        List l1 = l.stream().filter(e->e>5).collect(Collectors.toList());

        Stream.of(1,4,5,6).filter(e->e<5).forEach(System.out::println);

        String s ="reverse";
        //char[] c = s.toCharArray();

        for(int i=0, j=s.length()-1; i<s.length(); i++,j--) {

        }

    }
}
