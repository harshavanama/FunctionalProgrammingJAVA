package Practice;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Practice {
    public static void main(String args[]) {
//        int i = 0x000F;
//        int j = 0x2222;
//        System.out.println(i & j);

//        Float f1 = new Float("3.0");
//        int x = f1.intValue();
//        byte b = f1.byteValue();
//        double d = f1.doubleValue();
//        System.out.println(x+b+d);
//        String line = "Add|Dog \n" +
//                "Remove|Dog \n"+
//                "Get|Cat";
//        String[] split = line.split("\\||\\n");
//        System.out.println(split.length);
//        Set<? extends Serializable> set1 = Stream.of("HEllo", "Hey").map(String::toUpperCase).collect(Collectors.toSet());
//        System.out.println(set1);
//        LinkedHashSet set = new LinkedHashSet();
//        set.addAll(Arrays.asList("Hi", "Hello", 9.0));
//        set.forEach(System.out::println);
//        Stream<? extends Serializable> hello = Stream.of("Hello", 9.0);
//        hello.forEach(System.out::println);
//        List<Integer> list = List.of(1,2,3,4,5);
//        System.out.println(rotLeft(list,7));

        //       long l = 123456789012345678901 + 12345678;

        int[] intArray = new int[]{1, 1, 1};
        Map<Integer,Integer> hMap = new HashMap<>();
//        System.out.println(solution(intArray));

//        System.out.println(helper("r#a#n#k#"));
//        System.out.println(helper("###"));
        String S = "WWW";

        int[] insertion = new int[]{123, 1, 3};
//        insertionSort(insertion);
        Arrays.sort(insertion);
        System.out.println(rotateString("abcde","cdeab"));
        System.out.println(allPossibleStringsWithOneLessChar(S) + " count of different strings");

    }

    public static int degreeOfArray(List<Integer> arr) {

        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i : arr) {
            if (!hMap.containsKey(i))
                hMap.put(i, 1);
            else
                hMap.put(i, hMap.get(i) + 1);
        }
        int degree = 0;
        for (int i : hMap.values()) {
            if (i > degree)
                degree = i;
        }

        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (degree == entry.getValue()) {
                keys.add(entry.getKey());
            }
        }
        int shortestPath = arr.size();
        for (int i : keys) {
            int path = arr.lastIndexOf(i) - arr.indexOf(i);
            if (path <= shortestPath)
                shortestPath = path;
        }
        return shortestPath;
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            hMap.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(target - nums[i]))
                return new int[]{i, hMap.get(target - nums[i])};
        }
        return new int[]{};
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maximum = -1;

        for (char c : word.toCharArray()) {
            int value = c - 97;
            if (h.get(value) > maximum)
                maximum = h.get(value);
        }
        return maximum * word.length();
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        d = d % a.size();
        List<Integer> newList = new ArrayList<>();
        for (int i = d; i < a.size(); i++) {
            newList.add(a.get(i));
        }
        for (int i = 0; i < d; i++) {
            newList.add(a.get(i));
        }
        return newList;
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else if (!stack.isEmpty() && ((c == '}' && stack.peek() == '{')
                    || (c == ']' && stack.peek() == '[')
                    || (c == ')' && stack.peek() == '('))
            ) stack.pop();
            else
                return "NO";
        }
        if (stack.isEmpty()) return "YES";
        else
            return "NO";
    }

    //[1,4,2,8] m =3

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (hMap.containsKey(m - arr.get(i)))
                return new ArrayList<>(List.of(hMap.get(m - arr.get(i)), i + 1));
            else
                hMap.put(arr.get(i), i + 1);
        }
        return new ArrayList<>();
    }

    //[1,2,2,1[]
    public static boolean solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : A) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        Collection<Integer> values = hmap.values();
        for (int i : values)
            if (i % 2 == 1) return false;

        return true;
    }

    public static String helper(String s){
        Stack<Character> stack = new Stack();
        for(Character c : s.toCharArray()){
            if(c.equals('#')) {
                if (!stack.empty())
                    stack.pop();
            }
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(character -> sb.append(character));
        return sb.toString();
    }

    public static void insertionSort(int[] ar){
        int a; int b;
        for(a = 0, b = a + 1; b < ar.length; a++, b++){
            int temp = ar[b];
            int i = a;
            while(i >= 0 && temp < ar[i]){
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = temp;
//            for(int j = 0; j < ar.length; j++){
//            //    System.out.print(ar[j] + " ");
//            }
            System.out.print("\n");
        }
    }

    public static boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
//        if(s.length()!= goal.length())
//            return false;
//        else if (goal.equals(s))
//            return true;
//
//        int i = 0, j =1;
//        while(j < s.length()){
//            StringBuilder sb3 = new StringBuilder();
//            sb3.append(s,j,s.length());
//            sb3.append(s, i , j);
//            if(sb3.toString().equals(goal))
//                return true;
//            j++;
//        }
//        return false;
    }

    public List<Integer> majorityElement(int[] nums) {

        int size = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> answer = new ArrayList<>();
        for(int i : map.keySet()){
           if(map.get(i) > size)
            answer.add(i);
        }
        return answer;
    }

    public static int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();
        for(int candy : candyType)
            set.add(candy);

        return Math.min(candyType.length / 2, set.size());
    }

    public boolean backspaceCompare(String s, String t) {
        return backspaceCompareHelper(s).equals(backspaceCompareHelper(t));
    }
    public String backspaceCompareHelper(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c.equals('#') && !stack.empty()) stack.pop();
            else stack.push(c);
        }
        return stack.toString();
    }

    public static int allPossibleStringsWithOneLessChar(String S){
        Set<String> hSet = new HashSet<>();
        for(int i = 0 ; i < S.length(); i++){
            StringBuilder sb = new StringBuilder(S);
            sb.deleteCharAt(i);
            hSet.add(sb.toString());
        }
        return hSet.size();
    }
}
