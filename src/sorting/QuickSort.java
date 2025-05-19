package sorting;


// time : O(nlogn) space: O(1)
public class QuickSort {
    public static void main(String[] args) {
         int arr[] = {4,10,3,6,2,1,9};
         quickSort(arr,0,arr.length-1);
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low< high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
