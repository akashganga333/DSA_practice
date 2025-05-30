package BinarySearch;

//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        int ans = binarySearchInRotatedSortedArray(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int binarySearchInRotatedSortedArray(int[] arr, int target, int low,int high) {
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else{
                if(arr[mid]<=target && target<=arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
