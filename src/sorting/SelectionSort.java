package sorting;

import java.util.Arrays;

// We select the minimum element in the array and place from start
// time complexity - n(n+1)/2 - n square
public class SelectionSort {


    public static void selectionSort(int[] arr) {
        int len = arr.length-1;
        for( int i = 0 ; i < len ; i++){
            int minIndex = i;
            for(int j=i+1;j<=len;j++){
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,1};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
