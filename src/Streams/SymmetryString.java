package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SymmetryString {
    public static void main(String[] args) {
   //     String input = "({[]}())";
        System.out.println(isSymmetric("()"));
        System.out.println(isSymmetric("({[]}())"));
        System.out.println(isSymmetric("{}()"));
        System.out.println(isSymmetric("[()]"));
        System.out.println(isSymmetric("{){})"));
        System.out.println(isSymmetric("[(])"));
        List<String> list = List.of("sdf","sdf");
        }

    public static boolean isSymmetric(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '{' || c == '(' || c == '[') stack.push(c);

            if (!stack.isEmpty()) {

                if ((c == '}' && stack.peek() == '{')) stack.pop();
                if ((c == ')' && stack.peek() == '(')) stack.pop();
                if ((c == ']' && stack.peek() == '[')) stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
