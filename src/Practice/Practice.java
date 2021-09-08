package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String args[]) {

    }
    public static int degreeOfArray(List<Integer> arr){

        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i : arr){
            if(!hMap.containsKey(i))
                hMap.put(i,1);
            else
                hMap.put(i,hMap.get(i) + 1);
        }
        int degree = 0;
        for(int i : hMap.values()){
            if(i > degree)
                degree = i;
        }

        List<Integer> keys = new ArrayList<>();
        for( Map.Entry<Integer, Integer> entry : hMap.entrySet()){
            if(degree == entry.getValue()){
                keys.add(entry.getKey());
            }
        }
        int shortestPath = arr.size();
        for(int i : keys){
            int path = arr.lastIndexOf(i) - arr.indexOf(i);
            if(path <= shortestPath)
                shortestPath = path;
        }
        return shortestPath;
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hMap = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++)
            hMap.put(nums[i],i);

        for(int i = 0 ; i < nums.length; i ++){
            if(hMap.containsKey(target - nums[i]))
                return new int[]{i,hMap.get(target - nums[i])};
        }
        return new int[]{};
    }
}

