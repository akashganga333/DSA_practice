package BinarySearch;
//A peak element is an element that is strictly greater than its neighbors.
//        Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//        You must write an algorithm that runs in O(log n) time.
//
//        Example 1:
//        Input: nums = [1,2,3,1]
//        Output: 2
//        Explanation: 3 is a peak element and your function should return the index number 2.
//        Example 2:
//        Input: nums = [1,2,1,3,5,6,4]
//        Output: 5
//        Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
public class FindPeakElement {
    public static void main(String[] args){
        int arr[]={1,2,3,1};
        int ans = findPeak(arr, arr.length);
        System.out.println(ans);

    }
    private static int findPeak(int arr[], int n){
        if(n == 1) return 0 ;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low = 1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
