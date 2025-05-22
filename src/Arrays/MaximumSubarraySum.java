package Arrays;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // Kadane Algorithm
        int sum = 0, maxSum = Integer.MIN_VALUE, start = 0, startIndex = 0, endIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) start = i;
            sum += arr[i];
            if(sum>maxSum){
                startIndex = start;
                endIndex = i;
            }
            maxSum = Math.max(maxSum, sum);
            if(sum<0) sum = 0;
        }
        // print max sum of subarray
        System.out.println(maxSum);
        // print the maximum sum subarray
        for(int i = startIndex; i <= endIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
