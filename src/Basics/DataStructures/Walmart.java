package Basics.DataStructures;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Walmart {
    public static void main(String[] args) {
     List<Integer> list = List.of(1,2,2,1);
        System.out.println(pairCount(list, 2));
    }

    public static int pairCount(List<Integer> list, int target ){
        int count = 0,n = list.size();
//            for(int i = 0; i < list.size(); i ++){
//                for(int j = i+1; j< list.size(); j++){
//                }
//                    if(list.get(i) + list.get(j) == target)
//                        count++;
//            }
        Map<Integer,Integer> hMap = new LinkedHashMap<>();
//        for(int i :list){
//            if(!hMap.containsKey(i))
//            hMap.put( i, 0);
//            else
//                hMap.put(i , hMap.get(i)+1);
//        }
//        list.forEach(i -> hMap.put(i,hMap.containsKey(i) ? hMap.get(i)+1 : 0));
//        return count;
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hMap.containsKey(list.get(i)))
                hMap.put(list.get(i), 0);

            hMap.put(list.get(i), hMap.get(list.get(i)) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hMap.get(target - list.get(i)) != null)
                twice_count += hMap.get(target - list.get(i));

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (target - list.get(i) == list.get(i))
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }
}
