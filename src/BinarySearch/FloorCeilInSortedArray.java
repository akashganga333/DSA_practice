package BinarySearch;

//find floor and ceil in the given sorted array.
//floor : largest element in an array<= target.
//ceil : smallest element in an array>= target.
public class FloorCeilInSortedArray {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        System.out.println(findFloor(60,arr));
        System.out.println(findCeil(60,arr));
    }

    // this is lower bound
    private static int findCeil(int target, int[] arr) {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = arr[mid];
                high = mid-1;
            }
            else low = mid+1;
        }

        return ans;
    }

    private static int findFloor(int target, int[] arr) {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=target){
                ans = arr[mid];
                low = mid+1;
            }
            else high = mid-1;
        }

        return ans;
    }
}
