package Arrays;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3,2,3,2,3,1,1,1,2,1};
        // solve using Moore’s Voting Algorithm
        int maxElement = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == maxElement) count++;
            else count--;
            if(count == 0 ){
                maxElement = arr[i];
                count++;
            }
        }
        System.out.println(maxElement);
    }
}
