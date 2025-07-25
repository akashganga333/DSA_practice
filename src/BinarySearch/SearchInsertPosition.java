package BinarySearch;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

public class SearchInsertPosition {
    public static void main(String[] args){
        // this question is lower bound with some tweak.
        int[] nums ={1,3,5,6};
        int target = 2;
        int low = 0, high = nums.length-1;
        int res = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                res = mid;
                high = mid-1;
            }
            if(nums[mid]<target) low = mid+1;
        }
        System.out.println(res);
    }
}
