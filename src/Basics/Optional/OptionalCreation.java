package Basics.Optional;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String val = "value";
        Optional<String> optional = Optional.of(val);

        //empty
        Optional<Integer> empty = Optional.empty();

        //nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyNullable = Optional.ofNullable(null);
    }
}
