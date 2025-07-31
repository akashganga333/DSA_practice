package String;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//        Example 1:
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//        Input: s = "rat", t = "car"
//        Output: false

// Strings are anagram if they have same number of characters
public class ValidAnagram {
    public static void main(String[] args){
        String s1 = "anagram", s2 = "nagaram";
        System.out.println(isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1, String s2){
        int[] arr1 = new int[127];
        int[] arr2 = new int[127];
        for(int i = 0;i<s1.length();i++){
            arr1[s1.charAt(i)]++;
        }
        for(int i = 0;i<s2.length();i++){
            arr2[s2.charAt(i)]++;
        }
        for(int i = 46;i<127;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
