package Arrays;

// remove duplicate from the sorted array and return number on unique elements
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,5,5};

        int i = 0,j = 1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        System.out.println("Number of unique elements is: "+(i+1));
        for (int k = 0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
