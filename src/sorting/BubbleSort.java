package sorting;


import java.util.Arrays;

// Push max element to last  - so elements are sorted from last
// we do adjacent swap
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int len = arr.length;
         for(int i = 0 ;i < len-1 ; i++){
             boolean flag = false;
             for(int j = 0 ; j < len-1-i ; j++){
                 if(arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     flag = true;
                 }
             }
             if(flag == false){
                 break;
             }
         }
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,1};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
