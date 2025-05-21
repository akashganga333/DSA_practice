package Arrays;


// Find second max element in an array.
public class SecondLargestElement  {
    public static void main(String[] args) {
        int[] arr = {100,92,983,334,995,655,76,808,999,999};
        int max1 = -1, max2 = -1;
        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num>max2 && num!=max1){
                max2 = num;
            }
        }
        System.out.println("Second max in Array = "+max2);
    }
}
