package Arrays;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,2,2,1,0};

        // Need to solve using DNF algorithm using 3 pointers
        // from 0 - low-1 ,  all 0s
        // from low - mid-1 , all 1s
        // from mid - high, all unsorted part which need to be sorted
        // from high - len-1, all 2s
        int low = 0, mid = 0;
        int high = arr.length -1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid] == 1) mid++;
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
        }

        for(int num :arr){
            System.out.print(num+" ");
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
