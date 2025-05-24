package BinarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1,22,45,66,76,90};
        int target = 90;
        int ans = binarySearch(arr,0,arr.length-1,target);
        System.out.println(ans);
    }
    static int binarySearch(int arr[], int low, int high, int target){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target>arr[mid]) return binarySearch(arr,mid+1,high,target);
        return binarySearch(arr,low,mid-1,target);
    }
}
