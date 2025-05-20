package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merged(arr,low,high,mid);
    }

    private static void merged(int[] arr, int low, int high, int mid) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        while(left<=mid) temp.add(arr[left++]);
        while(right<=high) temp.add(arr[right++]);
        for(int i=low;i<=high;i++) arr[i]=temp.get(i-low);
    }
}
