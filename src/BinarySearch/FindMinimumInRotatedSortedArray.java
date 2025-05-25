package BinarySearch;

//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//[4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.
//Example 1:
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//Example 2:
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                // get min from left sorted part
                min = Math.min(min,arr[low]);
                //move to right part
                low = mid+1;
            }
            else if(arr[mid]<=arr[high]){
                // get min from right sorted part
                min = Math.min(min,arr[mid]);
                //move to left part
                high =mid-1;
            }
        }
        System.out.println(min);
    }
}
