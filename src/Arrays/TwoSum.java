package Arrays;

import java.util.HashMap;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 18;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                System.out.println(i+" "+map.get(target-arr[i]));
            }
            map.put(arr[i],i);
        }
    }
}
