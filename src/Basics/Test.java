package Basics;

import java.util.*;

public class Test {
    //10,20,30,40,75,25

    public static void main(String[] args) {
        int max = 0, k = 79;

        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 75, 25);

        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("max " + max);
        int sol = 0;
        sol = k > max ? k - max : 0;
        System.out.println("Sol" + sol);
        int[] nums = new int[]{3, 2, 3};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.get(i) == null) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        int solution = 0, count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                solution = entry.getKey();
            }

        }
    }
}
