package Basics;
import java.util.*;

public class test1 {
    public static void main(String[] args) {

        int[] arr = new int[] {3, 2, -2, 5, -3};
 //       System.out.println(solution(arr));

        List<Integer> permutation = new ArrayList<>();
        permutation.add(4);
        permutation.add(3);
        permutation.add(5);
        permutation.add(1);
        permutation.add(2);
        List<Integer> permutationSol = permutationEquation(permutation);
        permutationSol.forEach(number -> System.out.println(number));

    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        Set<Integer> hSet = new LinkedHashSet<>();

        for(int a: A){
            hSet.add(a);
        }

        Iterator<Integer> itr = hSet.iterator();


        for(int i = A.length-1; i >= 0; i--){
            while(itr.hasNext() && itr.next()<0){
                if(A[i] + itr.next() == 0)
                    return A[i];
            }
        }
        return 0;
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> solution = new ArrayList<>();

        Map<Integer,Integer> lMap = new LinkedHashMap<>();
        for(int i = 0; i < p.size(); i++)
            lMap.put(i+1,p.get(i));

        List<Integer> helper = new ArrayList<>();
        for (int i = 1; i < lMap.size(); i++) {
        for(Map.Entry<Integer,Integer> entry : lMap.entrySet()) {
            
            }
        }

        for(int helpValue : helper) {
            for (Map.Entry<Integer, Integer> entry : lMap.entrySet()) {
                if (entry.getValue() == helpValue) {
                    solution.add(entry.getKey());
                }
            }
        }
        return solution;
    }
}
