package Basics.Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class MoreOperations {
    public static void main(String[] args) {

        //ifPresent
        Optional<String> optional = Optional.of("Value");

        optional.ifPresent(System.out :: println);
        optional.ifPresent(val ->System.out.println("The value is " + val));

        //ifPresentOrElse
        optional.ifPresentOrElse(System.out :: println, () -> System.out.println("Value is absent"));

        //stream
        Stream<String> stream = optional.stream();
        optional.stream().forEach(System.out :: println);

        //or
        optional.or(() -> Optional.of("New Value"))
                .ifPresent(System.out :: println);
        Optional.empty().or(() -> optional.of("New Value"))
                .ifPresentOrElse(System.out :: println, () -> System.out.println("why"));

        //equals - 2 conditions needs to be satisfied
        // 1 - it needs to be optional type
        // 2 - either both are empty or both optional values are equal.
        System.out.println(optional.equals(Optional.of("Value")));

        //hashcode
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());

    }
}
