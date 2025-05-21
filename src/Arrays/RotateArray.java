package Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 3;

        rotateArrayWithK(arr,k);
    }

    private static void rotateArrayWithK(int[] arr, int k) {
        k = k % arr.length;
        swap(arr,0,arr.length-1-k);
        swap(arr,k-1,arr.length-1);
        swap(arr,0,arr.length-1);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    private static void swap(int[] arr, int low, int high) {
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
