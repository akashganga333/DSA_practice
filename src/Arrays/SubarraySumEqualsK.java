package Arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//Input: nums = [1,2,3], k = 3
//Output: 2
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int x = preSum - k;
            count+=map.getOrDefault(x,0);
            map.put(preSum,map.getOrDefault(preSum,0) + 1);
        }
        System.out.println(count);
    }
}
