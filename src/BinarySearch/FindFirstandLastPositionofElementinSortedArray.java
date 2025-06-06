package BinarySearch;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 6;
        int first = first(arr,target,0,arr.length-1);
        int last = last(arr,target,0,arr.length-1);
        System.out.println(first + " , " + last);
    }

    static int first(int arr[], int target, int low, int high){
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            } else if(arr[mid] < target){
                low = mid + 1;
            } else high = mid - 1;
        }

        return ans;
    }
    static int last(int arr[], int target, int low, int high){
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            } else if(arr[mid] < target){
                low = mid + 1;
            } else high = mid - 1;
        }

        return ans;
    }
}
