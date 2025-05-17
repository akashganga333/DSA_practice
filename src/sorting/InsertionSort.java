package sorting;

import java.util.Arrays;

// grab/insert an element and place it in its correct position
// time complexity -> average - n square, best - n
public class InsertionSort {

    public static void insertionSort(int[] arr){

        int len = arr.length;
        for(int i = 0; i < len ; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,1};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
