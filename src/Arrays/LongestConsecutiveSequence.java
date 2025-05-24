package Arrays;

import java.util.HashSet;
import java.util.Set;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);

        int maxCount = 0;
        for(int i: set){
            // check if this is the first element in series, so we will check further from it.
            if(!set.contains(i-1)){
                int count = 1;
                int x = i+1;
                while(set.contains(x++)) count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}
