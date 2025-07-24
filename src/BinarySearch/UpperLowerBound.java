package BinarySearch;

public class UpperLowerBound {

    // Lower bound is the smallest index such that arr[i]>=target
    private static int lowerBound(int low, int high, int arr[], int target){
        int ans = high+1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }

    // Upper Bound is the smallest index such that arr[i]>target
    private static int upperBound(int low, int high, int arr[], int target){
        int ans = high+1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }


    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,7,8,11};
        System.out.println(lowerBound(0,arr.length-1,arr,7));
        System.out.println(lowerBound(0,arr.length-1,arr,2));
        System.out.println(upperBound(0,arr.length-1,arr,7));
        System.out.println(upperBound(0,arr.length-1,arr,2));


    }
}
